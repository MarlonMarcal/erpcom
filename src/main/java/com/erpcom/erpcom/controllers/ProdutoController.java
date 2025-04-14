package com.erpcom.erpcom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erpcom.erpcom.dtos.ProdutoResponseDTO;
import com.erpcom.erpcom.repositories.ProdutosRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

   

    @Autowired
    private final ProdutosRepository produtosRepository = null;

    @GetMapping
    public List<ProdutoResponseDTO> listarProdutos(){
        return   produtosRepository.findAll()
         .stream()
         .map(ProdutoResponseDTO::new)
         .toList();            

    }

    @GetMapping("/{codproduto}")
    public ProdutoResponseDTO buscarProdutoPorId(@PathVariable Integer codproduto){
        return produtosRepository.findById(codproduto)
                .map(ProdutoResponseDTO::new)
                .orElse(null);
    }    



    
}
