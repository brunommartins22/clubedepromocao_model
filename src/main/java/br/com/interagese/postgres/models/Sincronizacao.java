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
@Table(name = "sincronizacao")
public class Sincronizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_sincronizacao")
    @SequenceGenerator(name = "gen_sincronizacao", sequenceName = "seq_sincronizacao", allocationSize = 1)
    private Long codigo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA")
    private Date data;

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

}
