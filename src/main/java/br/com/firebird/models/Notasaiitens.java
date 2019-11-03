package br.com.firebird.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "NOTASAIITENS")
@SqlResultSetMapping(name = "detalhes", classes = {
    @ConstructorResult(targetClass = Notasaiitens.class, columns = {
        @ColumnResult(name = "codpro"),
        @ColumnResult(name = "codbarun"),
        @ColumnResult(name = "descpro"),
        @ColumnResult(name = "qtdvend"),
        @ColumnResult(name = "vlunit"),
        @ColumnResult(name = "vltotal"),
        @ColumnResult(name = "desconto"),
        @ColumnResult(name = "acrescimo")
    })
})
public class Notasaiitens implements Serializable {

    @JsonIgnore
    @EmbeddedId
    private NotasaiitensPK notasaiitensPK;

    @JsonProperty("codigoArticulo")
    @Column(name = "CODPRO")
    private String codpro;

    @JsonProperty("codigoBarras")
    @Column(name = "CODDIG")
    private String coddig;

    @JsonProperty("descripcionArticulo")
    @Column(name = "DESCPRO")
    private String descpro;

    @JsonProperty("cantidad")
    @Column(name = "QTDVEND")
    private Double qtdvend;

    @JsonProperty("importeUnitario")
    @Column(name = "VLUNIT")
    private Double vlunit;

    @JsonProperty("importe")
    @Column(name = "VLTOTAL")
    private Double vltotal;

    @JsonIgnore
    @Column(name = "VLDESACRITE")
    private Double vldesacrite;

    @JsonIgnore
    @Column(name = "TPDESACRITE")
    private String tpdesacrite;

    @Transient
    @JsonIgnore
    private Double acrescimo;

    @Transient
    @JsonIgnore
    private Double desconto;

    @Transient
    @JsonIgnore
    private boolean queryNativa;

    public Notasaiitens() {
        queryNativa = false;
    }

    public Notasaiitens(String codpro, String coddig, String descpro, Double qtdvend, Double vlunit, Number vltotal, Number desconto, Number acrescimo) {
        this.codpro = codpro;
        this.coddig = coddig;
        this.descpro = descpro;
        this.qtdvend = qtdvend;
        this.vlunit = vlunit;
        this.vltotal = vltotal.doubleValue();
        this.acrescimo = acrescimo.doubleValue();
        this.desconto = desconto.doubleValue();
        queryNativa = true;
    }

    @JsonProperty("recargo")
    public Double getAcrescimo() {
        if (!queryNativa) {
            if (tpdesacrite == null) {
                return 0.0;
            }

            switch (tpdesacrite) {
                case "N":
                    return 0.0;
                case "A":
                    return vldesacrite;
                case "D":
                    return 0.0;
                default:
                    return 0.0;
            }
        } else {
            return acrescimo;
        }

    }

    @JsonProperty("descuento")
    public Double getDesconto() {

        if (!queryNativa) {
            if (tpdesacrite == null) {
                return 0.0;
            }

            switch (tpdesacrite) {
                case "N":
                    return 0.0;
                case "A":
                    return 0.0;
                case "D":
                    return vldesacrite;
                default:
                    return 0.0;
            }
        }else{
            return desconto;
        }

    }

    public NotasaiitensPK getNotasaiitensPK() {
        return notasaiitensPK;
    }

    public void setNotasaiitensPK(NotasaiitensPK notasaiitensPK) {
        this.notasaiitensPK = notasaiitensPK;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCoddig() {
        return coddig;
    }

    public void setCoddig(String coddig) {
        this.coddig = coddig;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Double getQtdvend() {
        return qtdvend;
    }

    public void setQtdvend(Double qtdvend) {
        this.qtdvend = qtdvend;
    }

    public Double getVlunit() {
        return vlunit;
    }

    public void setVlunit(Double vlunit) {
        this.vlunit = vlunit;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }
}
