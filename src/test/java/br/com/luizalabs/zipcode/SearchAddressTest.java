package br.com.luizalabs.zipcode;


import br.com.luizalabs.zipcode.dto.AddressDTO;
import br.com.luizalabs.zipcode.mapper.AddressMapper;
import br.com.luizalabs.zipcode.model.Address;
import br.com.luizalabs.zipcode.repository.IAddressRepository;
import br.com.luizalabs.zipcode.service.AddressService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SearchAddressTest {

    @Mock private IAddressRepository iAddressRepository;
    @InjectMocks private AddressService addressService;

    @Test
    public void persist(){
        Long id = Long.parseLong(new Random().nextInt(100000) + "");
        Address address = new Address(id, "Rua João Soares", "Paranaguamirim", "Joinville", "Santa Catarina", "89231592");
        Mockito.when(iAddressRepository.save(Mockito.any(Address.class))).thenReturn(address);
        AddressDTO addressDTO = addressService.save(AddressMapper.INSTANCE.from(address));
        assertThat(addressDTO.getId()).isNotNull();
        assertThat(addressDTO.getStreet()).isNotNull();
        assertThat(addressDTO.getDistrict()).isNotNull();
        assertThat(addressDTO.getCity()).isNotNull();
        assertThat(addressDTO.getState()).isNotNull();
        assertThat(addressDTO.getZipCode()).isNotNull();
    }

    @Test
    public void findById(){
        Long id = Long.parseLong(new Random().nextInt(100000) + "");
        Address address = new Address(id, "Rua João Luís Silva Ribas", "Cará-cará", "Ponta Grossa", "Paraná", "84043750");
        Mockito.when(iAddressRepository.save(Mockito.any(Address.class))).thenReturn(address);

        Optional<Address> address1 = iAddressRepository.findById(id);
        if (address1.isPresent()) {
            address = address1.get();
        }

        AddressDTO addressDTO = addressService.save(AddressMapper.INSTANCE.from(address));
        assertThat(addressDTO.getId()).isNotNull();
        assertThat(addressDTO.getStreet()).isNotNull();
        assertThat(addressDTO.getDistrict()).isNotNull();
        assertThat(addressDTO.getCity()).isNotNull();
        assertThat(addressDTO.getState()).isNotNull();
        assertThat(addressDTO.getZipCode()).isNotNull();

    }

    @Test
    public void findZipCodeByZipCodeContaining(){
        Long id = Long.parseLong(new Random().nextInt(100000) + "");
        Address address = new Address(id, "Travessa Potycret", "Bom Pastor", "Natal", "Rio Grande do Norte", "59060075");
        Mockito.when(iAddressRepository.save(Mockito.any(Address.class))).thenReturn(address);

        Optional<Address> address1 = iAddressRepository.findZipCodeByZipCodeContaining("59060-075");
        if (address1.isPresent()) {
            address = address1.get();
        }

        AddressDTO addressDTO = addressService.save(AddressMapper.INSTANCE.from(address));
        assertThat(addressDTO.getId()).isNotNull();
        assertThat(addressDTO.getStreet()).isNotNull();
        assertThat(addressDTO.getDistrict()).isNotNull();
        assertThat(addressDTO.getCity()).isNotNull();
        assertThat(addressDTO.getState()).isNotNull();
        assertThat(addressDTO.getZipCode()).isNotNull();
    }

    @Test
    public void updateUsingDTO(){
        Long id = Long.parseLong(new Random().nextInt(100000) + "");
        Address address = new Address(id, "Rua Miguel Pereira", "Prefeito José Walter", "Fortaleza", "Ceará", "60760070");
        Mockito.when(iAddressRepository.save(Mockito.any(Address.class))).thenReturn(address);

        AddressDTO addressDTO = addressService.update(AddressMapper.INSTANCE.from(address));
        assertThat(addressDTO.getId()).isNotNull();
        assertThat(addressDTO.getStreet()).isNotNull();
        assertThat(addressDTO.getDistrict()).isNotNull();
        assertThat(addressDTO.getCity()).isNotNull();
        assertThat(addressDTO.getState()).isNotNull();
        assertThat(addressDTO.getZipCode()).isNotNull();
    }

    @Test
    public void updateUsingZipCode(){
        Long id = Long.parseLong(new Random().nextInt(100000) + "");
        Address address = new Address(id, "Rua Fênix", "Jardim Primavera", "Boa Vista", "Roraima", "69314238");
        Mockito.when(iAddressRepository.save(Mockito.any(Address.class))).thenReturn(address);

        Optional<Address> address1 = iAddressRepository.findZipCodeByZipCodeContaining("69314238");
        if (address1.isPresent()) {
            address = address1.get();
        }

        AddressDTO addressDTO = addressService.update(AddressMapper.INSTANCE.from(address));
        assertThat(addressDTO.getId()).isNotNull();
        assertThat(addressDTO.getStreet()).isNotNull();
        assertThat(addressDTO.getDistrict()).isNotNull();
        assertThat(addressDTO.getCity()).isNotNull();
        assertThat(addressDTO.getState()).isNotNull();
        assertThat(addressDTO.getZipCode()).isNotNull();
    }
}
