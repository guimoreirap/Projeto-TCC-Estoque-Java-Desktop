/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class ModelContasPagar {
    private int idContasPagar;
    private String cpEmpresa;
    private Date cpPrazoPagamento;
    private Date cpDataEmissaoNota;

    public ModelContasPagar() {
    }

    public int getIdContasPagar() {
        return idContasPagar;
    }

    public void setIdContasPagar(int idContasPagar) {
        this.idContasPagar = idContasPagar;
    }

    public String getCpEmpresa() {
        return cpEmpresa;
    }

    public void setCpEmpresa(String cpEmpresa) {
        this.cpEmpresa = cpEmpresa;
    }

    public Date getCpPrazoPagamento() {
        return cpPrazoPagamento;
    }

    public void setCpPrazoPagamento(Date cpPrazoPagamento) {
        this.cpPrazoPagamento = cpPrazoPagamento;
    }

    public Date getCpDataEmissaoNota() {
        return cpDataEmissaoNota;
    }

    public void setCpDataEmissaoNota(Date cpDataEmissaoNota) {
        this.cpDataEmissaoNota = cpDataEmissaoNota;
    }
    
    
}
