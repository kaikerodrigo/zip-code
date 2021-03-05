package br.com.luizalabs.zipcode.error.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ResourceForbiddenException extends RuntimeException {
    public ResourceForbiddenException(String message) {
        super(message);
    }
}
