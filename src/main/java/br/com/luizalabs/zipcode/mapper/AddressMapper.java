package br.com.luizalabs.zipcode.mapper;

import br.com.luizalabs.zipcode.dto.AddressDTO;
import br.com.luizalabs.zipcode.model.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper( AddressMapper.class );

    Address from(AddressDTO addressDTO);

    AddressDTO from(Address address);
}
