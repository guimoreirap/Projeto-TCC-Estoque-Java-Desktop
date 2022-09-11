/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelRecebimentos;

/**
 *
 * @author Usuario
 */
public class DaoRecebimentos extends ConexaoMySql {

    public int salvarRecebimentoDAO(ModelRecebimentos pModelPagamentos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_recebimento("
                    + "fk_venda,"
                    + "fk_cliente,"
                    + "rec_data,"
                    + "rec_valor,"
                    + "rec_metodo"
                    + ") VALUES ("
                    + "'" + pModelPagamentos.getRecVenda() + "',"
                    + "'" + pModelPagamentos.getRecCliente() + "',"
                    + "'" + pModelPagamentos.getRecData() + "',"
                    + "'" + pModelPagamentos.getRecValor() + "',"
                    + "'" + pModelPagamentos.getRecMetodo() + "');");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }
}
