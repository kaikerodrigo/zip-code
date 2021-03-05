package br.com.luizalabs.zipcode.dto;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@ApiModel(value = "AddressFindDto")
@NoArgsConstructor
@AllArgsConstructor
public class AddressFindDTO {
    private String zipCode;
}
