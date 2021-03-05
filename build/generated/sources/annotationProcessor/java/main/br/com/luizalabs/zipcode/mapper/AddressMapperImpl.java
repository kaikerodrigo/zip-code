package br.com.luizalabs.zipcode.mapper;

import br.com.luizalabs.zipcode.dto.AddressDTO;
import br.com.luizalabs.zipcode.model.Address;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-05T15:41:02-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.10 (Ubuntu)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address from(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressDTO.getId() );
        address.setStreet( addressDTO.getStreet() );
        address.setDistrict( addressDTO.getDistrict() );
        address.setCity( addressDTO.getCity() );
        address.setState( addressDTO.getState() );
        address.setZipCode( addressDTO.getZipCode() );

        return address;
    }

    @Override
    public AddressDTO from(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setId( address.getId() );
        addressDTO.setStreet( address.getStreet() );
        addressDTO.setDistrict( address.getDistrict() );
        addressDTO.setCity( address.getCity() );
        addressDTO.setState( address.getState() );
        addressDTO.setZipCode( address.getZipCode() );

        return addressDTO;
    }
}
