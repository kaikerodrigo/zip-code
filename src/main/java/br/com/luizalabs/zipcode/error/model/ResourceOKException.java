package br.com.luizalabs.zipcode.error.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class ResourceOKException extends RuntimeException {
    public ResourceOKException(String message) {
        super(message);
    }
}

