package org.example.exception;

public class UserExistsException extends RuntimeException {
    public UserExistsException() {
        super("user exists! ");
    }
}
