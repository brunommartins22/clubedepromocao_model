package br.com.interagese.postgres.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "fechamento_promocao")
@SqlResultSetMapping(name = "fechamento", classes = {
    @ConstructorResult(targetClass = FechamentoPromocao.class, columns = {
        @ColumnResult(name = "codfil"),
        @ColumnResult(name = "nrcaixa"),
        @ColumnResult(name = "data_do_fechamento"),
        @ColumnResult(name = "valor_total_vendas"),
        @ColumnResult(name = "quantidade_vendas"),
        @ColumnResult(name = "valor_total_cancelamentos"),
        @ColumnResult(name = "quantidade_cancelamentos")
    })
})
public class FechamentoPromocao implements Serializable{

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_fechamento_promocao")
    @SequenceGenerator(name = "gen_fechamento_promocao", sequenceName = "seq_fechamento_promocao", allocationSize = 1)
    private Long id;

    @JsonIgnore
    @Column(nullable = false)
    private Long codigoFilial;

    @JsonIgnore
    @Column(nullable = false)
    private Long codigoScanntech;

    @JsonIgnore
    @Column(nullable = false)
    private Long numeroCaixa;

    @JsonProperty("fechaVentas")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataDoFechamento;

    @JsonProperty("montoVentaLiquida")
    @Column(nullable = false)
    private Double valorTotalVendas;

    @JsonProperty("cantidadMovimientos")
    @Column(nullable = false)
    private Long quantidadeVendas;

    @JsonProperty("montoCancelaciones")
    @Column(nullable = false)
    private Double valorTotalCancelamentos;

    @JsonProperty("cantidadCancelaciones")
    @Column(nullable = false)
    private Long quantidadeCancelamentos;
    
    @JsonIgnore
    @Column(nullable = false)
    private String envioScanntech;
    
    @JsonIgnore
    private String obsScanntech;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date dataEnvio; 
            
    @JsonIgnore
    private boolean reenvio;

    public FechamentoPromocao(Number codigoFilial, 
                              Number numeroCaixa, 
                              Date dataDoFechamento, 
                              Number valorTotalVendas, 
                              Number quantidadeVendas, 
                              Number valorTotalCancelamentos, 
                              Number quantidadeCancelamentos) {
        this.codigoFilial = codigoFilial.longValue();
        this.numeroCaixa = numeroCaixa.longValue();
        this.dataDoFechamento = dataDoFechamento;
        this.valorTotalVendas = valorTotalVendas.doubleValue();
        this.quantidadeVendas = quantidadeVendas.longValue();
        this.valorTotalCancelamentos = valorTotalCancelamentos.doubleValue();
        this.quantidadeCancelamentos = quantidadeCancelamentos.longValue();
    }
    

    //private Long 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(Long codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    public Long getCodigoScanntech() {
        return codigoScanntech;
    }

    public void setCodigoScanntech(Long codigoScanntech) {
        this.codigoScanntech = codigoScanntech;
    }

    public Date getDataDoFechamento() {
        return dataDoFechamento;
    }

    public void setDataDoFechamento(Date dataDoFechamento) {
        this.dataDoFechamento = dataDoFechamento;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

    public Long getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(Long quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public Double getValorTotalCancelamentos() {
        return valorTotalCancelamentos;
    }

    public void setValorTotalCancelamentos(Double valorTotalCancelamentos) {
        this.valorTotalCancelamentos = valorTotalCancelamentos;
    }

    public Long getQuantidadeCancelamentos() {
        return quantidadeCancelamentos;
    }

    public void setQuantidadeCancelamentos(Long quantidadeCancelamentos) {
        this.quantidadeCancelamentos = quantidadeCancelamentos;
    }

    public Long getNumeroCaixa() {
        return numeroCaixa;
    }

    public void setNumeroCaixa(Long numeroCaixa) {
        this.numeroCaixa = numeroCaixa;
    }

    public String getEnvioScanntech() {
        return envioScanntech;
    }

    public void setEnvioScanntech(String envioScanntech) {
        this.envioScanntech = envioScanntech;
    }

    public String getObsScanntech() {
        return obsScanntech;
    }

    public void setObsScanntech(String obsScanntech) {
        this.obsScanntech = obsScanntech;
    }

    public boolean isReenvio() {
        return reenvio;
    }

    public void setReenvio(boolean reenvio) {
        this.reenvio = reenvio;
    }

    public void setCodigoScanntech(int codscanntech) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

}
