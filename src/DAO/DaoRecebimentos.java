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
public class DaoRecebimentos extends ConexaoMySql{
    /*public int salvarRecebimentoDAO(ModelRecebimentos pModelPagamentos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_recebimento("
                    + "fk_cliente,"
                    + "rec_data,"
                    + "rec_valor,"
                    + "rec_metodo"
                    + ") VALUES ("
                    + "'" + pModelPagamentos.getPagData() + "',"
                    + "'" + pModelPagamentos.getPagValor() + "',"
                    + "'" + pModelPagamentos.getPagMetodo() + "',"
                    + "'" + pModelPagamentos.getPagEmpresa() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    //Excluir um produto do banco
    public boolean excluirPagamentoDAO(int pIdPagamento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_pagamento WHERE pk_id_pagamento  = '" + pIdPagamento + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean alterarPagamentoDAO(ModelRecebimentos pModelPagamentos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(""
                    + "UPDATE tbl_pagamento SET "
                    + "pag_data = '" + pModelPagamentos.getPagData() + "',"
                    + "pag_valor = '" + pModelPagamentos.getPagValor() + "',"
                    + "pag_metodo = '" + pModelPagamentos.getPagMetodo() + "',"
                    + "pag_empresa = '" + pModelPagamentos.getPagEmpresa() + "'"
                    + " WHERE pk_id_pagamento  = '" + pModelPagamentos.getPagId() + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelRecebimentos retornarPagamentoDAO(int pIdPagamento) {
        ModelRecebimentos modelPagamentos = new ModelRecebimentos();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_pagamento,"
                    + "pag_data,"
                    + "pag_valor,"
                    + "pag_metodo,"
                    + "pag_empresa "
                    + "FROM tbl_pagamento WHERE pk_id_pagamento  = '" + pIdPagamento + "';");
            while (this.getResultSet().next()) {
                modelPagamentos.setPagId(this.getResultSet().getInt(1));
                modelPagamentos.setPagData(this.getResultSet().getDate(2));
                modelPagamentos.setPagValor(this.getResultSet().getDouble(3));
                modelPagamentos.setPagMetodo(this.getResultSet().getString(4));
                modelPagamentos.setPagEmpresa(this.getResultSet().getString(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelPagamentos;
    }

    public ModelRecebimentos retornarPagamentoMetodoPagamentoDAO(String pMetodoPagamento) {
        ModelRecebimentos modelPagamentos = new ModelRecebimentos();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_pagamento,"
                    + "pag_data,"
                    + "pag_valor,"
                    + "pag_metodo,"
                    + "pag_empresa "
                    + "FROM tbl_pagamento WHERE pag_metodo LIKE '%" + pMetodoPagamento + "%';");
            while (this.getResultSet().next()) {
                modelPagamentos.setPagId(this.getResultSet().getInt(1));
                modelPagamentos.setPagData(this.getResultSet().getDate(2));
                modelPagamentos.setPagValor(this.getResultSet().getDouble(3));
                modelPagamentos.setPagMetodo(this.getResultSet().getString(4));
                modelPagamentos.setPagEmpresa(this.getResultSet().getString(5));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelPagamentos;
    }

    public ArrayList<ModelRecebimentos> retornarListaPagamentosDAO() {
        ArrayList<ModelRecebimentos> listaModelPagamentos = new ArrayList<>();
        ModelRecebimentos modelPagamentos = new ModelRecebimentos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_pagamento,"
                    + "pag_data,"
                    + "pag_valor,"
                    + "pag_metodo,"
                    + "pag_empresa "
                    + "FROM tbl_pagamento;");
            while (this.getResultSet().next()) {
                modelPagamentos = new ModelRecebimentos();
                modelPagamentos.setPagId(this.getResultSet().getInt(1));
                modelPagamentos.setPagData(this.getResultSet().getDate(2));
                modelPagamentos.setPagValor(this.getResultSet().getDouble(3));
                modelPagamentos.setPagMetodo(this.getResultSet().getString(4));
                modelPagamentos.setPagEmpresa(this.getResultSet().getString(5));
                listaModelPagamentos.add(modelPagamentos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelPagamentos;
    }*/
}
