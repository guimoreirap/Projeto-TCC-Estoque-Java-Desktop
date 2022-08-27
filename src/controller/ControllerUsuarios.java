/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoUsuarios;
import java.util.ArrayList;
import model.ModelUsuarios;

/**
 *
 * @author Usuario
 */
public class ControllerUsuarios {
    private DaoUsuarios daoUsuarios = new DaoUsuarios();

    //recebe requisição de salvar produtos de DAO
    public int salvarUsuarioController(ModelUsuarios pModelUsuarios) {
        return this.daoUsuarios.salvarUsuariosDAO(pModelUsuarios);
    }

    //recebe requisição de excluir produtos de DAO
    public boolean excluirUsuarioController(int pCodigo) {
        return this.daoUsuarios.excluirUsuarioDAO(pCodigo);
    }

    //recebe requisição de alterar produtos de DAO
    public boolean alterarUsuarioController(ModelUsuarios pModelUsuarios) {
        return this.daoUsuarios.alterarUsuarioDAO(pModelUsuarios);
    }
    
    //recebe requisição de retornar produto especifico de DAO
    public ModelUsuarios retornarUsuarioController(int pCodigo){
        return this.daoUsuarios.retornarUsuarioDAO(pCodigo);
    }
    
    //recebe requisição de retornar produtos de DAO
    public ArrayList<ModelUsuarios> retornarListaUsuarioController(){
        return this.daoUsuarios.retornarListaUsuariosDAO();
    }

    public boolean getValidarUsuarioController(ModelUsuarios pModelUsuarios) {
        return this.daoUsuarios.getValidarUsuarioDAO(pModelUsuarios);
    }
    
    public boolean getValidarUsuarioSenhaController(ModelUsuarios pModelUsuarios) {
        return this.daoUsuarios.getValidarUsuarioSenhaDAO(pModelUsuarios);
    }
}
