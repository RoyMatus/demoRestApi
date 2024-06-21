package com.example.demorestapi;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RecordNotFoundAdvice {
    @ExceptionHandler(RecordNotFoundException.class)
    @ResponseStatus
    String handleRecordNotFoundException(RecordNotFoundException e) {
        return e.getMessage();
    }

    @ResponseBody
    String handleRecordNotFoundException(RecordNotFoundException e, HttpServletRequest request) {
        return "Record not found.";
    }
}
