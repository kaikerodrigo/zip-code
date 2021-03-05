package br.com.luizalabs.zipcode.repository;


import br.com.luizalabs.zipcode.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Optional;

@Repository
@Transactional(rollbackOn = Exception.class)
public interface IAddressRepository extends JpaRepository<Address, Long>, Serializable {
    Optional<Address> findZipCodeByZipCodeContaining(@Param("str") String str);
}
