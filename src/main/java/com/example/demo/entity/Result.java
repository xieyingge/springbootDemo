package com.example.demo.entity;

import com.example.demo.enun.CodeMessage;
import lombok.*;

@Data
@Builder
@ToString
public class Result {
    private String code;
    private String message;
    private Object data;

    private Result(CodeMessage codeMessage, Object data) {
        this.data = data;
        this.code = codeMessage.getCode();
        this.message = codeMessage.getMessage();
    }

    public static Result toResult() {
        return new Result(CodeMessage.SUCCESS);
    }

    public static Result toResult(CodeMessage codeMessage) {
        return new Result(codeMessage);
    }

    public static Result toResult(Object data) {
        return new Result(CodeMessage.SUCCESS, data);
    }

    public static Result toResult(CodeMessage codeMessage, String message) {
        return new Result(codeMessage, message);
    }

    public static Result toResult(CodeMessage codeMessage, String message, Object data) {
        return new Result(codeMessage, message, data);
    }

    private Result(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }

    private Result(CodeMessage codeMessage) {
        this.code = codeMessage.getCode();
        this.message = codeMessage.getMessage();
    }

    private Result(CodeMessage codeMessage, String message) {
        this.code = codeMessage.getCode();
        this.message = message;
    }

    private Result(CodeMessage codeMessage, String message, Object data) {
        this.code = codeMessage.getCode();
        this.message = message;
        this.data = data;
    }

    private Result(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
