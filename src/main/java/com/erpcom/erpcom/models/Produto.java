package com.erpcom.erpcom.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "PRODUTOS")
@Data
public class Produto {

    @Id
    @Column(name = "CODPRODUTO", nullable = false)
    private Integer codProduto;

    @Column(name = "CODORIGINAL", length = 30)
    private String codOriginal;

    @Column(name = "DESCRICAO", length = 150)
    private String descricao;

    @Column(name = "CODEMBALAGEM", length = 6)
    private String codEmbalagem;

    @Column(name = "CODGRUPO")
    private Integer codGrupo;

    @Column(name = "CODSUBGRUPO")
    private Integer codSubgrupo;

    @Column(name = "PRECO")
    private Double preco;

    @Column(name = "DATAATUALIZACAO")
    private LocalDateTime dataAtualizacao;

    @Column(name = "SITTRIB", length = 3)
    private String sitTrib;

    @Column(name = "QTDCX")
    private Double qtdCx;

    @Column(name = "CODFORNECEDOR", length = 14)
    private String codFornecedor;

    @Column(name = "ICMS")
    private Double icms;

    @Column(name = "CODAPLICACAO")
    private Integer codAplicacao;

    @Column(name = "GM")
    private Double gm;

    @Column(name = "ENCARGOS")
    private Double encargos;

    @Column(name = "FRETE")
    private Double frete;

    @Column(name = "PRECOAUISICAO")
    private Double precoAuisicao;

    @Column(name = "CORFEITA", length = 1)
    private String corFeita;

    @Column(name = "PRECOPROMOCAO")
    private Double precoPromocao;

    @Column(name = "GMMIN")
    private Double gmMin;

    @Column(name = "ICMSEXTERNO")
    private Double icmsExterno;

    @Column(name = "ENCARGOSFINANCEIROS")
    private Double encargosFinanceiros;

    @Column(name = "LOCALIZACAO", length = 20)
    private String localizacao;

    @Column(name = "NUMEROITEM", length = 50)
    private String numeroItem;

    @Column(name = "ALIQROIINT")
    private Double aliqRoiInt;

    @Column(name = "ALIQROIEXT")
    private Double aliqRoiExt;

    @Column(name = "EXPORT", length = 1)
    private String exporta;

    @Column(name = "OBS", length = 2000)
    private String obs;

    @Column(name = "REPRESENTANTE", length = 255)
    private String representante;

    @Column(name = "CODBARRAS", length = 30)
    private String codBarras;

    @Column(name = "DESCONTOMAXIMO")
    private Double descontoMaximo;

    @Column(name = "REDUCAOBASEICMS")
    private Double reducaoBaseIcms;

    @Column(name = "LOTE", length = 1)
    private String lote;

    @Column(name = "PRECOAQUISICAO")
    private Double precoAquisicao;

    @Column(name = "ICMSST")
    private Double icmsSt;

    @Column(name = "CAIXAFECHADA", length = 1)
    private String caixaFechada;

    @Column(name = "CODTEXTURA")
    private Integer codTextura;

    @Column(name = "CREDITOICMS")
    private Double creditoIcms;

    @Column(name = "COMISSAO")
    private Double comissao;

    @Column(name = "DATAPROMOCAO")
    private LocalDateTime dataPromocao;

    @Column(name = "TIPOPRECO")
    private Integer tipoPreco;

    @Column(name = "CMV")
    private Double cmv;

    @Column(name = "PRECOCALC")
    private Double precoCalc;

    @Column(name = "PESO")
    private Double peso;

    @Column(name = "CLFISCAL", length = 3)
    private String clFiscal;

    @Column(name = "CODCLFISCAL", length = 10)
    private String codClFiscal;

    @Column(name = "DATAPRECO")
    private LocalDateTime dataPreco;

    @Column(name = "CODGRUPOCENTROCUSTO")
    private Integer codGrupoCentroCusto;

