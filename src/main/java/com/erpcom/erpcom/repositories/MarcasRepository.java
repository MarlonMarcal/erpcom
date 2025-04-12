package com.erpcom.erpcom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpcom.erpcom.models.Marca;

public interface MarcasRepository extends JpaRepository<Marca, Integer>{
    
}
