package br.com.interagese.postgres.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "sincronizacao_venda_log")
public class SincronizacaoVendaLog implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sincronizacao_venda_log")
    @SequenceGenerator(name = "gen_sincronizacao_venda_log", sequenceName = "seq_sincronizacao_venda_log", allocationSize = 1)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dataEnvio;

    @Column(nullable = false)
    private String numeroCupom;

    @Column(nullable = false)
    private Integer numeroCaixa;

    @Column(nullable = false)
    private Integer codigoFilial;
    
    private String situacao;

    /**
     * E - enviado; R - Error; P - Pendente
     */
    private String erro;

    @Transient
    private String filial;

    @Transient
    private String situacaoDesc;

    //****************************** transient *********************************
    public String validarSituacao() {
        String resp = "";

        switch (situacao) {
            case "E": {
                resp = "Enviado";
                break;
            }
            case "R": {
                resp = "Erro";
            }
            case "P": {
                resp = "Pendente";
            }
        }

        return resp;
    }

    //****************************** get && setts ******************************
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public String getNumeroCupom() {
        return numeroCupom;
    }

    public void setNumeroCupom(String numeroCupom) {
        this.numeroCupom = numeroCupom;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public Integer getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(Integer numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public Integer getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(Integer codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    public String getSituacaoDesc() {
        return situacaoDesc;
    }

    public void setSituacaoDesc(String situacaoDesc) {
        this.situacaoDesc = situacaoDesc;
    }

}