    @Column(name = "INATIVO", length = 1)
    private String inativo;

    @Column(name = "DIASCOBERTURA")
    private Integer diasCobertura;

    @Column(name = "LOTEEXPORT")
    private Integer loteExport;

    @Column(name = "FRETEP")
    private Double freteP;

    @Column(name = "TIPOFRETE")
    private Integer tipoFrete;

    @Column(name = "TRIGGERATIVA", length = 1)
    private String triggerAtiva;

    @Column(name = "ICMSIVA")
    private Double icmsIva;

    @Column(name = "CODMOEDA")
    private Integer codMoeda;

    @Column(name = "LLCALC_GRAVADO")
    private Double llCalcGravado;

    @Column(name = "SOIMPORTA", length = 1)
    private String soImporta;

    @Column(name = "NBM", length = 30)
    private String nbm;

    @Column(name = "CODREFERENCIA", length = 40)
    private String codReferencia;

    @Column(name = "DATACADASTRO")
    private LocalDateTime dataCadastro;

    @Column(name = "TAXA")
    private Double taxa;

    @Column(name = "IPI")
    private Double ipi;

    @Column(name = "CONVERSAOCOMPRA")
    private Double conversaoCompra;

    @Column(name = "VOLUME")
    private Double volume;

    @Column(name = "COMPRIMENTO")
    private Double comprimento;

    @Column(name = "NAOCHECARESTOQUE", length = 1)
    private String naoChecarEstoque;

    @Column(name = "OPERADORCADASTRO", length = 30)
    private String operadorCadastro;

    @Column(name = "OPERADORATUALIZACAO", length = 30)
    private String operadorAtualizacao;

    @Column(name = "PRECOCOMP")
    private Double precoComp;

    @Column(name = "PRECOCOMP2")
    private Double precoComp2;

    @Column(name = "CUSTOPART")
    private Double custoPart;

    @Column(name = "DISPONIBILIDADE")
    private Integer disponibilidade;

    @Column(name = "QTREAL")
    private Double qtReal;

    @Column(name = "FLAGETIQ")
    private Integer flagEtiq;

    @Column(name = "EMISETIQ")
    private Integer emisEtiq;

    @Column(name = "ICMULTCOMP")
    private Double icMultComp;

    @Column(name = "DISP")
    private Integer disp;

    @Column(name = "CODFOR")
    private Integer codFor;

    @Column(name = "MARGEMLUC")
    private Double margemLuc;

    @Column(name = "CODSUBGRUPONIVEL2")
    private Integer codSubgrupoNivel2;

    @Column(name = "ENCARGOSTRIBUTARIOS")
    private Double encargosTributarios;

    @ManyToOne
    @JoinColumn(name = "CODMARCA", referencedColumnName = "CODMARCA")
    private Marca marca;

    @Column(name = "EXPORTWEB", length = 1)
    private String exportWeb;

    @Column(name = "VALORADUANEIRO")
    private Double valorAduaneiro;

    @Column(name = "CODSUBGRUPONIVEL3")
    private Integer codSubgrupoNivel3;

    @Column(name = "IGNORAREXPEDICAO", length = 1)
    private String ignorarExpedicao;

    @Column(name = "INFORMAPECAS", length = 1)
    private String informaPecas;

    @Column(name = "CODTABLOIDE")
    private Integer codTabloide;

    @Column(name = "CONTROLAAGENDA", length = 1)
    private String controlaAgenda;

    @Column(name = "CODSECAO")
    private Integer codSecao;

    @Column(name = "SELECIONARAGREGADOS", length = 1)
    private String selecionarAgregados;

    @Column(name = "TIPOINTEGRACAOB2C")
    private Integer tipoIntegracaoB2C;

    @Column(name = "MESESGARANTIAESTENDIDAB2C")
    private Integer mesesGarantiaEstendidaB2C;

