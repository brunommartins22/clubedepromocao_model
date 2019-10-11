package br.com.interagese.firebird.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SCANNTECHCONFIG")
public class ScanntechConfig {

    @Id
    @Column(name = "CODIGO")
    private Integer codigo;
    
    @Column(name = "CODFIL")
    private Integer codfil;

    @Column(name = "CODSCANNTECH")
    private String codscanntech;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "SENHA")
    private String senha;

    @Column(name = "URL1")
    private String url1;
    
    @Column(name = "URL2")
    private String url2;
    
    @Column(name = "URL3")
    private String url3;
    
    @Column(name = "URL4")
    private String url4;
    
    @Column(name = "URL5")
    private String url5;
    
    @Column(name = "URL6")
    private String url6;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "RGDATA")
    private Date rgdata;
    
    @Column(name = "RGEVENTO")
    private String rgevento;

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getCodempresa() {
        return codscanntech;
    }

    public void setCodempresa(String codempresa) {
        this.codscanntech = codempresa;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getUrl4() {
        return url4;
    }

    public void setUrl4(String url4) {
        this.url4 = url4;
    }

    public String getUrl5() {
        return url5;
    }

    public void setUrl5(String url5) {
        this.url5 = url5;
    }

    public String getUrl6() {
        return url6;
    }

    public void setUrl6(String url6) {
        this.url6 = url6;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }
    
    

}
