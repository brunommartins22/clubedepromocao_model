
package br.com.firebird.models;

import br.com.firebird.models.Tabpromoitem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "TABPROMOCAO")
@NamedQueries({
    @NamedQuery(name = "Tabpromocao.findAll", query = "SELECT t FROM Tabpromocao t")})
public class Tabpromocao {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPROMOCAO")
    private Integer codpromocao;
    @Column(name = "CODSCANNTECH")
    private String codscanntech;
    @Size(max = 255)
    @Column(name = "TITULO")
    private String titulo;
    @Size(max = 255)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "TIPO")
    private Integer tipo;
    @Column(name = "DATAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datainicio;
    @Column(name = "DATAFIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datafim;
    @Column(name = "LIMITEPORCUPOM")
    private Integer limiteporcupom;
    @Size(max = 255)
    @Column(name = "AUTOR")
    private String autor;
    @Size(max = 1)
    @Column(name = "SITUACAO")
    private String situacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECO")
    private Double preco;
    @Column(name = "DESCONTO")
    private Double desconto;
    @Column(name = "PAGA")
    private Integer paga;
    @Column(name = "RGCODUSU")
    private Integer rgcodusu;
    @Size(max = 8)
    @Column(name = "RGUSUARIO")
    private String rgusuario;
    @Column(name = "RGDATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rgdata;
    @Column(name = "RGEVENTO")
    private Integer rgevento;
    
    @Transient
    private List<Tabpromoitem> itemList = new ArrayList<>();
    @Transient
    private List<Tabpromoitem> beneficioList = new ArrayList<>();

    public Tabpromocao() {
    }

    public Tabpromocao(Integer codpromocao) {
        this.codpromocao = codpromocao;
    }

    public Integer getCodpromocao() {
        return codpromocao;
    }

    public void setCodpromocao(Integer codpromocao) {
        this.codpromocao = codpromocao;
    }

    public String getCodscanntech() {
        return codscanntech;
    }

    public void setCodscanntech(String codscanntech) {
        this.codscanntech = codscanntech;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(Date datainicio) {
        this.datainicio = datainicio;
    }

    public Date getDatafim() {
        return datafim;
    }

    public void setDatafim(Date datafim) {
        this.datafim = datafim;
    }

    public Integer getLimiteporcupom() {
        return limiteporcupom;
    }

    public void setLimiteporcupom(Integer limiteporcupom) {
        this.limiteporcupom = limiteporcupom;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getPaga() {
        return paga;
    }

    public void setPaga(Integer paga) {
        this.paga = paga;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public Integer getRgevento() {
        return rgevento;
    }

    public void setRgevento(Integer rgevento) {
        this.rgevento = rgevento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpromocao != null ? codpromocao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpromocao)) {
            return false;
        }
        Tabpromocao other = (Tabpromocao) object;
        if ((this.codpromocao == null && other.codpromocao != null) || (this.codpromocao != null && !this.codpromocao.equals(other.codpromocao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interagese.scanntech.business.entity.Tabpromocao[ codpromocao=" + codpromocao + " ]";
    }
    
    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public List<Tabpromoitem> getItemList() {
        return itemList;
    }

    public void setItemList(List<Tabpromoitem> itemList) {
        this.itemList = itemList;
    }

    public List<Tabpromoitem> getBeneficioList() {
        return beneficioList;
    }

    public void setBeneficioList(List<Tabpromoitem> beneficioList) {
        this.beneficioList = beneficioList;
    }
    
}
