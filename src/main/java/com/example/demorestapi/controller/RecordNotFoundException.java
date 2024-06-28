package com.example.demorestapi.controller;

import java.util.UUID;

public class RecordNotFoundException extends RuntimeException {
    public RecordNotFoundException(UUID id) {
        super("Record with id " + id + " not found");
    }
}
