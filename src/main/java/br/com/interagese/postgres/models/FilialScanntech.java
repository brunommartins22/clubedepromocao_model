/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.postgres.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "filial_scanntech")
public class FilialScanntech implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_filial_scanntech")
    @SequenceGenerator(name = "gen_filial_scanntech", sequenceName = "seq_filial_scanntech")
    private Long id;
    private String nomeFilial;
    private Long codigoFilial;
    private Long codigoScanntech;

    //***************************** Equals && Hashcode *************************
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.getId());
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
        final FilialScanntech other = (FilialScanntech) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    //******************************* get && setts *****************************
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nomeFilial
     */
    public String getNomeFilial() {
        return nomeFilial;
    }

    /**
     * @param nomeFilial the nomeFilial to set
     */
    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    /**
     * @return the codigoFilial
     */
    public Long getCodigoFilial() {
        return codigoFilial;
    }

    /**
     * @param codigoFilial the codigoFilial to set
     */
    public void setCodigoFilial(Long codigoFilial) {
        this.codigoFilial = codigoFilial;
    }

    /**
     * @return the codigoScanntech
     */
    public Long getCodigoScanntech() {
        return codigoScanntech;
    }

    /**
     * @param codigoScanntech the codigoScanntech to set
     */
    public void setCodigoScanntech(Long codigoScanntech) {
        this.codigoScanntech = codigoScanntech;
    }

}
