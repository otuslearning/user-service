package com.example.userservice.exception;

public class UserNotFoundException extends RuntimeException {
    public static final String USER_NOT_FOUND = "User not found";

    public UserNotFoundException() {
        super(USER_NOT_FOUND);
    }
}
