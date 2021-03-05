package br.com.luizalabs.zipcode.service;

import br.com.luizalabs.zipcode.dto.AddressDTO;
import br.com.luizalabs.zipcode.error.model.ResourceBadRequestException;
import br.com.luizalabs.zipcode.error.model.ResourceNotFoundException;
import br.com.luizalabs.zipcode.error.model.ResourceOKException;
import br.com.luizalabs.zipcode.error.model.ResourceObjectFoundException;
import br.com.luizalabs.zipcode.mapper.AddressMapper;
import br.com.luizalabs.zipcode.model.Address;
import br.com.luizalabs.zipcode.repository.IAddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class AddressService {

    private final String TAG = this.getClass().getSimpleName() + " : ";

    @Autowired
    private IAddressRepository iAddressRepository;

    public AddressDTO save(AddressDTO obj) {

        if (obj == null) {
            throw new ResourceBadRequestException("Invalid supplied value for CEP.");
        } else if (fieldValidation(obj)) {

            if (obj.getId() != null
                    && obj.getId() == 0) {
                obj.setId(null);
            }
            obj.setZipCode(removingCharacters(obj.getZipCode()));
            if (iAddressRepository.findZipCodeByZipCodeContaining(obj.getZipCode()).isPresent()) {
                throw new ResourceOKException("Valid provided object, however it was not saved, as it is already in the system.");
            }
        }
        Address address = AddressMapper.INSTANCE.from(obj);
        iAddressRepository.save(address);
        return AddressMapper.INSTANCE.from(address);
    }

    public AddressDTO update(AddressDTO dto) {
        if (dto != null) {
            if (dto.getId() == null
                    || (dto.getId() != null
                    && dto.getId() == 0)) {
                throw new ResourceBadRequestException("Required field/attribute id value.");
            }
        } else {
            throw new ResourceBadRequestException("Invalid supplied value for CEP.");
        }

        dto.setZipCode(removingCharacters(dto.getZipCode()));


        var zipCode = new Address();

        if (fieldValidation(dto)) {
            try {
                zipCode = iAddressRepository.save(AddressMapper.INSTANCE.from(dto));
            } catch (DataIntegrityViolationException e) {
                throw new ResourceObjectFoundException("It is not possible to save this object, there is information provided in it that conflicts with others saved in the system.");
            }
        }

        return AddressMapper.INSTANCE.from(zipCode);
    }

    public AddressDTO findByZipCode(String str) {
        str = removingCharacters(str);
        Address address = new Address();
        Optional<Address> addressOptional = iAddressRepository.findZipCodeByZipCodeContaining(str);
        if (addressOptional.isPresent()) address = addressOptional.get();

        if (address.getId() == null
                || (address.getId() != null
                && address.getId() == 0)) {
            if (!str.equals("00000000")) {
                findByZipCode(replaceFromRightToLeft(str));
            } else {
                throw new ResourceNotFoundException("We are very sorry, but it was not possible to find any value in the system except for the zip code provided.");
            }
        }


        return AddressMapper.INSTANCE.from(address);
    }

    private boolean fieldValidation(AddressDTO obj) {
        if (obj.getStreet() == null
                || (obj.getStreet() != null
                && obj.getStreet().trim().length() == 0)) {
            throw new ResourceBadRequestException("Required field/attribute street value.");
        } else if (obj.getDistrict() == null
                || (obj.getDistrict() != null
                && obj.getDistrict().trim().length() == 0)) {
            throw new ResourceBadRequestException("Required field/attribute district value.");
        } else if (obj.getCity() == null
                || (obj.getCity() != null
                && obj.getCity().trim().length() == 0)) {
            throw new ResourceBadRequestException("Required field/attribute city value.");
        } else if (obj.getState() == null
                || (obj.getState() != null
                && obj.getState().trim().length() == 0)) {
            throw new ResourceBadRequestException("Required field/attribute state value.");
        } else if (obj.getZipCode() == null
                || (obj.getZipCode() != null
                && obj.getZipCode().trim().length() == 0)) {
            throw new ResourceBadRequestException("Required field/attribute zip code value.");
        } else if (obj.getZipCode() == null
                || (obj.getZipCode() != null
                && obj.getZipCode().trim().length() > 8)) {
            throw new ResourceBadRequestException("Value provided for zip code is not within the 00000-000 standard.");
        }

        return true;
    }

    public String removingCharacters(String str) {
        if (str != null) {
            StringBuffer sb = new StringBuffer();

            char[] caracteres = str.toCharArray();

            for (Character caracter : caracteres) {
                if (Character.isDigit(caracter)) {
                    sb.append(caracter);
                }
            }
            str = String.valueOf(sb);
            if (str.length() != 8) {
                throw new ResourceBadRequestException("Value provided for invalid zip code field. A value similar to \"08240-001\" is expected.");
            }
        } else {
            throw new ResourceBadRequestException("Invalid supplied zip.");
        }
        return str;
    }

    public String replaceFromRightToLeft(String s) {
        for (int i = s.length() -1; i >= 0; i--) {
            if(Integer.parseInt(String.valueOf(s.charAt(i))) > 0){
                s = s.replace(s.charAt(i), '0');
                break;
            }
        }
        return s;
    }
}
