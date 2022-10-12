/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoCaixa;
import java.util.ArrayList;
import model.ModelCaixa;

/**
 *
 * @author Usuario
 */
public class ControllerCaixa {
    private DaoCaixa daoCaixa = new DaoCaixa();
    
    public int salvarCaixaController(ModelCaixa pModelCaixa) {
        return this.daoCaixa.salvarCaixaDAO(pModelCaixa);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelCaixa> retornarListaCaixaController(){
        return this.daoCaixa.retornarListaCaixaDAO();
    }
    
    public ArrayList<ModelCaixa> retornarListaCaixaDataController(String data){
        return this.daoCaixa.retornarListaCaixaDataDAO(data);
    }
    
    public ArrayList<ModelCaixa> retornarListaCaixaMovimentacaoController(String movimentacao){
        return this.daoCaixa.retornarListaCaixaMovimentacaoDAO(movimentacao);
    }
    
    public ArrayList<ModelCaixa> retornarListaCaixaController(String movimentacao, String data){
        return this.daoCaixa.retornarListaCaixaDAO(movimentacao, data);
    }
    
    public boolean excluirCaixaController(int pIdVenda, int pIdCliente) {
        return this.daoCaixa.excluirCaixaDAO(pIdVenda, pIdCliente);
    }
}
