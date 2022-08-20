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
public class ModelPagamentos {
    private int pagId;
    private Date pagData;
    private double pagValor;
    private String pagMetodo;
    private String pagEmpresa;

    public int getPagId() {
        return pagId;
    }

    public void setPagId(int pagId) {
        this.pagId = pagId;
    }

    public Date getPagData() {
        return pagData;
    }

    public void setPagData(Date pagData) {
        this.pagData = pagData;
    }

    public double getPagValor() {
        return pagValor;
    }

    public void setPagValor(double pagValor) {
        this.pagValor = pagValor;
    }

    public String getPagMetodo() {
        return pagMetodo;
    }

    public void setPagMetodo(String pagMetodo) {
        this.pagMetodo = pagMetodo;
    }

    public String getPagEmpresa() {
        return pagEmpresa;
    }

    public void setPagEmpresa(String pagEmpresa) {
        this.pagEmpresa = pagEmpresa;
    }

    
}
