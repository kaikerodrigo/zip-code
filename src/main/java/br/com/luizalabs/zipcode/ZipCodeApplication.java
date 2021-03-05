package br.com.luizalabs.zipcode;

import br.com.luizalabs.zipcode.utils.PopulateGenericDataBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ZipCodeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ZipCodeApplication.class, args);
        PopulateGenericDataBase populateGenericDataBase = new PopulateGenericDataBase();
        populateGenericDataBase.populate(context);
    }

}
