package com.javatechie.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
@AllArgsConstructor
public class AppError {
    private String errorCode;
    private String message;
    private HttpStatus httpStatus;
}
