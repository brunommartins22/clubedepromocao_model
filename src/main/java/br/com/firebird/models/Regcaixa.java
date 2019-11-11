package br.com.firebird.models;

import br.com.interagese.promocao.enuns.TipoDePagamento;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "regcaixa")
public class Regcaixa {

    @EmbeddedId
    @JsonIgnore
    private RegcaixaPK regcaixaPK;

    @JsonIgnore
    @Column(name = "TPFORMA")
    private Integer tpforma;

    @JsonProperty("codigoMoneda")
    @Transient
    private final String moeda = "986";

    @JsonProperty("importe")
    @Column(name = "VLPAGO")
    private Double vlpago;

    @JsonProperty("cotizacion")
    @Transient
    private final Double cotacao = 1.00;

    @Transient
    private final String documentoCliente = null;

    @Transient
    private final String bin = null;

    @JsonProperty("codigoTarjeta")
    @Transient
    private final String codigoCartao = null;

    @JsonProperty("codigoTipoPago")
    public Integer getTipoDePagamento() {
        switch (tpforma) {
            case 0:
                return TipoDePagamento.DINHEIRO.getCodigo();
            case 1:
                return TipoDePagamento.CREDITO.getCodigo();
            case 2:
                return TipoDePagamento.DEBITO.getCodigo();
            case 3:
                return TipoDePagamento.TICKET_ALIMENTACAO.getCodigo();
            case 4:
            case 5:
                return TipoDePagamento.CHEQUE.getCodigo();
            default:
                return TipoDePagamento.DINHEIRO.getCodigo();
        }
    }
    
    public RegcaixaPK getRegcaixaPK() {
        return regcaixaPK;
    }

    public void setRegcaixaPK(RegcaixaPK regcaixaPK) {
        this.regcaixaPK = regcaixaPK;
    }

    public Double getVlpago() {
        return vlpago;
    }

    public void setVlpago(Double vlpago) {
        this.vlpago = vlpago;
    }

    public String getMoeda() {
        return moeda;
    }

    public Double getCotacao() {
        return cotacao;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public String getBin() {
        return bin;
    }

    public String getCodigoCartao() {
        return codigoCartao;
    }

}
