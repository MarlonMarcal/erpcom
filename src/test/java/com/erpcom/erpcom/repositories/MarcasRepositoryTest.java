package com.erpcom.erpcom.repositories;

import com.erpcom.erpcom.dtos.MarcaResponseDTO;
import com.erpcom.erpcom.models.Marca;
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
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class MarcasRepositoryTest {

    @Autowired
    MarcasRepository marcasRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("Consultar por marca existente no DB")
    void findByMarca() {

        String marca = "Apple";

        MarcaResponseDTO data = new MarcaResponseDTO(20,marca,5,2.5);
        createMarca(data);


        Optional<Marca> result = this.marcasRepository.findByMarca(marca);
        assertThat(result.isPresent()).isTrue();

    }

    private Marca createMarca(MarcaResponseDTO data){
        Marca newMarca = new Marca(data);
        this.entityManager.persist(newMarca);
        return newMarca;
    }

}