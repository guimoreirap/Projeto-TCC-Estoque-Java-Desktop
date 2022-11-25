/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelContasPagar;

public class DaoContasPagar extends ConexaoMySql{
    public int salvarContasPagarDAO(ModelContasPagar pModelContasPagar) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_contas_pagar("
                    + "cp_empresa,"
                    + "cp_valor,"
                    + "cp_data_emissao_nota,"
                    + "cp_data_prazo "
                    + ") VALUES ("
                    + "'" + pModelContasPagar.getCpEmpresa()+ "',"
                    + "'" + pModelContasPagar.getCpValor()+ "',"
                    + "'" + pModelContasPagar.getCpDataEmissaoNota()+ "',"
                    + "'" + pModelContasPagar.getCpPrazoPagamento()+ "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    //Excluir um produto do banco
    public boolean excluirContasPagarDAO(int pIdContasPagar) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_contas_pagar WHERE pk_id_contas_pagar  = '" + pIdContasPagar + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean alterarContasPagarDAO(ModelContasPagar pModelContasPagar) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(""
                    + "UPDATE tbl_contas_pagar SET "
                    + "cp_empresa = '" + pModelContasPagar.getCpEmpresa()+ "',"
                    + "cp_valor = '" + pModelContasPagar.getCpValor()+ "',"
                    + "cp_data_emissao_nota = '" + pModelContasPagar.getCpDataEmissaoNota()+ "',"
                    + "cp_data_prazo = '" + pModelContasPagar.getCpDataEmissaoNota()+ "'"
                    + " WHERE pk_id_contas_pagar  = '" + pModelContasPagar.getIdContasPagar()+ "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelContasPagar retornarContasPagarDAO(int pIdContasPagar) {
        ModelContasPagar modelContasPagar = new ModelContasPagar();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_contas_pagar,"
                    + "cp_empresa,"
                    + "cp_valor,"
                    + "cp_data_emissao_nota,"
                    + "cp_data_prazo "
                    + "FROM tbl_contas_pagar WHERE pk_id_contas_pagar  = '" + pIdContasPagar + "';");
            while (this.getResultSet().next()) {
                modelContasPagar.setIdContasPagar(this.getResultSet().getInt(1));
                modelContasPagar.setCpEmpresa(this.getResultSet().getString(2));
                modelContasPagar.setCpValor(this.getResultSet().getDouble(3));
                modelContasPagar.setCpDataEmissaoNota(this.getResultSet().getDate(4));
                modelContasPagar.setCpPrazoPagamento(this.getResultSet().getString(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelContasPagar;
    }

    public ArrayList<ModelContasPagar> retornarListaContasPagarDAO() {
        ArrayList<ModelContasPagar> listaModelContasPagar = new ArrayList<>();
        ModelContasPagar modelContasPagar = new ModelContasPagar();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_contas_pagar,"
                    + "cp_empresa,"
                    + "cp_valor,"
                    + "cp_data_emissao_nota,"
                    + "cp_data_prazo "
                    + "FROM tbl_contas_pagar;");
            while (this.getResultSet().next()) {
                modelContasPagar = new ModelContasPagar();
                modelContasPagar.setIdContasPagar(this.getResultSet().getInt(1));
                modelContasPagar.setCpEmpresa(this.getResultSet().getString(2));
                modelContasPagar.setCpValor(this.getResultSet().getDouble(3));
                modelContasPagar.setCpDataEmissaoNota(this.getResultSet().getDate(4));
                modelContasPagar.setCpPrazoPagamento(this.getResultSet().getString(5));
                listaModelContasPagar.add(modelContasPagar);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelContasPagar;
    }
}
