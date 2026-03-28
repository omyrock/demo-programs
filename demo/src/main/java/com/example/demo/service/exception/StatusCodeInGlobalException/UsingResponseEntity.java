package com.example.demo.service.exception.StatusCodeInGlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UsingResponseEntity {
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Object> getGlobalExceptionHandler(UserNotFoundException userNotFoundException){
//        return  new ResponseEntity<>(userNotFoundException.
//                getMessage(), HttpStatus.NOT_FOUND);

        // BELOW ARE CUSTOM ERROR
        CustomErrorMessage custumErrorMessege= new CustomErrorMessage(HttpStatus.NOT_FOUND.value(),
                userNotFoundException.getMessage(),System.currentTimeMillis()
        );
         return  new ResponseEntity<>(custumErrorMessege,HttpStatus.NOT_FOUND);
    }
}
