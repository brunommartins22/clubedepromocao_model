/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.firebird.models;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "SINCRONIZACAOPROMO")
@NamedQueries({
    @NamedQuery(name = "Sincpromo.findAll", query = "SELECT s FROM Sincronizacaopromo s")})
public class Sincronizacaopromo {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "STATUS")
    private Integer status;
    @Size(max = 255)
    @Column(name = "DESCOPERACAO")
    private String descoperacao;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Size(max = 1)
    @Column(name = "SITUACAO")
    private String situacao;

    public Sincronizacaopromo() {
    }

    public Sincronizacaopromo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescoperacao() {
        return descoperacao;
    }

    public void setDescoperacao(String descoperacao) {
        this.descoperacao = descoperacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sincronizacaopromo)) {
            return false;
        }
        Sincronizacaopromo other = (Sincronizacaopromo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interagese.scanntech.business.entity.Sincpromo[ codigo=" + codigo + " ]";
    }
    
}
