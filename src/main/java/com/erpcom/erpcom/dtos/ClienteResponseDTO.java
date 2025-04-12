package com.erpcom.erpcom.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

    public ClienteResponseDTO(String cgc, String razaoSocial, String nomeFantasia, String inscEstadual,String endereco, String bairro, String cidade, String uf, String cep,String fone, String fax, String celular) {
        this.cgc = cgc;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscEstadual = inscEstadual;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.fone = fone;
        this.fax = fax;
        this.celular = celular;
    }

}
