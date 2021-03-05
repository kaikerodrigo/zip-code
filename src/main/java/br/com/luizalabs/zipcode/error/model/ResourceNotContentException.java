package br.com.luizalabs.zipcode.error.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class ResourceNotContentException extends RuntimeException {
    public ResourceNotContentException(String message) {
        super(message);
    }
}
