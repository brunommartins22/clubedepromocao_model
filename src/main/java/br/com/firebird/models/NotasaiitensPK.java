package br.com.firebird.models;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class NotasaiitensPK implements Serializable {

    private String nrcontr;

    private int nritem;

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

}
