/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class ModelCaixa {
    private int caixaId;
    private int caixaIdMovimentacao;
    private Date caixaData;
    private String caixaMovimentacao;
    private double caixaValor;

    public Date getCaixaData() {
        return caixaData;
    }

    public void setCaixaData(Date caixaData) {
        this.caixaData = caixaData;
    }

    public String getCaixaMovimentacao() {
        return caixaMovimentacao;
    }

    public void setCaixaMovimentacao(String caixaMovimentacao) {
        this.caixaMovimentacao = caixaMovimentacao;
    }

    public int getCaixaIdMovimentacao() {
        return caixaIdMovimentacao;
    }

    public void setCaixaIdMovimentacao(int caixaId) {
        this.caixaIdMovimentacao = caixaId;
    }

    public double getCaixaValor() {
        return caixaValor;
    }

    public void setCaixaValor(double caixaValor) {
        this.caixaValor = caixaValor;
    }

    public int getCaixaId() {
        return caixaId;
    }

    public void setCaixaId(int caixaId) {
        this.caixaId = caixaId;
    }
    
    
}
