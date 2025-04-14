package com.erpcom.erpcom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erpcom.erpcom.dtos.MarcaResponseDTO;
import com.erpcom.erpcom.repositories.MarcasRepository;

@RestController
@RequestMapping("/api/marcas")
public class MarcasController {

    @Autowired
    private final MarcasRepository marcasRepository = null;

    @GetMapping
    public List<MarcaResponseDTO> getAll(){

        List<MarcaResponseDTO> listarMarcas = marcasRepository.findAll()
            .stream()
            .map(MarcaResponseDTO::new).toList();
        
        return listarMarcas;

        
    }

    
}
