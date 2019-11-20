/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.postgres.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "configuracao")
public class Configuracao implements Serializable {

    @Id
    private Long id;
    private Integer intervaloSincronizacao;
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date primeiraSincronizacao;
    @Fetch(FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ConfiguracaoItem> configuracaoItem;

    //*************************** Equals && Hashcode ***************************
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.getId());
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
        final Configuracao other = (Configuracao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    //**************************** get && setts ********************************
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
     * @return the intervaloSincronizacao
     */
    public Integer getIntervaloSincronizacao() {
        return intervaloSincronizacao;
    }

    /**
     * @param intervaloSincronizacao the intervaloSincronizacao to set
     */
    public void setIntervaloSincronizacao(Integer intervaloSincronizacao) {
        this.intervaloSincronizacao = intervaloSincronizacao;
    }

    /**
     * @return the configuracaoItem
     */
    public List<ConfiguracaoItem> getConfiguracaoItem() {
        return configuracaoItem;
    }

    /**
     * @param configuracaoItem the configuracaoItem to set
     */
    public void setConfiguracaoItem(List<ConfiguracaoItem> configuracaoItem) {
        this.configuracaoItem = configuracaoItem;
    }

    public Date getPrimeiraSincronizacao() {
        return primeiraSincronizacao;
    }

    public void setPrimeiraSincronizacao(Date primeiraSincronizacao) {
        this.primeiraSincronizacao = primeiraSincronizacao;
    }

}
