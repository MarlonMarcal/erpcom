package com.erpcom.erpcom.models;

import com.erpcom.erpcom.dtos.MarcaResponseDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "MARCAS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "codMarca")
public class Marca {

    @Id
    @Column(name = "CODMARCA", nullable = false)
    private Integer codMarca;

    @Column(name = "MARCA", length = 100)
    private String marca;

    @Column(name = "EXPORT", length = 1)
    private String export;

    @Column(name = "LOTEEXPORT")
    private Integer loteExport;

    @Column(name = "FLAGMARCAMONTADORA", length = 1)
    private String flagMarcaMontadora;

    @Column(name = "QTDPARADESCONTO")
    private Integer qtdParaDesconto;

    @Column(name = "DESCONTO")
    private Double desconto;

    public Marca(MarcaResponseDTO data){

        this.codMarca = data.codMarca();
        this.marca = data.marca();
        this.qtdParaDesconto = data.qtdParaDesconto();
        this.desconto = data.desconto();

    }

}

