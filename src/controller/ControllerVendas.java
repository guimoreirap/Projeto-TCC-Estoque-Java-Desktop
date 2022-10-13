/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoVendas;
import java.util.ArrayList;
import model.ModelVendas;

/**
 *
 * @author Usuario
 */
public class ControllerVendas {

    private DaoVendas daoVendas = new DaoVendas();

    //recebe requisição de salvar produtos de DAO
    public int salvarVendaController(ModelVendas pModelVendas) {
        return this.daoVendas.salvarVendasDAO(pModelVendas);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirVendaController(int pCodigo) {
        return this.daoVendas.excluirVendaDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarVendaController(ModelVendas pModelVendas) {
        return this.daoVendas.alterarVendaDAO(pModelVendas);
    }

    //recebe requisição de retornar produto especifico de DAO
    public ModelVendas retornarVendaController(int pCodigo) {
        return this.daoVendas.retornarVendaDAO(pCodigo);
    }

    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelVendas> retornarListaVendaController() {
        return this.daoVendas.retornarListaVendasDAO();
    }

    public boolean efetuarRecebimento(ModelVendas pModelVendas) {
        return this.daoVendas.efetuarRecebimentoDAO(pModelVendas);
    }
    
    //Método para ser executad ao alterar um recebimento
    public boolean alterarValorRecebimentoEmVendaDAO(double valorRecebido, int idVenda) {
        return this.daoVendas.alterarValorRecebimentoEmVendaDAO(valorRecebido, idVenda);
    }
}
