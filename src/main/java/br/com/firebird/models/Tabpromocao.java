package br.com.firebird.models;

import br.com.firebird.models.Tabpromoitem;
import java.text.SimpleDateFormat;
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
public class Tabpromocao {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPROMOCAO")
    private Integer codpromocao;
    @Column(name = "CODSCANNTECH")
    private Integer codscanntech;
    @Size(max = 255)
    @Column(name = "TITULO")
    private String titulo;
    @Size(max = 255)
    @Column(name = "DESCRICAO")
    private String descricao;
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
    @Column(name = "TIPO")
    private Integer tipo;
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
    @Transient
    private String tipoDesc;
    @Transient
    private String situacaoDesc;
    @Transient
    private String dataInicioDesc;
    @Transient
    private String dataFimDesc;
    @Transient
    private String resumoPromo;
    @Transient
    private Integer countRejeitados;
    @Transient
    private Integer countInativos;
    @Transient
    private Integer countPendentes;
    @Transient
    private Integer countAtivos;

    public Tabpromocao() {
    }

    public Tabpromocao(Integer codpromocao) {
        this.codpromocao = codpromocao;
    }

    //**************************** transient ***********************************
    public String getValidarTipo() {
        String resp = "";
        switch (tipo) {
            case 1: {
                resp = "Presente Adicional";
                break;
            }
            case 2: {
                resp = "Leva M Paga N";
                break;
            }
            case 3: {
                resp = "Desconto Variável";
                break;
            }
            case 4: {
                resp = "Desconto Adicional";
                break;
            }
            case 5: {
                resp = "Preço Fixo";
                break;
            }
            case 6: {
                resp = "Desconto Fixo";
            }
        }
        return resp;
    }

    public String getValidarData(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);

    }

    public String getValidarSituacao() {
        String resp = "";
        switch (situacao) {
            case "A": {
                resp = "Ativa";
                break;
            }
            case "I": {
                resp = "Inativa";
                break;
            }
            case "P": {
                resp = "Pendente";
                break;
            }
            case "R": {
                resp = "Rejeitada";
                break;
            }
        }

        return resp;
    }

    //***************************** get && setts *******************************
    public Integer getCodpromocao() {
        return codpromocao;
    }

    public void setCodpromocao(Integer codpromocao) {
        this.codpromocao = codpromocao;
    }

    public Integer getCodscanntech() {
        return codscanntech;
    }

    public void setCodscanntech(Integer codscanntech) {
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

    public String getTipoDesc() {
        return tipoDesc;
    }

    public void setTipoDesc(String tipoDesc) {
        this.tipoDesc = tipoDesc;
    }

    /**
     * @return the dataInicioDesc
     */
    public String getDataInicioDesc() {
        return dataInicioDesc;
    }

    /**
     * @param dataInicioDesc the dataInicioDesc to set
     */
    public void setDataInicioDesc(String dataInicioDesc) {
        this.dataInicioDesc = dataInicioDesc;
    }

    /**
     * @return the dataFimDesc
     */
    public String getDataFimDesc() {
        return dataFimDesc;
    }

    /**
     * @param dataFimDesc the dataFimDesc to set
     */
    public void setDataFimDesc(String dataFimDesc) {
        this.dataFimDesc = dataFimDesc;
    }

    /**
     * @return the situacaoDesc
     */
    public String getSituacaoDesc() {
        return situacaoDesc;
    }

    /**
     * @param situacaoDesc the situacaoDesc to set
     */
    public void setSituacaoDesc(String situacaoDesc) {
        this.situacaoDesc = situacaoDesc;
    }

    /**
     * @return the resumoPromo
     */
    public String getResumoPromo() {
        return resumoPromo;
    }

    /**
     * @param resumoPromo the resumoPromo to set
     */
    public void setResumoPromo(String resumoPromo) {
        this.resumoPromo = resumoPromo;
    }

    /**
     * @return the countInativos
     */
    public Integer getCountInativos() {
        return countInativos;
    }

    /**
     * @param countInativos the countInativos to set
     */
    public void setCountInativos(Integer countInativos) {
        this.countInativos = countInativos;
    }

    /**
     * @return the countPendentes
     */
    public Integer getCountPendentes() {
        return countPendentes;
    }

    /**
     * @param countPendentes the countPendentes to set
     */
    public void setCountPendentes(Integer countPendentes) {
        this.countPendentes = countPendentes;
    }

    /**
     * @return the countAtivos
     */
    public Integer getCountAtivos() {
        return countAtivos;
    }

    /**
     * @param countAtivos the countAtivos to set
     */
    public void setCountAtivos(Integer countAtivos) {
        this.countAtivos = countAtivos;
    }

    /**
     * @return the countRejeitados
     */
    public Integer getCountRejeitados() {
        return countRejeitados;
    }

    /**
     * @param countRejeitados the countRejeitados to set
     */
    public void setCountRejeitados(Integer countRejeitados) {
        this.countRejeitados = countRejeitados;
    }

}
