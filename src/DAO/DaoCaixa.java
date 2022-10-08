/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCaixa;

/**
 *
 * @author Usuario
 */
public class DaoCaixa extends ConexaoMySql {

    public int salvarCaixaDAO(ModelCaixa pModelCaixa) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_caixa("
                    + "cai_movimentacao,"
                    + "cai_ator,"
                    + "cai_data,"
                    + "cai_valor"
                    + ") VALUES ("
                    + "'" + pModelCaixa.getCaixaMovimentacao() + "',"
                    + "'" + pModelCaixa.getCaixaAtor() + "',"
                    + "'" + pModelCaixa.getCaixaData() + "',"
                    + "'" + pModelCaixa.getCaixaValor() + "');");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelCaixa> retornarListaCaixaDAO() {
        ArrayList<ModelCaixa> listaModelCaixa = new ArrayList<>();
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_caixa ,"
                    + "cai_movimentacao,"
                    + "cai_ator,"
                    + "cai_data,"
                    + "cai_valor "
                    + "FROM tbl_caixa ORDER BY pk_id_caixa ASC;");
            while (this.getResultSet().next()) {
                modelCaixa = new ModelCaixa();
                modelCaixa.setCaixaId(this.getResultSet().getInt(1));
                modelCaixa.setCaixaMovimentacao(this.getResultSet().getString(2));
                modelCaixa.setCaixaAtor(this.getResultSet().getString(3));
                modelCaixa.setCaixaData(this.getResultSet().getDate(4));
                modelCaixa.setCaixaValor(this.getResultSet().getDouble(5));
                listaModelCaixa.add(modelCaixa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelCaixa;
    }

    public ArrayList<ModelCaixa> retornarListaCaixaDataDAO(String data) {
        ArrayList<ModelCaixa> listaModelCaixa = new ArrayList<>();
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_caixa ,"
                    + "cai_movimentacao,"
                    + "cai_ator,"
                    + "cai_data,"
                    + "cai_valor "
                    + "FROM tbl_caixa WHERE cai_data like '" + data + "' ORDER BY pk_id_caixa DESC;");
            while (this.getResultSet().next()) {
                modelCaixa = new ModelCaixa();
                modelCaixa.setCaixaId(this.getResultSet().getInt(1));
                modelCaixa.setCaixaMovimentacao(this.getResultSet().getString(2));
                modelCaixa.setCaixaAtor(this.getResultSet().getString(3));
                modelCaixa.setCaixaData(this.getResultSet().getDate(4));
                modelCaixa.setCaixaValor(this.getResultSet().getDouble(5));
                listaModelCaixa.add(modelCaixa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelCaixa;
    }
    
    public ArrayList<ModelCaixa> retornarListaCaixaMovimentacaoDAO(String movimentacao) {
        ArrayList<ModelCaixa> listaModelCaixa = new ArrayList<>();
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_caixa ,"
                    + "cai_movimentacao,"
                    + "cai_ator,"
                    + "cai_data,"
                    + "cai_valor "
                    + "FROM tbl_caixa WHERE cai_movimentacao like '%" + movimentacao + "%' ORDER BY cai_data DESC;");
            while (this.getResultSet().next()) {
                modelCaixa = new ModelCaixa();
                modelCaixa.setCaixaId(this.getResultSet().getInt(1));
                modelCaixa.setCaixaMovimentacao(this.getResultSet().getString(2));
                modelCaixa.setCaixaAtor(this.getResultSet().getString(3));
                modelCaixa.setCaixaData(this.getResultSet().getDate(4));
                modelCaixa.setCaixaValor(this.getResultSet().getDouble(5));
                listaModelCaixa.add(modelCaixa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelCaixa;
    }
    
    public ArrayList<ModelCaixa> retornarListaCaixaDAO(String movimentacao, String data) {
        ArrayList<ModelCaixa> listaModelCaixa = new ArrayList<>();
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_caixa ,"
                    + "cai_movimentacao,"
                    + "cai_ator,"
                    + "cai_data,"
                    + "cai_valor "
                    + "FROM tbl_caixa WHERE cai_movimentacao like '%" + movimentacao + "%' AND cai_data like '" + data + "'"
                            + " ORDER BY cai_data DESC;");
            while (this.getResultSet().next()) {
                modelCaixa = new ModelCaixa();
                modelCaixa.setCaixaId(this.getResultSet().getInt(1));
                modelCaixa.setCaixaMovimentacao(this.getResultSet().getString(2));
                modelCaixa.setCaixaAtor(this.getResultSet().getString(3));
                modelCaixa.setCaixaData(this.getResultSet().getDate(4));
                modelCaixa.setCaixaValor(this.getResultSet().getDouble(5));
                listaModelCaixa.add(modelCaixa);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelCaixa;
    }
}
