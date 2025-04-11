package com.erpcom.erpcom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpcom.erpcom.models.ValeScdCliente;
import com.erpcom.erpcom.models.ValeScdClienteId;

public interface ValesCdClientesRepository extends JpaRepository<ValeScdCliente,ValeScdClienteId>{


    
}
