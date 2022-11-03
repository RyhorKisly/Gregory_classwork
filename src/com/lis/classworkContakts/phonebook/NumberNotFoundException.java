package com.lis.phonebook;

public class NumberNotFoundException extends RuntimeException {
    public NumberNotFoundException(String message) {
        super(message);
    }
}
