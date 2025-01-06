package com.shivu.productservice.exception;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ApplicationExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<APIError> handlerForProductNotFoundException(ProductNotFoundException e,WebRequest request){
        APIError apiError2=APIError.builder()
        .timeStamp(LocalDateTime.now())
        .message(e.getMessage())
        .status(HttpStatus.NOT_FOUND)
        .errors(Arrays.asList(e.getMessage()))
        .build();
                return ResponseEntity.ok(apiError2);
    }

    @ExceptionHandler(ProductNameNotExistsException.class)
    public ResponseEntity<APIError> hanlderForProductNameNotExistsException(ProductNameNotExistsException e){
        APIError apiError2=APIError.builder()
        .timeStamp(LocalDateTime.now())
        .message(e.getMessage())
        .status(HttpStatus.NOT_FOUND)
        .errors(Arrays.asList(e.getMessage()))
        .build();
        return ResponseEntity.ok(apiError2);
    }

}
