package com.mongo.api.core.exceptions.custom.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PostNotFoundException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    public PostNotFoundException(String message) {
        super(message);
    }
}
