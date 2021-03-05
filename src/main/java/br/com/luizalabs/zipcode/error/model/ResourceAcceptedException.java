package br.com.luizalabs.zipcode.error.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ResourceAcceptedException extends RuntimeException {
    public ResourceAcceptedException(String message) {
        super(message);
    }
}

