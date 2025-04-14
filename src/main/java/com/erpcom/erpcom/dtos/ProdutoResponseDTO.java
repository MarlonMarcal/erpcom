package com.erpcom.erpcom.dtos;

import java.time.LocalDateTime;

import com.erpcom.erpcom.models.Marca;
import com.erpcom.erpcom.models.Produto;


public record ProdutoResponseDTO(Integer codProduto,String codOriginal, String codBarras, String descricao, Marca marca, String codEmbalagem, Double precoAquisicao, Double preco, String nbm, String sitTrib, LocalDateTime dataAtualizacao, LocalDateTime dataCadastro, String operadorCadastro) {

	public ProdutoResponseDTO (Produto produto){

		this( 
			produto.getCodProduto(), 
			produto.getCodOriginal(), 
			produto.getCodBarras(), 
			produto.getDescricao(), 
			produto.getMarca(), 
			produto.getCodEmbalagem(), 
			produto.getPrecoAquisicao(), 
			produto.getPreco(), 
			produto.getNbm(), 
			produto.getSitTrib(), 
			produto.getDataAtualizacao(), 
			produto.getDataCadastro(), 
			produto.getOperadorCadastro()
			);
	}
    
}
