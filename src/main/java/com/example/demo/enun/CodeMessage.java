package com.example.demo.enun;

public enum  CodeMessage {

    SUCCESS("200","Successful operation"),
    ERROR405("405","Request not allowed"),
    SERVER_ERROR( "500","Server busy"),
    OPERATE_FAIL( "505","Operate fail");

    private String code;
    private String message;

    CodeMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
