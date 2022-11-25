/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class ModelContasPagar {
    private int idContasPagar;
    private String cpEmpresa;
    private String cpPrazoPagamento;
    private Date cpDataEmissaoNota;
    private double cpValor;

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

    public String getCpPrazoPagamento() {
        return cpPrazoPagamento;
    }

    public void setCpPrazoPagamento(String cpPrazoPagamento) {
        this.cpPrazoPagamento = cpPrazoPagamento;
    }

    public Date getCpDataEmissaoNota() {
        return cpDataEmissaoNota;
    }

    public void setCpDataEmissaoNota(Date cpDataEmissaoNota) {
        this.cpDataEmissaoNota = cpDataEmissaoNota;
    }
    
    public double getCpValor(){
        return cpValor;
    }
    
    public void setCpValor(double valor){
        this.cpValor = valor;
    }
}
