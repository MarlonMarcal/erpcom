package com.erpcom.erpcom.dtos;

import java.time.LocalDateTime;

import com.erpcom.erpcom.models.Marca;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoResponseDTO {

    private Integer codProduto;
    private String codOriginal;
	private String codBarras;
    private String descricao;
	private Marca marca;
    private String codEmbalagem;
	private Double precoAquisicao;
	private Double preco;
	private String nbm;
	private String sitTrib;
	private LocalDateTime dataAtualizacao;
	private LocalDateTime dataCadastro;
	private String operadorCadastro;
    
}
