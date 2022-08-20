/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoPagamentos;
import java.util.ArrayList;
import model.ModelPagamentos;

/**
 *
 * @author Usuario
 */
public class ControllerPagamentos {
    private DaoPagamentos daoPagamentos = new DaoPagamentos();

    //recebe requisição de salvar produtos de DAO
    public int salvarPagamentoController(ModelPagamentos pModelPagamentos) {
        return this.daoPagamentos.salvarPagamentoDAO(pModelPagamentos);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirPagamentoController(int pCodigo) {
        return this.daoPagamentos.excluirPagamentoDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarPagamentoController(ModelPagamentos pModelPagamentos) {
        return this.daoPagamentos.alterarPagamentoDAO(pModelPagamentos);
    }
    
    //recebe requisição de retornar produto especifico de DAO
    public ModelPagamentos retornarPagamentoController(int pCodigo){
        return this.daoPagamentos.retornarPagamentoDAO(pCodigo);
    }
    
    public ModelPagamentos retornarPagamentoMetodoPagamentoController(String pMetodoPagamento){
        return this.daoPagamentos.retornarPagamentoMetodoPagamentoDAO(pMetodoPagamento);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelPagamentos> retornarListaPagamentoController(){
        return this.daoPagamentos.retornarListaPagamentosDAO();
    }
}
