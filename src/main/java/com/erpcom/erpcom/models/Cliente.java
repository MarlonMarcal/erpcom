package com.erpcom.erpcom.models;

import com.erpcom.erpcom.dtos.ClienteResponseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {

    @Id
    @Column(name = "CGC", nullable = false, length = 14)
    private String cgc;

    @Column(name = "RAZAOSOCIAL")
    private String razaoSocial;

    @Column(name = "NOMEFANTASIA")
    private String nomeFantasia;

    @Column(name = "INSCESTADUAL")
    private String inscricaoEstadual;

    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "CIDADE")
    private String cidade;

    @Column(name = "UF")
    private String uf;

    @Column(name = "CEP")
    private String cep;

    @Column(name = "FONE")
    private String fone;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "FONERES")
    private String foneRes;

    @Column(name = "SITUACAO")
    private String situacao;

    @Column(name = "LIMITECREDITO")
    private Double limiteCredito;

    @Column(name = "ANIVERSARIO")
    private LocalDateTime aniversario;

    @Column(name = "CODPROFISSAO")
    private Integer codProfissao;

    @Column(name = "CODATIVIDADE")
    private Integer codAtividade;

    @Column(name = "CODLOCALIDADE")
    private Integer codLocalidade;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "HOMEPAGE")
    private String homepage;

    @Column(name = "DATAATUALIZACAO")
    private LocalDateTime dataAtualizacao;

    @Column(name = "ENDERECOCOB")
    private String enderecoCobranca;

    @Column(name = "BAIRROCOB")
    private String bairroCobranca;

    @Column(name = "CIDADECOB")
    private String cidadeCobranca;

    @Column(name = "CEPCOB")
    private String cepCobranca;

    @Column(name = "UFCOB")
    private String ufCobranca;

    @Column(name = "MEMO")
    private String memo;

    @Column(name = "VALIDADECADASTRO")
    private LocalDateTime validadeCadastro;

    @Column(name = "DATACADASTRO")
    private LocalDateTime dataCadastro;

    @Column(name = "TIPOCLIENTE")
    private String tipoCliente;

    @Column(name = "ENDERECOENTREGA")
    private String enderecoEntrega;

    @Column(name = "UFENTREGA")
    private String ufEntrega;

    @Column(name = "DDD")
    private String ddd;

    @Column(name = "NIVELCADASTRO")
    private Integer nivelCadastro;

    @Column(name = "EXPORT")
    private String exportado;

    @Column(name = "OPERADOR")
    private String operador;

    @Column(name = "CODSITFISCAL")
    private String codSitFiscal;

    @Column(name = "CNPJMATRIZ")
    private String cnpjMatriz;

    @Column(name = "OPERADORALTERACAO")
    private String operadorAlteracao;

    @Column(name = "LOTEEXPORT")
    private Integer loteExport;

    @Column(name = "VENDEDOR")
    private String vendedor;

    @Column(name = "TRIGGERATIVA")
    private String triggerAtiva;

    @Column(name = "CODAREA")
    private Integer codArea;

    @Column(name = "PENDENTE")
    private Double pendente;

    @Column(name = "CODCONDPAGPREFERENCIAL")
    private Integer codCondPagPreferencial;

    @Column(name = "SOMENTECONDPAGPREFERENCIAL")
    private String somenteCondPagPreferencial;

    @Column(name = "TIPOPRECO")
    private Integer tipoPreco;

    @Column(name = "CEI")
    private String cei;

    @Column(name = "ULTIMOCONTATO")
    private LocalDateTime ultimoContato;

    @Column(name = "PROXIMOCONTATO")
    private LocalDateTime proximoContato;

    @Column(name = "NUMCARTAO")
    private String numCartao;

    @Column(name = "CODCONDPAGAGRUPAMENTO")
    private Integer codCondPagAgrupamento;

    @Column(name = "OBSDUPLICATA")
    private String obsDuplicata;

    @Column(name = "NOMEPAI")
    private String nomePai;

    @Column(name = "NOMEMAE")
    private String nomeMae;

    @Column(name = "CIDADENATURALIDADE")
    private String cidadeNaturalidade;

    @Column(name = "UFNATURALIDADE")
    private String ufNaturalidade;

    @Column(name = "CIEXPEDIDAPOR")
    private String ciExpedidaPor;

    @Column(name = "CIEXPEDIDAEM")
    private LocalDateTime ciExpedidaEm;

    @Column(name = "CODGRAUINSTRUCAO")
    private Integer codGrauInstrucao;

    @Column(name = "CODESTADOCIVIL")
    private Integer codEstadoCivil;

    @Column(name = "DEPENDENTES")
    private Integer dependentes;

    @Column(name = "NOMECONJUGE")
    private String nomeConjuge;

    @Column(name = "TRABALHO")
    private String trabalho;

    @Column(name = "DATAADMISSAO")
    private LocalDateTime dataAdmissao;

    @Column(name = "SALARIO")
    private Double salario;

    @Column(name = "CARGO")
    private String cargo;

    @Column(name = "CONTACREDITO")
    private String contaCredito;

    @Column(name = "CONTADEBITO")
    private String contaDebito;

    @Column(name = "IMPNOTAFATURAAUTOMATICO")
    private String impNotaFaturaAutomatico;

    @Column(name = "CODIGO")
    private Integer codigo;

    @Column(name = "CODCLIENTE")
    private String codCliente;

    @Column(name = "ULTIMACOMPRA")
    private LocalDateTime ultimaCompra;

    @Column(name = "CODCIDADEIBGE")
    private Integer codCidadeIBGE;

    @Column(name = "CODPAIS")
    private Integer codPais;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "DIAVENCIMENTO")
    private Integer diaVencimento;

    @Column(name = "CODGRUPOPRECO")
    private Integer codGrupoPreco;

    @Column(name = "EMAILNFE")
    private String emailNfe;

    @Column(name = "SEXO")
    private String sexo;

    @Column(name = "CORRESPONDENCIA")
    private String correspondencia;

    @Column(name = "BANCOBOLETO")
    private String bancoBoleto;

    @Column(name = "CNPJTRANSPORTADOR")
    private String cnpjTransportador;

    @Column(name = "CGCCOBRANCA")
    private String cgcCobranca;

    @Column(name = "CONTATO")
    private String contato;

    @Column(name = "CGCINVALIDO")
    private String cgcInvalido;

    @Column(name = "CONTROLAQTDMAXIMAMES")
    private String controlaQtdMaximaMes;

    @Column(name = "NUMREGISTRO")
    private String numRegistro;

    @Column(name = "IMPBOLETOAOFECHARVENDA")
    private String impBoletoAoFecharVenda;

    @Column(name = "IDESTRANGEIRO")
    private String idEstrangeiro;

    @Column(name = "IM")
    private String im;

    @Column(name = "TIPOFRETE")
    private String tipoFrete;

    @Column(name = "NAOCONTRIBUINTE")
    private String naoContribuinte;

    @Column(name = "INATIVO")
    private String inativo;

    @Column(name = "INSCSUFRAMA")
    private String inscSuframa;

    @Column(name = "LIMITEDEBITOVENCIDO")
    private Double limiteDebitoVencido;

    @Column(name = "NAOPERMLIMCREEXC")
    private String naoPermLimCreExc;

    @Column(name = "NAOPERMDEBVENEXC")
    private String naoPermDebVenExc;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "DIASATRASODEBITOVENCIDO")
    private Integer diasAtrasoDebitoVencido;

    @Column(name = "IEINVALIDA")
    private String ieInvalida;

    @Column(name = "SETOR")
    private String setor;

    @Column(name = "MANUTENCAO1")
    private String manutencao1;

    @Column(name = "MANUTENCAO2")
    private String manutencao2;

    @Column(name = "MANUTENCAO3")
    private String manutencao3;

    @Column(name = "SINDICO")
    private String sindico;

    @Column(name = "TIPO")
    private Integer tipo;

    @Column(name = "CODGRUPODESCONTO")
    private Integer codGrupoDesconto;

    @Column(name = "CONDPAGAMENTO")
    private String condPagamento;

    @Column(name = "ERRO")
    private String erro;

    @Column(name = "VALIDADEGRUPOPRECO")
    private LocalDateTime validadeGrupoPreco;

    @Column(name = "INSTAGRAM")
    private String instagram;

    public Cliente(ClienteResponseDTO data){
        this.cgc = data.getCgc();
        this.razaoSocial = data.getRazaoSocial();
        this.nomeFantasia = data.getNomeFantasia();
        this.inscricaoEstadual = data.getInscEstadual();
        this.endereco = data.getEndereco();
        this.bairro = data.getBairro();
        this.cidade = data.getCidade();
        this.uf = data.getUf();
        this.cep = data.getCep();
        this.fone = data.getFone();
        this.fax = data.getFax();
        this.celular = data.getCelular();

    }
}
