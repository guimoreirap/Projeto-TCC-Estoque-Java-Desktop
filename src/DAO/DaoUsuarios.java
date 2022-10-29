/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelUsuarios;

/**
 *
 * @author Usuario
 */
public class DaoUsuarios extends ConexaoMySql {

    public int salvarUsuariosDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_usuario ("
                    + "usu_nome,"
                    + "usu_login,"
                    + "usu_senha,"
                    + "usu_permissao,"
                    + "usu_index_pergunta,"
                    + "usu_pergunta"
                    + ") VALUES ("
                    + "'" + pModelUsuarios.getUsuNome() + "',"
                    + "'" + pModelUsuarios.getUsuLogin() + "',"
                    + "'" + pModelUsuarios.getUsuSenha() + "',"
                    + "'" + pModelUsuarios.getUsuPermissao() + "',"
                    + "'" + pModelUsuarios.getUsuIndexPergunta() + "',"
                    + "'" + pModelUsuarios.getUsuPergunta() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    //Excluir um produto do banco
    public boolean excluirUsuarioDAO(int pIdUsuario) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_usuario WHERE pk_id_usuario  = '" + pIdUsuario + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean alterarUsuarioDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(""
                    + "UPDATE tbl_usuario SET "
                    + "usu_nome = '" + pModelUsuarios.getUsuNome() + "',"
                    + "usu_senha = '" + pModelUsuarios.getUsuSenha() + "',"
                    + "usu_permissao = '" + pModelUsuarios.getUsuPermissao() + "',"
                    + "usu_index_pergunta = '" + pModelUsuarios.getUsuIndexPergunta()+ "',"
                    + "usu_pergunta = '" + pModelUsuarios.getUsuPergunta()+ "',"
                    + "usu_login = '" + pModelUsuarios.getUsuLogin() + "'"
                    + " WHERE pk_id_usuario  = '" + pModelUsuarios.getUsuId() + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelUsuarios retornarUsuarioDAO(int pIdUsuario) {
        ModelUsuarios modelUsuarios = new ModelUsuarios();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_senha, "
                    + "usu_index_pergunta, "
                    + "usu_pergunta, "
                    + "usu_permissao "
                    + "FROM tbl_usuario WHERE pk_id_usuario  = '" + pIdUsuario + "';");
            while (this.getResultSet().next()) {
                modelUsuarios.setUsuId(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuSenha(this.getResultSet().getString(4));
                modelUsuarios.setUsuIndexPergunta(this.getResultSet().getInt(5));
                modelUsuarios.setUsuPergunta(this.getResultSet().getString(6));
                modelUsuarios.setUsuPermissao(this.getResultSet().getInt(7));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelUsuarios;
    }

    public ArrayList<ModelUsuarios> retornarListaUsuariosDAO() {
        ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<>();
        ModelUsuarios modelUsuarios = new ModelUsuarios();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login, "
                    + "usu_index_pergunta, "
                    + "usu_pergunta, "
                    + "usu_permissao "
                    + "FROM tbl_usuario;");
            while (this.getResultSet().next()) {
                modelUsuarios = new ModelUsuarios();
                modelUsuarios.setUsuId(this.getResultSet().getInt(1));
                modelUsuarios.setUsuNome(this.getResultSet().getString(2));
                modelUsuarios.setUsuLogin(this.getResultSet().getString(3));
                modelUsuarios.setUsuIndexPergunta(this.getResultSet().getInt(4));
                modelUsuarios.setUsuPergunta(this.getResultSet().getString(5));
                modelUsuarios.setUsuPermissao(this.getResultSet().getInt(6));
                listaModelUsuarios.add(modelUsuarios);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelUsuarios;
    }

    public boolean getValidarUsuarioDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login,"
                    + "usu_permissao,"
                    + "usu_senha "
                    + "FROM tbl_usuario WHERE usu_login = '" + pModelUsuarios.getUsuLogin() + "' "
                    + "AND usu_senha = '" + pModelUsuarios.getUsuSenha() + "' ;");
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean getValidarUsuarioSenhaDAO(ModelUsuarios pModelUsuarios) {
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_usuario, "
                    + "usu_nome, "
                    + "usu_login,"
                    + "usu_permissao,"
                    + "usu_senha "
                    + "FROM tbl_usuario WHERE usu_senha = '" + pModelUsuarios.getUsuSenha() + "' ;");
            if (getResultSet().next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