    @Column(name = "CODGRUPOGARANTIA")
    private Integer codGrupoGarantia;

    @Column(name = "MESESGARANTIA")
    private Integer mesesGarantia;

    @Column(name = "PESOLIQUIDO")
    private Double pesoLiquido;

    @Column(name = "PESAVEL", length = 1)
    private String pesavel;

    @Column(name = "NAOINFQTDPDV", length = 1)
    private String naoInfQtdPdv;

    @Column(name = "CODGRADE")
    private Integer codGrade;

    @Column(name = "MOVIMENTALOTEPADRAO", length = 1)
    private String movimentaLotePadrao;

    @Column(name = "MKPRECOAQUISICAO")
    private Double mkPrecoAquisicao;

    @Column(name = "TIPOPESO")
    private Integer tipoPeso;

    @Column(name = "REDUCAOBASEICMSST")
    private Double reducaoBaseIcmsSt;

    @Column(name = "QTDMAXIMAMESPF")
    private Double qtdMaximaMesPf;

    @Column(name = "QTDMAXIMAMESPJ")
    private Double qtdMaximaMesPj;

    @Column(name = "CODGRUPODESCONTO")
    private Integer codGrupoDesconto;

    @Column(name = "CODIGOANP", length = 20)
    private String codigoAnp;

    @Column(name = "VENDACONTROLADA", length = 1)
    private String vendaControlada;

    @Column(name = "PISENTRADA")
    private Double pisEntrada;

    @Column(name = "COFINSENTRADA")
    private Double cofinsEntrada;

    @Column(name = "CODGRUPOETAPA")
    private Integer codGrupoEtapa;

    @Column(name = "SITTRIBPISENTRADA", length = 2)
    private String sitTribPisEntrada;

    @Column(name = "SITTRIBCOFINSENTRADA", length = 2)
    private String sitTribCofinsEntrada;

    @Column(name = "DESCRICAONF", length = 150)
    private String descricaoNf;

    @Column(name = "MKPRECOCALCULADO")
    private Double mkPrecoCalculado;

    @Column(name = "LLPROM_GRAVADO")
    private Double llPromGravado;

    @Column(name = "CODGRUPOPROMOCAO")
    private Integer codGrupoPromocao;

    @Column(name = "CEST", length = 7)
    private String cest;

    @Column(name = "CODCLFISCALGRUPOFISCAL", length = 10)
    private String codClFiscalGrupoFiscal;

    @Column(name = "PREMIOFORN")
    private Double premioForn;

    @Column(name = "ICMSDIFAL")
    private Double icmsDifal;

    @Column(name = "DESCRICAOANP", length = 100)
    private String descricaoAnp;

    @Column(name = "NAOPERMITEDEV", length = 1)
    private String naoPermiteDev;

    @Column(name = "REDUCAOBASECREDITOICMS")
    private Double reducaoBaseCreditoIcms;

    @Column(name = "KMPROXIMAREVISAO")
    private Double kmProximaRevisao;

    @Column(name = "LOCALIMPRESSAO", length = 1)
    private String localImpressao;

    @Column(name = "DATAPROMOCAOINICIO")
    private LocalDateTime dataPromocaoInicio;

    @Column(name = "CODIGOANVISA", length = 20)
    private String codigoAnvisa;

    @Column(name = "CODIGOTRIBUTACAO", length = 20)
    private String codigoTributacao;

    @Column(name = "CNAE", length = 20)
    private String cnae;

    @Column(name = "CODFEIRA")
    private Integer codFeira;

    @Column(name = "FAMILIA", length = 20)
    private String familia;

    @Column(name = "MARKUP")
    private Double markup;

    @Column(name = "TAM", length = 5)
    private String tam;

    @Column(name = "COD")
    private Integer cod;

    @Column(name = "NAOEXPEDIR", length = 1)
    private String naoExpedir;

    @Column(name = "COMP", length = 1)
    private String comp;

    
}
