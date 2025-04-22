package com.erpcom.erpcom.repositories;

import com.erpcom.erpcom.dtos.ClienteResponseDTO;
import com.erpcom.erpcom.models.Cliente;
import com.sun.istack.NotNull;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class ClientesRepositoryTest {

    @Autowired
    ClientesRepository clientesRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("Consultar usuario existente no DB")
    void findByRazaoSocialContainingCase1() {

        String razaoSocial = "Marlon";

        ClienteResponseDTO data = new ClienteResponseDTO("11662350686",razaoSocial,"Marlon","ISENTO","qno 03 cj M","Ceilandia","Braslia","DF","72250313","6199187664","","");
        createCliente(data);

        Optional<Cliente> result = this.clientesRepository.findByRazaoSocialContaining(razaoSocial);

        assertThat(result.isPresent()).isTrue();

    }

    @NotNull
    private Cliente createCliente(ClienteResponseDTO data){
       Cliente newCliente = new Cliente(data);
       this.entityManager.persist(newCliente);
       return newCliente;
    }


}