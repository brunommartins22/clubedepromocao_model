/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.interagese.postgres.dtos;

import java.sql.Date;

/**
 *
 * @author Bruno Martins
 */
public class ConsultaVendas {

    private String nomeFilial;
    private Date dataVenda;
    private String descricaoPromocao;
    private String ean;
    private Double quantidade;
    private Double desconto;

    //******************************* get && setts *****************************
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
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {

        this.dataVenda = dataVenda;
    }

    /**
     * @return the descricaoPromocao
     */
    public String getDescricaoPromocao() {
        return descricaoPromocao;
    }

    /**
     * @param descricaoPromocao the descricaoPromocao to set
     */
    public void setDescricaoPromocao(String descricaoPromocao) {
        this.descricaoPromocao = descricaoPromocao;
    }

    /**
     * @return the ean
     */
    public String getEan() {
        return ean;
    }

    /**
     * @param ean the ean to set
     */
    public void setEan(String ean) {
        this.ean = ean;
    }

    /**
     * @return the quantidade
     */
    public Double getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the desconto
     */
    public Double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

}
