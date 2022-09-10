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
public class ModelRecebimentos {
    private int recId;
    private int recCliente;
    private Date recData;
    private double recValor;
    private String recMetodo;

    public int getRecId() {
        return recId;
    }

    public void setRecId(int recId) {
        this.recId = recId;
    }

    public int getRecCliente() {
        return recCliente;
    }

    public void setRecCliente(int recCliente) {
        this.recCliente = recCliente;
    }

    public Date getRecData() {
        return recData;
    }

    public void setRecData(Date recData) {
        this.recData = recData;
    }

    public double getRecValor() {
        return recValor;
    }

    public void setRecValor(double recValor) {
        this.recValor = recValor;
    }

    public String getRecMetodo() {
        return recMetodo;
    }

    public void setRecMetodo(String recMetodo) {
        this.recMetodo = recMetodo;
    }
    
}
