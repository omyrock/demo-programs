package com.example.demo.service.exception.StatusCodeInGlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UsingResponseStatus {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String getGlobalException(UserNotFoundException userNotFoundException){
        return userNotFoundException.getMessage();
    }
}

 class UserNotFoundException extends RuntimeException{
    UserNotFoundException(String messege){
        super(messege);
    }
 }