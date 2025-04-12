package com.erpcom.erpcom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erpcom.erpcom.models.Marca;
import com.erpcom.erpcom.repositories.MarcasRepository;

@RestController
@RequestMapping("/api/marcas")
public class MarcasController {

    @Autowired
    private final MarcasRepository marcasRepository = null;

    @GetMapping
    public List<Marca> listarMarcas(){

        return marcasRepository.findAll();

        
    }

    
}
