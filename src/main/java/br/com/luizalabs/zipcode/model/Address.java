package br.com.luizalabs.zipcode.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NonNull
@SuppressWarnings("serial")
@EqualsAndHashCode
@XmlRootElement
@Table(name = "addresses")
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true)
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "district")
    private String district;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip_code" , unique = true)
    private String zipCode;
}
