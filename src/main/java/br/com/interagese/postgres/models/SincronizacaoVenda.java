package br.com.interagese.postgres.models;

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

@Entity
@Table(name = "sincronizacao_venda")
public class SincronizacaoVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sincronizacao_venda")
    @SequenceGenerator(name = "gen_sincronizacao_venda", sequenceName = "seq_sincronizacao_venda", allocationSize = 1)
    private Long id;
    
    private Integer codigoFilial;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA")
    private Date data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getCodigoFilial() {
        return codigoFilial;
    }

    public void setCodigoFilial(Integer codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

}
