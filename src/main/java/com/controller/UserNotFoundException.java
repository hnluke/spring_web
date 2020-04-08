package com.controller;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String userName) {
        super("User not found with name: " + userName);
    }
}
