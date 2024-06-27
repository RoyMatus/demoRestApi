package com.example.demorestapi.controller;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(Long id) {
        super("Record with id " + id + " not found");
    }
}
