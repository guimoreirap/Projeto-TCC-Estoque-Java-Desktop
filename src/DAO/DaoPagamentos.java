/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;

import model.ModelPagamentos;

/**
 *
 * @author Usuario
 */
public class DaoPagamentos extends ConexaoMySql {

    public int salvarPagamentoDAO(ModelPagamentos pModelPagamentos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_pagamento("
                    + "pag_data,"
                    + "pag_valor,"
                    + "pag_metodo,"
                    + "pag_empresa "
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

    public boolean alterarPagamentoDAO(ModelPagamentos pModelPagamentos) {
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

    public ModelPagamentos retornarPagamentoDAO(int pIdPagamento) {
        ModelPagamentos modelPagamentos = new ModelPagamentos();

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

    public ModelPagamentos retornarPagamentoMetodoPagamentoDAO(String pMetodoPagamento) {
        ModelPagamentos modelPagamentos = new ModelPagamentos();

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

    public ArrayList<ModelPagamentos> retornarListaPagamentosDAO() {
        ArrayList<ModelPagamentos> listaModelPagamentos = new ArrayList<>();
        ModelPagamentos modelPagamentos = new ModelPagamentos();
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
                modelPagamentos = new ModelPagamentos();
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
    }
}
