package br.com.luizalabs.zipcode.error.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ResourceObjectFoundException extends RuntimeException {
    public ResourceObjectFoundException(String message) {
        super(message);
    }
}
