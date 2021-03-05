package br.com.luizalabs.zipcode.utils;

import br.com.luizalabs.zipcode.model.Address;
import br.com.luizalabs.zipcode.repository.IAddressRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

import java.util.Random;

@Slf4j
public class PopulateGenericDataBase {

    public void populate(ApplicationContext applicationContext) {
        IAddressRepository iAddressRepository = applicationContext.getBean(IAddressRepository.class);

        var listAddresses = iAddressRepository.findAll();
        if (listAddresses == null
                || (listAddresses != null
                && listAddresses.size() == 0)) {
            Address address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua Fênix", "Jardim Primavera", "Boa Vista", "Roraima", "69314238");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua Miguel Pereira", "Prefeito José Walter", "Fortaleza", "Ceará", "60760070");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Travessa Potycret", "Bom Pastor", "Natal", "Rio Grande do Norte", "59060075");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua João Luís Silva Ribas", "Cará-cará", "Ponta Grossa", "Paraná", "84043750");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua João Soares", "Paranaguamirim", "Joinville", "Santa Catarina", "89231592");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 03 de Outubro", "Jardim Helena", "São Paulo", "São Paulo", "08090284");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 13 de Maio", "Cantinho do Céu", "São Paulo", "São Paulo", "04849529");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Viela 16", "Parque São José", "São Paulo", "São Paulo", "04843425");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 18 de Abril", "Cidade Antônio Estevão de Carvalho", "São Paulo", "São Paulo", "08226021");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Travessa 19 de Agosto", "Jardim Maria Estela", "São Paulo", "São Paulo", "04180112");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 2 de Fevereiro", "Cidade Nova Heliópolis", "São Paulo", "São Paulo", "04236094");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Travessa 2 de Outubro", "Vila Nova Mazzei", "São Paulo", "São Paulo", "02317262");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 21 de Abril", "Brás", "São Paulo", "São Paulo", "03047000");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 21 de Setembro", "Vila Robertina", "São Paulo", "São Paulo", "03807020");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 23 de Novembro", "Vila Progresso (Zona Leste)", "São Paulo", "São Paulo", "08240001");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Avenida 24 de Agosto", "Conjunto Habitacional Fazenda do Carmo", "São Paulo", "São Paulo", "08421510");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Travessa 26 de Outubro", "Jardim Nazareth", "São Paulo", "São Paulo", "08150640");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 29", "Lotm Cananéia", "Fazenda Sao Paulo", "São Paulo", "18190000");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 29 de Julho", "Jardim São Martinho", "Sao Paulo", "São Paulo", "08081511");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 3", "Jardim Jaú (Zona Sul)", "Sao Paulo", "São Paulo", "04852410");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Viaduto 31 de Março", "Liberdade", "Sao Paulo", "São Paulo", "01517100");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 5 de Outubro", "Chácara Gaivotas", "Sao Paulo", "São Paulo", "04849309");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 7 G", "Cidade Tiradentes", "Sao Paulo", "São Paulo", "08475250");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Travessa 713", "Guaianazes", "Sao Paulo", "São Paulo", "08412120");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Rua 9 de Setembro", "Chácara Gaivotas", "Sao Paulo", "São Paulo", "04849333");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Travessa A Banda", "Jardim da Conquista (Zona Leste)", "Sao Paulo", "São Paulo", "08344010");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Caminho A", "Embura", "Sao Paulo", "São Paulo", "04893052");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Estrada A", "Sítio Represa", "Sao Paulo", "São Paulo", "04894017");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Praça A Gazeta da Zona Norte", "Santana", "Sao Paulo", "São Paulo", "02012030");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
            address = new Address(Long.parseLong(new Random().nextInt(1000000) + ""), "Passagem A", "Alto da Mooca", "Sao Paulo", "São Paulo", "03195105");
            iAddressRepository.save(address);
            log.debug(PopulateGenericDataBase.class.getSimpleName(), "Save object : " + address.toString());
        }
    }
}
