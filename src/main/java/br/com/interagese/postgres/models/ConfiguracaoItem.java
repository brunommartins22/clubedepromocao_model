/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.postgres.models;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Bruno Martins
 */
@Entity
@Table(name = "configuracao_item")
public class ConfiguracaoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_configuracao_item")
    @SequenceGenerator(name = "gen_configuracao_item", sequenceName = "seq_configuracao_item")
    private Long id;
    private String usuario;
    private String senha;
    private String codigoEmpresa;
    private String empresaPrincipal;
    @Fetch(FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Url> listaUrl;
    @Fetch(FetchMode.SELECT)
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.EAGER)
    private List<FilialScanntech> listaFilial;

    //******************************* Equals && Hashcode ***********************
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final ConfiguracaoItem other = (ConfiguracaoItem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    //******************************** get && setts ****************************
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
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the codigoEmpresa
     */
    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    /**
     * @param codigoEmpresa the codigoEmpresa to set
     */
    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    /**
     * @return the listaUrl
     */
    public List<Url> getListaUrl() {
        return listaUrl;
    }

    /**
     * @param listaUrl the listaUrl to set
     */
    public void setListaUrl(List<Url> listaUrl) {
        this.listaUrl = listaUrl;
    }

    /**
     * @return the listaFilial
     */
    public List<FilialScanntech> getListaFilial() {
        return listaFilial;
    }

    /**
     * @param listaFilial the listaFilial to set
     */
    public void setListaFilial(List<FilialScanntech> listaFilial) {
        this.listaFilial = listaFilial;
    }

    /**
     * @return the empresaPrincipal
     */
    public String getEmpresaPrincipal() {
        return empresaPrincipal;
    }

    /**
     * @param empresaPrincipal the empresaPrincipal to set
     */
    public void setEmpresaPrincipal(String empresaPrincipal) {
        this.empresaPrincipal = empresaPrincipal;
    }
}
