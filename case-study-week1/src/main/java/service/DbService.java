package service;
import java.sql.*;
public class DbService {
    private final Connection connection;
    public DbService(Connection connection) {
        this.connection = connection;
    }

    public int createNewAccount(int acNum, double amt, String acHldNm, Date crDt, boolean status) throws SQLException {
        var sql = "insert into bank_account values (?, ?, ?, ?, ?)";
        var ps1 = connection.prepareStatement(sql); // here you are creating sql
        ps1.setInt(1, acNum);
        ps1.setDouble(2, amt);
        ps1.setString(3, acHldNm);
        ps1.setDate(4, crDt);
        ps1.setBoolean(5, status);
        var affected = ps1.executeUpdate();
        connection.commit();
        return affected;
    }

    public void printAllAccounts() throws SQLException {
        String sql = "Select * from Bank";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int acNum = rs.getInt(1);
            double amt = rs.getDouble(2);
            String acHldNm = rs.getString(3);
            Date crDt = rs.getDate(4);
            boolean status = rs.getBoolean(5);
            System.out.println("account number" + acNum);
            System.out.println("amount" + amt);
            System.out.println("account holder name" + acHldNm);
            System.out.println("create date" + crDt);
            System.out.println("status" + status);
        }
        connection.commit();
        rs.close();
    }
    public void findByAccountNum(int num) throws SQLException {
        String sql = "select * from bank_account where acc_num = ? ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1,num);

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            double amt = rs.getDouble("amt_num");

            System.out.println("amount "+ amt);

        }
        if(rs.next() == false) System.out.println("Invalid Account Number");
        connection.commit();
        rs.close();


    }



}

