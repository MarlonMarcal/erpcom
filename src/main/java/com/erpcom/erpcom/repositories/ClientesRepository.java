package com.erpcom.erpcom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpcom.erpcom.models.Cliente;


public interface ClientesRepository extends JpaRepository<Cliente, String> {
}
