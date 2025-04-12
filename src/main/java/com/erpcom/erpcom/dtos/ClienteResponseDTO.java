package com.erpcom.erpcom.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponseDTO {
    private String cgc;
    private String razaoSocial;
    private String nomeFantasia;
    private String inscEstadual;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;
    private String fone;
    private String fax;
    private String celular;
}
