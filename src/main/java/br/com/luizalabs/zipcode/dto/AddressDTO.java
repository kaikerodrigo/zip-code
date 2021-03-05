package br.com.luizalabs.zipcode.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@ApiModel(value = "AddressDTO")
@Builder
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class AddressDTO implements Serializable {

    @ApiModelProperty(value = "Identification value of the object.")
    private Long id;
    @ApiModelProperty(value = "Value to identify street.")
    private String street;
    @ApiModelProperty(value = "Value to identify district.")
    private String district;
    @ApiModelProperty(value = "Value to city.")
    private String city;
    @ApiModelProperty(value = "Value to identify state.")
    private String state;
    @ApiModelProperty(value = "Value to zip code.")
    private String zipCode;

}
