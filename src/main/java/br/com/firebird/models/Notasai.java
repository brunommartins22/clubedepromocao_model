
package br.com.firebird.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity()
@Table(name= "notasai")
public class Notasai implements Serializable{
    
    @Id
    @JsonIgnore
    @Column(name = "NRCONTR")
    private String nrcontr;
    
    @JsonProperty("fecha")
    @JsonFormat(pattern = "yyyy-MM-hh'T'HH:mm:ssZ")
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DTHRLANC")
    private Date dthrlanc;
    
    @Column(name ="NRNOTANFE")
    @JsonProperty("numero")
    private String nrnotanfe;
    
    @JsonProperty("descuentoTotal")
    @Column(name = "VLDESCNOT")
    private Double vldescnot;
    
    @JsonProperty("total")
    @Column(name = "TOTNOTA")
    private Double totnota;
    
    @JsonProperty("cancelacion")
    @Transient
    private boolean cancelada = false;
    
    @Transient
    @JsonProperty("codigoMoneda")
    private final String moeda = "986";
    
    @Transient
    @JsonProperty("cotizacion")
    private final double cotacao = 1.00;
    
    @Column(name = "CPFCNPJ")
    @JsonProperty("documentoCliente")
    private String cpfcnpj;
    
    @Transient
    @JsonProperty("detalles")
    private List<Notasaiitens> notasaiitensList = new ArrayList<>();
    
    @Transient
    @JsonProperty("pagos")
    private List<Regcaixa> regcaixaList = new ArrayList<>();

    @JsonIgnore
    @Column(name = "CODSCANNTECH")
    private Integer codscanntech;
    
    @JsonIgnore
    @Column(name = "ENVIOSCANNTECH")
    private String envioscanntech;
    
    @JsonIgnore
    @Column(name = "OBSSCANNTECH")
    private String obsscanntech;
    
    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrnotanfe() {
        return nrnotanfe;
    }

    public void setNrnotanfe(String nrnotanfe) {
        this.nrnotanfe = nrnotanfe;
    }

    public Double getVldescnot() {
        return vldescnot;
    }

    public void setVldescnot(Double vldescnot) {
        this.vldescnot = vldescnot;
    }

    public Double getTotnota() {
        return totnota;
    }

    public void setTotnota(Double totnota) {
        this.totnota = totnota;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public List<Notasaiitens> getNotasaiitensList() {
        return notasaiitensList;
    }

    public void setNotasaiitensList(List<Notasaiitens> notasaiitensList) {
        this.notasaiitensList = notasaiitensList;
    }

    public List<Regcaixa> getRegcaixaList() {
        return regcaixaList;
    }

    public void setRegcaixaList(List<Regcaixa> regcaixaList) {
        this.regcaixaList = regcaixaList;
    }

    public String getMoeda() {
        return moeda;
    }

    public double getCotacao() {
        return cotacao;
    }

    public Date getDthrlanc() {
        return dthrlanc;
    }

    public void setDthrlanc(Date dthrlanc) {
        this.dthrlanc = dthrlanc;
    }

    public Integer getCodscanntech() {
        return codscanntech;
    }

    public void setCodscanntech(Integer codscanntech) {
        this.codscanntech = codscanntech;
    }

    public String getEnvioscanntech() {
        return envioscanntech;
    }

    public void setEnvioscanntech(String envioscanntech) {
        this.envioscanntech = envioscanntech;
    }

    public String getObsscanntech() {
        return obsscanntech;
    }

    public void setObsscanntech(String obsscanntech) {
        this.obsscanntech = obsscanntech;
    }
    
}
