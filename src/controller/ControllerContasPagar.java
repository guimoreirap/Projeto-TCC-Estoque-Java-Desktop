/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoContasPagar;
import java.util.ArrayList;
import model.ModelContasPagar;

public class ControllerContasPagar {
    DaoContasPagar daoContasPagar = new DaoContasPagar();
    
    public int salvarContasPagarController(ModelContasPagar pModelContasPagar) {
        return this.daoContasPagar.salvarContasPagarDAO(pModelContasPagar);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirContasPagarController(int pCodigo) {
        return this.daoContasPagar.excluirContasPagarDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarContasPagarController(ModelContasPagar pModelContasPagar) {
        return this.daoContasPagar.alterarContasPagarDAO(pModelContasPagar);
    }
    
    //recebe requisição de retornar produto especifico de DAO
    public ModelContasPagar retornarContasPagarController(int pCodigo){
        return this.daoContasPagar.retornarContasPagarDAO(pCodigo);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelContasPagar> retornarListaContasPagarController(){
        return this.daoContasPagar.retornarListaContasPagarDAO();
    }
}
