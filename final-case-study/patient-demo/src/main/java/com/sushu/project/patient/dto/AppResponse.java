package com.sushu.project.patient.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class AppResponse<T> {

    private String status;
    private String message;
    private T body;

    public String getStatus(String success) {
        return status;
    }

    public void setStatus(String sts) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }
}
