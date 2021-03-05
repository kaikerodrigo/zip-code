package br.com.luizalabs.zipcode.error;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResourceErrorDetails {
    private String title;
    private int status;
    private String detail;
    private long timestamp;
    private String developerMessage;
}
