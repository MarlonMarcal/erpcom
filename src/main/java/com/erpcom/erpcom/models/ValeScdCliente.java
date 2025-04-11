package com.erpcom.erpcom.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "VALESCDCLIENTES")
public class ValeScdCliente {

    @EmbeddedId
    private ValeScdClienteId id;

    @Column(name = "CODORCAMENTO")
    private Double codOrcamento;

    @Column(name = "NOTAFISCAL")
    private String notaFiscal;

    @Column(name = "DATAVALE")
    private LocalDateTime dataVale;

    @Column(name = "OPERADOR")
    private String operador;

    @Column(name = "VALOR")
    private Double valor;

    @Column(name = "FECHADO")
    private String fechado;

    @Column(name = "PRAZOVALIDADE")
    private String prazoValidade;

    @Column(name = "CGC")
    private String cgc;

    @Column(name = "CLIENTE")
    private String cliente;

    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "EXPORT")
    private String exportado;

    @Column(name = "DATAFECHAMENTO")
    private LocalDateTime dataFechamento;

    @Column(name = "DATAVALIDADE")
    private LocalDateTime dataValidade;

    @Column(name = "DATAALTERACAO")
    private LocalDateTime dataAlteracao;

    @Column(name = "OPERADORALTERACAO")
    private String operadorAlteracao;

    @Column(name = "OPERFECHAMENTO")
    private String operFechamento;

    @Column(name = "LOJAFECHAMENTO")
    private Integer lojaFechamento;

    @Column(name = "VALETROCO")
    private Integer valeTroco;

    @Column(name = "LOJAVALETROCO")
    private Integer lojaValeTroco;

    @Column(name = "VALEORIGEM")
    private Integer valeOrigem;

    @Column(name = "LOJAVALEORIGEM")
    private Integer lojaValeOrigem;

    @Column(name = "ORIGEM")
    private String origem;

    @Column(name = "ORCAMENTOFECHAMENTO")
    private Integer orcamentoFechamento;

    @Column(name = "QTDIMPRESSAO")
    private Integer qtdImpressao;

    @Column(name = "LOTEEXPORT")
    private Integer loteExport;

    @Column(name = "TRIGGERATIVA")
    private String triggerAtiva;

    @Column(name = "OBS")
    private String observacao;

    @Column(name = "LOJAVALEAGRUPAMENTO")
    private Integer lojaValeAgrupamento;

    @Column(name = "VALEAGRUPAMENTO")
    private Integer valeAgrupamento;

    @Column(name = "JUSTIFICATIVAQUITACAO")
    private String justificativaQuitacao;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "PRAZOMEDIO")
    private Double prazoMedio;

    @Column(name = "CODCONDPAG")
    private Integer codCondPag;

    
}
