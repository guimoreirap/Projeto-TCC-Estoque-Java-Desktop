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
public class ModelVendas {
    private int venId;
    private int cliente;
    private Date venDataVenda;
    private double venValorLiquido;
    private double venValorBruto;
    private double venValorDesconto;
    private double venValorRecebido;

    public double getVenValorRecebido() {
        return venValorRecebido;
    }

    public void setVenValorRecebido(double venValorPago) {
        this.venValorRecebido = venValorPago;
    }

    public int getVenId() {
        return venId;
    }

    public void setVenId(int venId) {
        this.venId = venId;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public Date getVenDataVenda() {
        return venDataVenda;
    }

    public void setVenDataVenda(Date venDataVenda) {
        this.venDataVenda = venDataVenda;
    }

    public double getVenValorLiquido() {
        return venValorLiquido;
    }

    public void setVenValorLiquido(double venValorLiquido) {
        this.venValorLiquido = venValorLiquido;
    }

    public double getVenValorBruto() {
        return venValorBruto;
    }

    public void setVenValorBruto(double venValorBruto) {
        this.venValorBruto = venValorBruto;
    }

    public double getVenValorDesconto() {
        return venValorDesconto;
    }

    public void setVenValorDesconto(double venValorDesconto) {
        this.venValorDesconto = venValorDesconto;
    }
    
    
}
