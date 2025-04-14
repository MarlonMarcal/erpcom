package com.erpcom.erpcom.dtos;

import com.erpcom.erpcom.models.Marca;

public record MarcaResponseDTO(Integer codMarca, String marca, Integer qtdParaDesconto, Double desconto) {

    public MarcaResponseDTO(Marca marca){

        this(marca.getCodMarca(), marca.getMarca(), marca.getQtdParaDesconto(),marca.getDesconto() );
        
    }

}
