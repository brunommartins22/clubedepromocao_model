
package br.com.firebird.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TABFIL")
public class Tabfil implements Serializable{
   
    @Id
    @Column(name = "CODFIL")
    private Integer codfil;
    
    @Column(name = "CODSCANNTECH")
    private Integer codscanntech;

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Integer getCodscanntech() {
        return codscanntech;
    }

    public void setCodscanntech(Integer codscanntech) {
        this.codscanntech = codscanntech;
    }
    
    
    
}
