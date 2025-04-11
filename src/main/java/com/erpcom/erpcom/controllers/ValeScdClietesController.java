package com.erpcom.erpcom.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erpcom.erpcom.models.ValeScdCliente;
import com.erpcom.erpcom.repositories.ValesCdClientesRepository;

@RestController
@RequestMapping("/api/valesclientes")
public class ValeScdClietesController {

    
    private final ValesCdClientesRepository valesCdClientesRepository;
    
    public ValeScdClietesController(ValesCdClientesRepository valesCdClientesRepository) {
        this.valesCdClientesRepository = valesCdClientesRepository;
    } 

    @GetMapping
    public List<ValeScdCliente> ListarVales(){

        return valesCdClientesRepository.findAll();
    }
    
}
