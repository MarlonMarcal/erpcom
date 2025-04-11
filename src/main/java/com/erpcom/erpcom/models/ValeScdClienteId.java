package com.erpcom.erpcom.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class ValeScdClienteId implements Serializable {

    @Column(name = "LOJA")
    private Integer loja;

    @Column(name = "CODVALE")
    private Integer codVale;

    // Construtores
    public ValeScdClienteId() {}
    public ValeScdClienteId(Integer loja, Integer codVale) {
        this.loja = loja;
        this.codVale = codVale;
    }

    

    // equals e hashCode obrigatórios para chave composta
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValeScdClienteId)) return false;
        ValeScdClienteId that = (ValeScdClienteId) o;
        return Objects.equals(loja, that.loja) &&
               Objects.equals(codVale, that.codVale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loja, codVale);
    }
}
