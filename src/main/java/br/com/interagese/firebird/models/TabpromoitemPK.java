/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.firebird.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Jose
 */
@Embeddable
public class TabpromoitemPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CODITEM")
    private int coditem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPROMOCAO")
    private int codpromocao;

    public TabpromoitemPK() {
    }

    public TabpromoitemPK(int coditem, int codpromocao) {
        this.coditem = coditem;
        this.codpromocao = codpromocao;
    }

    public int getCoditem() {
        return coditem;
    }

    public void setCoditem(int coditem) {
        this.coditem = coditem;
    }

    public int getCodpromocao() {
        return codpromocao;
    }

    public void setCodpromocao(int codpromocao) {
        this.codpromocao = codpromocao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) coditem;
        hash += (int) codpromocao;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabpromoitemPK)) {
            return false;
        }
        TabpromoitemPK other = (TabpromoitemPK) object;
        if (this.coditem != other.coditem) {
            return false;
        }
        if (this.codpromocao != other.codpromocao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interagese.scanntech.business.entity.TabpromoitemPK[ coditem=" + coditem + ", codpromocao=" + codpromocao + " ]";
    }
    
}
