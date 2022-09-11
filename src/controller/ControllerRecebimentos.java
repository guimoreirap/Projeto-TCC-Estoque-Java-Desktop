/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.DaoRecebimentos;
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
    
}
