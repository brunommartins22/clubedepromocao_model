
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

@Entity
@Table(name = "sincronizacao_promocao")
public class SincronizacaoPromocao implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sincronizacao_promocao")
    @SequenceGenerator(name = "gen_sincronizacao_promocao", sequenceName = "seq_sincronizacao_promocao", allocationSize = 1)
    private Long codigo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA")
    private Date data;
    
    @Column(nullable = false)
    private Integer promocoesBaixadas;

    public SincronizacaoPromocao(Integer promocoesBaixadas) {
        this.promocoesBaixadas = promocoesBaixadas;
        data = new Date();
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Integer getPromocoesBaixadas() {
        return promocoesBaixadas;
    }

    public void setPromocoesBaixadas(Integer promocoesBaixadas) {
        this.promocoesBaixadas = promocoesBaixadas;
    }
    
}
