package com.erpcom.erpcom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpcom.erpcom.models.Produto;

public interface ProdutosRepository extends JpaRepository<Produto,Integer>{
    
}
