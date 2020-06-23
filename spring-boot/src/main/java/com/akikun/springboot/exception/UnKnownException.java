package com.akikun.springboot.exception;

public class UnKnownException extends Exception {

    public UnKnownException() {

    }

    public UnKnownException(String message) {
        super(message);
    }
}
