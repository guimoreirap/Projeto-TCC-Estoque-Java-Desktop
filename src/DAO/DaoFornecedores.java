/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelFornecedores;

/**
 *
 * @author Usuario
 */
public class DaoFornecedores extends ConexaoMySql {

    public int salvarFornecedoresDAO(ModelFornecedores pModelFornecedores) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_fornecedor("
                    + "for_empresa,"
                    + "for_nome,"
                    + "for_telefone_pessoal,"
                    + "for_telefone_empresa,"
                    + "for_email,"
                    + "for_descricao"
                    + ") VALUES ("
                    + "'" + pModelFornecedores.getForEmpresa() + "',"
                    + "'" + pModelFornecedores.getForNome() + "',"
                    + "'" + pModelFornecedores.getForTelefonePessoal() + "',"
                    + "'" + pModelFornecedores.getForTelefoneEmpresa() + "',"
                    + "'" + pModelFornecedores.getForEmail() + "',"
                    + "'" + pModelFornecedores.getForDescricao() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    //Excluir um produto do banco
    public boolean excluirFornecedorDAO(int pIdFornecedor) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_fornecedor WHERE pk_id_fornecedor  = '" + pIdFornecedor + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean alterarFornecedorDAO(ModelFornecedores pModelFornecedores) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(""
                    + "UPDATE tbl_fornecedor SET "
                    + "for_empresa = '" + pModelFornecedores.getForEmpresa() + "',"
                    + "for_nome = '" + pModelFornecedores.getForNome() + "',"
                    + "for_telefone_pessoal = '" + pModelFornecedores.getForTelefonePessoal() + "',"
                    + "for_telefone_empresa = '" + pModelFornecedores.getForTelefoneEmpresa() + "',"
                    + "for_email = '" + pModelFornecedores.getForEmail() + "',"
                    + "for_descricao = '" + pModelFornecedores.getForDescricao() + "'"
                    + " WHERE pk_id_fornecedor = '" + pModelFornecedores.getForId() + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelFornecedores retornarFornecedorDAO(int pIdFornecedor) {
        ModelFornecedores modelFornecedores = new ModelFornecedores();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_fornecedor,"
                    + "for_empresa,"
                    + "for_nome,"
                    + "for_telefone_pessoal,"
                    + "for_telefone_empresa,"
                    + "for_email,"
                    + "for_descricao "
                    + "FROM tbl_fornecedor WHERE pk_id_fornecedor = '" + pIdFornecedor + "';");
            while (this.getResultSet().next()) {
                modelFornecedores.setForId(this.getResultSet().getInt(1));
                modelFornecedores.setForEmpresa(this.getResultSet().getString(2));
                modelFornecedores.setForNome(this.getResultSet().getString(3));
                modelFornecedores.setForTelefonePessoal(this.getResultSet().getString(4));
                modelFornecedores.setForTelefoneEmpresa(this.getResultSet().getString(5));
                modelFornecedores.setForEmail(this.getResultSet().getString(6));
                modelFornecedores.setForDescricao(this.getResultSet().getString(7));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelFornecedores;
    }

    public ModelFornecedores retornarFornecedorDAO(String pEmpresaFornecedor) {
        ModelFornecedores modelFornecedores = new ModelFornecedores();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_fornecedor,"
                    + "for_empresa,"
                    + "for_nome,"
                    + "for_telefone_pessoal,"
                    + "for_telefone_empresa,"
                    + "for_email,"
                    + "for_descricao "
                    + "FROM tbl_fornecedor WHERE for_empresa = '" + pEmpresaFornecedor + "';");
            while (this.getResultSet().next()) {
                modelFornecedores.setForId(this.getResultSet().getInt(1));
                modelFornecedores.setForEmpresa(this.getResultSet().getString(2));
                modelFornecedores.setForNome(this.getResultSet().getString(3));
                modelFornecedores.setForTelefonePessoal(this.getResultSet().getString(4));
                modelFornecedores.setForTelefoneEmpresa(this.getResultSet().getString(5));
                modelFornecedores.setForEmail(this.getResultSet().getString(6));
                modelFornecedores.setForDescricao(this.getResultSet().getString(7));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelFornecedores;
    }

    public ArrayList<ModelFornecedores> retornarListaFornecedoresDAO() {
        ArrayList<ModelFornecedores> listaModelFornecedores = new ArrayList<>();
        ModelFornecedores modelFornecedores = new ModelFornecedores();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_fornecedor,"
                    + "for_empresa,"
                    + "for_nome,"
                    + "for_telefone_pessoal,"
                    + "for_telefone_empresa,"
                    + "for_email,"
                    + "for_descricao "
                    + "FROM tbl_fornecedor;");
            while (this.getResultSet().next()) {
                modelFornecedores = new ModelFornecedores();
                modelFornecedores.setForId(this.getResultSet().getInt(1));
                modelFornecedores.setForEmpresa(this.getResultSet().getString(2));
                modelFornecedores.setForNome(this.getResultSet().getString(3));
                modelFornecedores.setForTelefonePessoal(this.getResultSet().getString(4));
                modelFornecedores.setForTelefoneEmpresa(this.getResultSet().getString(5));
                modelFornecedores.setForEmail(this.getResultSet().getString(6));
                modelFornecedores.setForDescricao(this.getResultSet().getString(7));
                listaModelFornecedores.add(modelFornecedores);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelFornecedores;
    }
}
