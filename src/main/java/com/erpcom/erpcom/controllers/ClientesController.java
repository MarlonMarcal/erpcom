package com.erpcom.erpcom.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erpcom.erpcom.dtos.ClienteResponseDTO;
import com.erpcom.erpcom.models.Cliente;
import com.erpcom.erpcom.repositories.ClientesRepository;

@RestController
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private final ClientesRepository clientesRepository = null;

    @GetMapping
    public List<ClienteResponseDTO> listarClientes() {
        return clientesRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{cgc}")
    public ClienteResponseDTO buscarClientePorId(@PathVariable String cgc) {
        return clientesRepository.findById(cgc)
                .map(this::toDto)
                .orElse(null);
    }

    private ClienteResponseDTO toDto(Cliente cliente) {
        return new ClienteResponseDTO(
                cliente.getCgc(),
                cliente.getRazaoSocial(),
                cliente.getNomeFantasia(),
                cliente.getInscricaoEstadual(),
                cliente.getEndereco(),
                cliente.getBairro(),
                cliente.getCidade(),
                cliente.getUf(),
                cliente.getCep(),
                cliente.getFone(),
                cliente.getFax(),
                cliente.getCelular()
        );
    }

    
}
