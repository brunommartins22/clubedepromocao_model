package br.com.firebird.models;

import java.io.Serializable;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nrregis);
        hash = 71 * hash + Objects.hashCode(this.nrcontr);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegcaixaPK other = (RegcaixaPK) obj;
        if (!Objects.equals(this.nrcontr, other.nrcontr)) {
            return false;
        }
        if (!Objects.equals(this.nrregis, other.nrregis)) {
            return false;
        }
        return true;
    }
    
}
