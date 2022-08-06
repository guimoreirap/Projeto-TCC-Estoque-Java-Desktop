/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoClientes;
import java.util.ArrayList;
import model.ModelClientes;

/**
 *
 * @author Usuario
 */
public class ControllerClientes {
    private DaoClientes daoClientes = new DaoClientes();

    //recebe requisição de salvar produtos de DAO
    public int salvarClienteController(ModelClientes pModelClientes) {
        return this.daoClientes.salvarClientesDAO(pModelClientes);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirClienteController(int pCodigo) {
        return this.daoClientes.excluirClienteDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarClienteController(ModelClientes pModelProdutos) {
        return this.daoClientes.alterarClienteDAO(pModelProdutos);
    }
    
    //recebe requisição de retornar produto especifico de DAO
    public ModelClientes retornarClienteController(int pCodigo){
        return this.daoClientes.retornarClienteDAO(pCodigo);
    }
    
    public ModelClientes retornarClienteController(String pNomeCliente){
        return this.daoClientes.retornarClienteDAO(pNomeCliente);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelClientes> retornarListaClienteController(){
        return this.daoClientes.retornarListaClientesDAO();
    }
}
