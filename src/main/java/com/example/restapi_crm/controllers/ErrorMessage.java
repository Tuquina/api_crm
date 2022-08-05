package com.example.restapi_crm.controllers;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
class ErrorMessage {

    private final String error;
    private final String message;
    private final Integer code;

    ErrorMessage(Exception exception, Integer code) {
        this.error = exception.getClass().getSimpleName();
        this.message = exception.getMessage();
        this.code = code;
    }

}