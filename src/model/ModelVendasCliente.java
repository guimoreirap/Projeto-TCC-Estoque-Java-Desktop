/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ModelVendasCliente {
    private ModelVendas modelVendas;
    private ModelClientes modelClientes;
    private ArrayList<ModelVendasCliente> listaModelVendasClientes;

    public ModelVendas getModelVendas() {
        return modelVendas;
    }

    public void setModelVendas(ModelVendas modelVendas) {
        this.modelVendas = modelVendas;
    }

    public ModelClientes getModelClientes() {
        return modelClientes;
    }

    public void setModelClientes(ModelClientes modelClientes) {
        this.modelClientes = modelClientes;
    }

    public ArrayList<ModelVendasCliente> getListaModelVendasClientes() {
        return listaModelVendasClientes;
    }

    public void setListaModelVendasClientes(ArrayList<ModelVendasCliente> listaModelVendasClientes) {
        this.listaModelVendasClientes = listaModelVendasClientes;
    }
    
    
}
