
package br.com.firebird.models;

import br.com.interagese.util.DecimalJsonSerializer;
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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    
    @Transient
    @JsonProperty("descuentoTotal")
    @JsonSerialize(using = DecimalJsonSerializer.class)
    private Double descontoTotal = 0.0;
    
    @Transient
    @JsonProperty("recargoTotal")
    @JsonSerialize(using = DecimalJsonSerializer.class)
    private Double acrescimentoTotal = 0.0;
    
    @JsonProperty("total")
    @Column(updatable = false, name = "TOTGERAL")
    @JsonSerialize(using = DecimalJsonSerializer.class)
    private Double totgeral;
    
    @JsonIgnore
    @Column(updatable = false, name = "VLDESCNOT")
    private Double vldescnot;
    
    @JsonIgnore
    @Column(updatable = false, name = "VLSUBSIDIOTOTAL")
    private Double vlsubsidiototal;
    
    @Transient
    @JsonProperty("codigoMoneda")
    private final String moeda = "986";
    
    @Transient
    @JsonProperty("cotizacion")
    private final double cotacao = 1.00;
    
    @Column(updatable = false, name = "CPFCNPJ")
    @JsonProperty("documentoCliente")
    private String cpfcnpj;
    
    @JsonProperty("detalles")
    @Transient
//    @Fetch(FetchMode.SELECT)
//    @JoinColumn(name = "NRCONTR", referencedColumnName = "NRCONTR")
//    @OneToMany(fetch = FetchType.EAGER)
    private List<Notasaiitens> notasaiitensList = new ArrayList<>();
    
    @JsonProperty("pagos")
    @Fetch(FetchMode.SELECT)
    @JoinColumn(name = "NRCONTR", referencedColumnName = "NRCONTR")
    @OneToMany(fetch = FetchType.EAGER)
    private List<Regcaixa> regcaixaList;
    
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

    public Double getDescontoTotal() {
        return descontoTotal;
    }

    public void setDescontoTotal(Double descontoTotal) {
        this.descontoTotal = descontoTotal;
    }

    public Double getTotgeral() {
        return totgeral;
    }

    public void setTotgeral(Double totgeral) {
        this.totgeral = totgeral;
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

    public Double getVldescnot() {
        return vldescnot;
    }

    public void setVldescnot(Double vldescnot) {
        this.vldescnot = vldescnot;
    }
    
    @JsonProperty("numero")
    public String getNumeroCupom(){
        String numeroCupom = nrcontr.replaceAll("[^0-9]", "");
        if(isCancelada()){
            numeroCupom = "-" + numeroCupom;
        }
        
        return numeroCupom;
    }

    public Double getVlsubsidiototal() {
        return vlsubsidiototal;
    }

    public void setVlsubsidiototal(Double vlsubsidiototal) {
        this.vlsubsidiototal = vlsubsidiototal;
    }
    
}
