/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoVendasClientes;
import java.util.ArrayList;
import model.ModelVendasCliente;

/**
 *
 * @author Usuario
 */
public class ControllerVendasCliente {
    DaoVendasClientes daoVendasCliente = new DaoVendasClientes();
    
    public ArrayList<ModelVendasCliente> getListaVendasClienteController() {
        return this.daoVendasCliente.getListaVendasClienteDAO();
    }
    
}
