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
public class DaoCaixa extends ConexaoMySql{
    public int salvarCaixaDAO(ModelCaixa pModelCaixa) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_caixa("
                    + "cai_movimentacao,"
                    + "cai_data,"
                    + "cai_valor,"
                    + "cai_id_movimentacao"
                    + ") VALUES ("
                    + "'" + pModelCaixa.getCaixaMovimentacao()+ "',"
                    + "'" + pModelCaixa.getCaixaData()+ "',"
                    + "'" + pModelCaixa.getCaixaValor()+ "',"
                    + "'" + pModelCaixa.getCaixaIdMovimentacao()+ "');");
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
                    + "cai_data,"
                    + "cai_valor,"
                    + "cai_id_movimentacao "
                    + "FROM tbl_caixa ORDER BY cai_data ASC;");
            while (this.getResultSet().next()) {
                modelCaixa = new ModelCaixa();
                modelCaixa.setCaixaId(this.getResultSet().getInt(1));
                modelCaixa.setCaixaMovimentacao(this.getResultSet().getString(2));
                modelCaixa.setCaixaData(this.getResultSet().getDate(3));
                modelCaixa.setCaixaValor(this.getResultSet().getDouble(4));
                modelCaixa.setCaixaIdMovimentacao(this.getResultSet().getInt(5));
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
