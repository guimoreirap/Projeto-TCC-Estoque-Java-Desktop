/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoRecebimentos;
import java.util.ArrayList;
import model.ModelRecebimentos;

/**
 *
 * @author Usuario
 */
public class ControllerRecebimentos {
    DaoRecebimentos daoRecebimentos = new DaoRecebimentos();
    
    public int salvarRecebimento(ModelRecebimentos modelRecebimentos) {
        return this.daoRecebimentos.salvarRecebimentoDAO(modelRecebimentos);
    }
    
    public boolean excluirRecebimentoController(int pCodigo) {
        return this.daoRecebimentos.excluirRecebimentoDAO(pCodigo);
    }
    
    public boolean alterarRecebimentoController(ModelRecebimentos pModelPagamentos) {
        return this.daoRecebimentos.alterarRecebimentoDAO(pModelPagamentos);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelRecebimentos> retornarListaRecebimentosController(){
        return this.daoRecebimentos.retornarListaRecebimentosDAO();
    }

    public ModelRecebimentos retornarRecebimentoController(int codigoPagamento) {
        return this.daoRecebimentos.retornarRecebimentoDAO(codigoPagamento);
    }
    
}
