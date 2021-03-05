package br.com.luizalabs.zipcode.controller;


import br.com.luizalabs.zipcode.dto.AddressDTO;
import br.com.luizalabs.zipcode.dto.AddressFindDTO;
import br.com.luizalabs.zipcode.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/v1/addresses")
@Api(value = "CEP", tags = "CEP")
@Slf4j
@CrossOrigin("*")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @ApiOperation(value = "Checks if there is no active and saved agenda, if not, it will be saved in the database.")
    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody AddressDTO addressDTO) {
        addressDTO = addressService.save(addressDTO);
        return new ResponseEntity<>(addressDTO, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Performs update of the record saved in the system.")
    @PutMapping
    public ResponseEntity<?> update(@Valid @RequestBody AddressDTO addressDTO) {
        addressDTO = addressService.update(addressDTO);
        return new ResponseEntity<>(addressDTO, HttpStatus.CREATED);
    }

    @ApiOperation(value = "Performs update of the record saved in the system.")
    @PutMapping("/{zipcode}")
    public ResponseEntity<?> updateUsingZipCode(@PathVariable String zipcode) {
        AddressDTO addressDTO = addressService.findByZipCode(zipcode);
        addressDTO = addressService.update(addressDTO);
        return ResponseEntity.ok(addressDTO);
    }


    @ApiOperation(value = "Search zip code registered in the system.")
    @GetMapping
    public ResponseEntity<?> findByZipCode(@Valid AddressFindDTO findDto) {
        AddressDTO addressDTO = addressService.findByZipCode(findDto.getZipCode());
        return ResponseEntity.ok(addressDTO);
    }


}
