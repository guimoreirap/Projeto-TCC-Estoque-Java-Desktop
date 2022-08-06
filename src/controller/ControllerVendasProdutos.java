/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoVendasProdutos;
import java.util.ArrayList;
import model.ModelVendasProdutos;

/**
 *
 * @author Usuario
 */
public class ControllerVendasProdutos {
    private DaoVendasProdutos daoVendasProdutos = new DaoVendasProdutos();

    //recebe requisição de salvar produtos de DAO
    public int salvarVendaProdutoController(ModelVendasProdutos pModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirVendaProdutoController(int pCodigo) {
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarVendaProdutoController(ModelVendasProdutos pModelVendasProdutos) {
        return this.daoVendasProdutos.alterarVendasProdutosDAO(pModelVendasProdutos);
    }

    //recebe requisição de retornar produto especifico de DAO
    public ModelVendasProdutos retornarVendaProdutoController(int pCodigo) {
        return this.daoVendasProdutos.retornarVendasProdutosDAO(pCodigo);
    }

    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelVendasProdutos> retornarListaVendaProdutoController() {
        return this.daoVendasProdutos.retornarListaVendasProdutosDAO();
    }

    public boolean salvarVendaProdutoController(ArrayList<ModelVendasProdutos> pListaModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pListaModelVendasProdutos);
    }
}
