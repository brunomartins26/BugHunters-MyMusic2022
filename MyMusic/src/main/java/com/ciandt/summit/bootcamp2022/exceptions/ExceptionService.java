package com.ciandt.summit.bootcamp2022.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler
    ResponseEntity<ErrorException> handleException(ErrorException exception){
        ErrorResponse user = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
        return new ResponseEntity(user, HttpStatus.BAD_REQUEST);
    }
}