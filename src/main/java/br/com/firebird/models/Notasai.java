
package br.com.firebird.models;

import br.com.interagese.util.FormattedDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
    @JsonSerialize(using = FormattedDateSerializer.class)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false, name = "DTHRLANC")
    private Date dthrlanc;
    
    @Column(updatable = false, name ="NRNOTAF")
    @JsonProperty("numero")
    private String nrnotaf;
    
    @JsonProperty("descuentoTotal")
    @Transient
    private Double descontoTotal;
    
    @JsonProperty("recargoTotal")
    @Transient
    private Double acrescimentoTotal;
    
    @JsonProperty("total")
    @Column(updatable = false, name = "TOTNOTA")
    private Double totnota;
    
    @Transient
    @JsonProperty("codigoMoneda")
    private final String moeda = "986";
    
    @Transient
    @JsonProperty("cotizacion")
    private final double cotacao = 1.00;
    
    @Column(updatable = false, name = "CPFCNPJ")
    @JsonProperty("documentoCliente")
    private String cpfcnpj;
    
    @Transient
    @JsonProperty("detalles")
    private List<Notasaiitens> notasaiitensList = new ArrayList<>();
    
    @Transient
    @JsonProperty("pagos")
    private List<Regcaixa> regcaixaList = new ArrayList<>();

    @JsonIgnore
    @Column(updatable = false, name = "CODSCANNTECH")
    private Integer codscanntech;
    
    @JsonIgnore
    @Column(name = "ENVIOSCANNTECH")
    private String envioscanntech;
    
    @JsonIgnore
    @Column(name = "OBSSCANNTECH")
    private String obsscanntech;
    
    @JsonIgnore
    @Column(name = "NRCAIXA", updatable = false)
    private Integer nrcaixa; 
    
    @JsonIgnore
    @Column(name = "CODFIL", updatable = false)
    private Integer codfil; 
    
    @JsonIgnore
    @Column(name = "SITUACAO", updatable = false)
    private String situacao;
    
    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrnotaf() {
        return nrnotaf;
    }

    public void setNrnotaf(String nrnotaf) {
        this.nrnotaf = nrnotaf;
    }

    public Double getDescontoTotal() {
        return descontoTotal;
    }

    public void setDescontoTotal(Double descontoTotal) {
        this.descontoTotal = descontoTotal;
    }

    public Double getTotnota() {
        return totnota;
    }

    public void setTotnota(Double totnota) {
        this.totnota = totnota;
    }

    @JsonProperty("cancelacion")
    public boolean isCancelada() {
        
        if(situacao.equals("E") || situacao.equals("N")){
            return false;
        }
        
        if(situacao.equals("A") || situacao.equals("C")){
            return true;
        }
        
        return false;
        
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

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Double getAcrescimentoTotal() {
        return acrescimentoTotal;
    }

    public void setAcrescimentoTotal(Double acrescimentoTotal) {
        this.acrescimentoTotal = acrescimentoTotal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
}
