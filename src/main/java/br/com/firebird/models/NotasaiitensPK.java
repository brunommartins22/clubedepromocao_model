package br.com.firebird.models;

import java.io.Serializable;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nrcontr);
        hash = 79 * hash + this.nritem;
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
        final NotasaiitensPK other = (NotasaiitensPK) obj;
        if (this.nritem != other.nritem) {
            return false;
        }
        if (!Objects.equals(this.nrcontr, other.nrcontr)) {
            return false;
        }
        return true;
    }
    
    

}
