import com.ani.banking.menu.Menu;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Menu m = new Menu();
        m.showMenu();
    }
}

