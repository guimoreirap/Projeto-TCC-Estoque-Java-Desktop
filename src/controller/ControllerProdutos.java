/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import model.ModelProdutos;

/**
 *
 * @author Usuario
 */
public class ControllerProdutos {

    private DaoProdutos daoProdutos = new DaoProdutos();

    //recebe requisição de salvar produtos de DAO
    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirProdutoController(int pCodigo) {
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    //recebe requisição de retornar produto especifico de DAO
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    
    public ModelProdutos retornarProdutoController(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
    }
}
