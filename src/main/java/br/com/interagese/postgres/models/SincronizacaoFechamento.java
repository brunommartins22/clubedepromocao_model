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
@Table(name = "sincronizacao_fechamento")
public class SincronizacaoFechamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sincronizacao_fechamento")
    @SequenceGenerator(name = "gen_sincronizacao_fechamento", sequenceName = "seq_sincronizacao_fechamento", allocationSize = 1)
    private Long id;
    
    private Integer codigoFilial;

    @Temporal(TemporalType.DATE)
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
