/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoFornecedores;
import java.util.ArrayList;
import model.ModelFornecedores;

/**
 *
 * @author Usuario
 */
public class ControllerFornecedores {
    private DaoFornecedores daoFornecedores = new DaoFornecedores();

    //recebe requisição de salvar produtos de DAO
    public int salvarFornecedorController(ModelFornecedores pModelClientes) {
        return this.daoFornecedores.salvarFornecedoresDAO(pModelClientes);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirFornecedorController(int pCodigo) {
        return this.daoFornecedores.excluirFornecedorDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarFornecedorController(ModelFornecedores pModelProdutos) {
        return this.daoFornecedores.alterarFornecedorDAO(pModelProdutos);
    }
    
    //recebe requisição de retornar produto especifico de DAO
    public ModelFornecedores retornarFornecedorController(int pCodigo){
        return this.daoFornecedores.retornarFornecedorDAO(pCodigo);
    }
    
    public ModelFornecedores retornarFornecedorController(String pNomeCliente){
        return this.daoFornecedores.retornarFornecedorDAO(pNomeCliente);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelFornecedores> retornarListaFornecedorController(){
        return this.daoFornecedores.retornarListaFornecedoresDAO();
    }
}
