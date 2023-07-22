package com.example.demo.exceptions;

public class ExceptionsDivide extends RuntimeException {
    public ExceptionsDivide() {
    }

    public ExceptionsDivide(String message) {
        super(message);
    }

    public ExceptionsDivide(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionsDivide(Throwable cause) {
        super(cause);
    }

    public ExceptionsDivide(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
