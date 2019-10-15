package br.com.firebird.models;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class RegcaixaPK implements Serializable{

    private Integer nrregis;
    private String nrcontr;

    public Integer getNrregis() {
        return nrregis;
    }

    public void setNrregis(Integer nrregis) {
        this.nrregis = nrregis;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

}
