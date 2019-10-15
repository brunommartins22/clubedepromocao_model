
package br.com.firebird.models;

import br.com.interagese.promocao.Tabpromocao;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TABPROMOITEM")
@NamedQueries({
    @NamedQuery(name = "Tabpromoitem.findAll", query = "SELECT t FROM Tabpromoitem t")})
@SqlResultSetMappings({
    @SqlResultSetMapping(name = "produtos-desconto-variavel", classes = {
        @ConstructorResult(targetClass = Tabpromoitem.class, columns = {
            @ColumnResult(name = "codpromocao"),
            @ColumnResult(name = "codfil"),
            @ColumnResult(name = "nomfil"),
            @ColumnResult(name = "codpro"),
            @ColumnResult(name = "codbarun"),
            @ColumnResult(name = "quantidade"),
            @ColumnResult(name = "desconto"),
            @ColumnResult(name = "descpro"),
            @ColumnResult(name = "prvapro"),
            @ColumnResult(name = "prcustocom")
        })
    }),
    @SqlResultSetMapping(name = "produtos-preco-fixo", classes = {
        @ConstructorResult(targetClass = Tabpromoitem.class, columns = {
            @ColumnResult(name = "codpromocao"),
            @ColumnResult(name = "codfil"),
            @ColumnResult(name = "nomfil"),
            @ColumnResult(name = "codpro"),
            @ColumnResult(name = "codbarun"),
            @ColumnResult(name = "quantidade"),
            @ColumnResult(name = "preco"),
            @ColumnResult(name = "descpro"),
            @ColumnResult(name = "prvapro"),
            @ColumnResult(name = "pratpro"),
            @ColumnResult(name = "prcustocom")
        })
    }),
    @SqlResultSetMapping(name = "produtos-leva-paga", classes = {
        @ConstructorResult(targetClass = Tabpromoitem.class, columns = {
            @ColumnResult(name = "codpromocao"),
            @ColumnResult(name = "codfil"),
            @ColumnResult(name = "nomfil"),
            @ColumnResult(name = "codpro"),
            @ColumnResult(name = "codbarun"),
            @ColumnResult(name = "quantidade"),
            @ColumnResult(name = "paga"),
            @ColumnResult(name = "descpro"),
            @ColumnResult(name = "prvapro"),
            @ColumnResult(name = "prcustocom")
        })
    })
})
public class Tabpromoitem {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TabpromoitemPK tabpromoitemPK = new TabpromoitemPK();
    @Size(max = 6)
    @Column(name = "CODPRO")
    private String codpro;
    @Size(max = 20)
    @Column(name = "CODBARUN")
    private String codbarun;
    @Size(max = 1)
    @Column(name = "TIPO")
    private String tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTIDADE")
    private Double quantidade;
    @Column(name = "DESCPRO")
    private String descpro;
    @JoinColumn(name = "CODPROMOCAO", referencedColumnName = "CODPROMOCAO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Tabpromocao tabpromocao;

    @Transient
    private Integer codfil;
    @Transient
    private Double desconto;
    @Transient
    private Double precoPromocional;
    @Transient
    private Double prvapro;
    @Transient
    private Double prcustocom;
    @Transient
    private Double lucroPercentual;
    @Transient
    private Double lucroReal;
    @Transient
    private Integer paga;
    @Transient
    private Double prtotal;
    @Transient
    private String nomfil;

    public Tabpromoitem() {
    }

    public Tabpromoitem(Integer codpromocao, Integer codfil, String nomfil, String codpro, String codbarun, Double quantidade, Double desconto, String descpro, Double prvapro, Double prcustocom){
        this.tabpromoitemPK = new TabpromoitemPK(0, codpromocao);
        this.codfil = codfil;
        this.nomfil = nomfil;
        this.codpro = codpro;
        this.codbarun = codbarun;
        this.quantidade = quantidade;
        this.desconto = desconto;
        this.descpro = descpro;
        this.prvapro = prvapro;
        this.prcustocom = prcustocom;
    }
    
    public Tabpromoitem(Integer codpromocao, Integer codfil, String nomfil, String codpro, String codbarun, Double quantidade, Integer paga, String descpro, Double prvapro, Double prcustocom){
        this.tabpromoitemPK = new TabpromoitemPK(0, codpromocao);
        this.codfil = codfil;
        this.nomfil = nomfil;
        this.codpro = codpro;
        this.codbarun = codbarun;
        this.quantidade = quantidade;
        this.paga = paga;
        this.descpro = descpro;
        this.prvapro = prvapro;
        this.prcustocom = prcustocom;
    }
    
    public Tabpromoitem(Integer codpromocao, Integer codfil, String nomfil, String codpro, String codbarun, Double quantidade, Double preco, String descpro, Double prvapro, Double pratpro, Double prcustocom){
        this.tabpromoitemPK = new TabpromoitemPK(0, codpromocao);
        this.codfil = codfil;
        this.nomfil = nomfil;
        this.codpro = codpro;
        this.codbarun = codbarun;
        this.quantidade = quantidade;
        this.precoPromocional = preco;
        this.descpro = descpro;
        this.prcustocom = prcustocom;
        this.prvapro = prvapro;
    }
    
    public Tabpromoitem(TabpromoitemPK tabpromoitemPK) {
        this.tabpromoitemPK = tabpromoitemPK;
    }

    public Tabpromoitem(int coditem, int codpromocao) {
        this.tabpromoitemPK = new TabpromoitemPK(coditem, codpromocao);
    }

    public TabpromoitemPK getTabpromoitemPK() {
        return tabpromoitemPK;
    }

    public void setTabpromoitemPK(TabpromoitemPK tabpromoitemPK) {
        this.tabpromoitemPK = tabpromoitemPK;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCodbarun() {
        return codbarun;
    }

    public void setCodbarun(String codbarun) {
        this.codbarun = codbarun;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Tabpromocao getTabpromocao() {
        return tabpromocao;
    }

    public void setTabpromocao(Tabpromocao tabpromocao) {
        this.tabpromocao = tabpromocao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabpromoitemPK != null ? tabpromoitemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpromoitem)) {
            return false;
        }
        Tabpromoitem other = (Tabpromoitem) object;
        if ((this.tabpromoitemPK == null && other.tabpromoitemPK != null) || (this.tabpromoitemPK != null && !this.tabpromoitemPK.equals(other.tabpromoitemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.interagese.scanntech.business.entity.Tabpromoitem[ tabpromoitemPK=" + tabpromoitemPK + " ]";
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getPrcustocom() {
        return prcustocom;
    }

    public void setPrcustocom(Double prcustocom) {
        this.prcustocom = prcustocom;
    }

    public Double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(Double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public Double getLucroPercentual() {
        return lucroPercentual;
    }

    public void setLucroPercentual(Double lucroPercentual) {
        this.lucroPercentual = lucroPercentual;
    }

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    public Integer getPaga() {
        return paga;
    }

    public void setPaga(Integer paga) {
        this.paga = paga;
    }

    public Double getPrtotal() {
        return prtotal;
    }

    public void setPrtotal(Double prtotal) {
        this.prtotal = prtotal;
    }

    public Double getLucroReal() {
        return lucroReal;
    }

    public void setLucroReal(Double lucroReal) {
        this.lucroReal = lucroReal;
    }

    public String getNomfil() {
        return nomfil;
    }

    public void setNomfil(String nomfil) {
        this.nomfil = nomfil;
    }
    
}
