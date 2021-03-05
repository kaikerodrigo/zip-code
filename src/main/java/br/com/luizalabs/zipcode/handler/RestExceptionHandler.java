package br.com.luizalabs.zipcode.handler;


import br.com.luizalabs.zipcode.error.ResourceErrorDetails;
import br.com.luizalabs.zipcode.error.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rfnException) {
        ResourceErrorDetails resourceErrorDetails = ResourceErrorDetails
                .builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.NOT_FOUND.value())
                .title("Resource not found")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(resourceErrorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceObjectFoundException.class)
    public ResponseEntity<?> handleResourceObjectFoundException(ResourceObjectFoundException rfnException) {
        ResourceErrorDetails resourceErrorDetails = ResourceErrorDetails
                .builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.CONFLICT.value())
                .title("Conflict during requisition.")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(resourceErrorDetails, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ResourceForbiddenException.class)
    public ResponseEntity<?> handleResourceForbiddenException(ResourceForbiddenException rfnException) {
        ResourceErrorDetails resourceErrorDetails = ResourceErrorDetails
                .builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.FORBIDDEN.value())
                .title("The request is recognized by the server but the server refuses to execute it.")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(resourceErrorDetails, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<?> handleResourceBadRequestException(ResourceBadRequestException rfnException) {
        ResourceErrorDetails resourceErrorDetails = ResourceErrorDetails
                .builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.BAD_REQUEST.value())
                .title("The order could not be delivered due to incorrect syntax.")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(resourceErrorDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotContentException.class)
    public ResponseEntity<?> handleResourceNotContentException(ResourceNotContentException rfnException) {
        ResourceErrorDetails resourceErrorDetails = ResourceErrorDetails
                .builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.NO_CONTENT.value())
                .title("The order could not be delivered due to incorrect syntax.")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(resourceErrorDetails, HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(ResourceAcceptedException.class)
    public ResponseEntity<?> handleResourceAcceptedException(ResourceAcceptedException rfnException) {
        ResourceErrorDetails resourceErrorDetails = ResourceErrorDetails
                .builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.NO_CONTENT.value())
                .title("Accepted.")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(resourceErrorDetails, HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(ResourceOKException.class)
    public ResponseEntity<?> handleResourceOKException(ResourceOKException rfnException) {
        ResourceErrorDetails resourceErrorDetails = ResourceErrorDetails
                .builder()
                .timestamp(new Date().getTime())
                .status(HttpStatus.OK.value())
                .title("OK")
                .detail(rfnException.getMessage())
                .developerMessage(rfnException.getClass().getSimpleName())
                .build();

        return new ResponseEntity<>(resourceErrorDetails, HttpStatus.OK);
    }
}

