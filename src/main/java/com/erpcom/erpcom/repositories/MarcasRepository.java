package com.erpcom.erpcom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpcom.erpcom.models.Marca;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface MarcasRepository extends JpaRepository<Marca, Integer>{

    Optional<Marca> findByMarca(String marca);
}
