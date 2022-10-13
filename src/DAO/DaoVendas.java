/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendas;

/**
 *
 * @author Usuario
 */
public class DaoVendas extends ConexaoMySql {

    //Cadastrar um produto no banco
    public int salvarVendasDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido, "
                    + "ven_valor_bruto, "
                    + "ven_valor_recebido, "
                    + "ven_desconto "
                    + ") VALUES ("
                    + "'" + pModelVendas.getCliente() + "',"
                    + "'" + pModelVendas.getVenDataVenda() + "',"
                    + "'" + pModelVendas.getVenValorLiquido() + "',"
                    + "'" + pModelVendas.getVenValorBruto() + "',"
                    + "'" + pModelVendas.getVenValorRecebido() + "',"
                    + "'" + pModelVendas.getVenValorDesconto() + "');"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    //Excluir um produto do banco
    public boolean excluirVendaDAO(int pIdVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_vendas WHERE pk_id_venda = '" + pIdVenda + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }

    public boolean alterarVendaDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(""
                    + "UPDATE tbl_vendas SET "
                    + "fk_cliente = '" + pModelVendas.getCliente() + "',"
                    + "ven_data_venda = '" + pModelVendas.getVenDataVenda() + "',"
                    + "ven_valor_liquido = '" + pModelVendas.getVenValorLiquido() + "',"
                    + "ven_valor_bruto = '" + pModelVendas.getVenValorBruto() + "',"
                    + "ven_valor_recebido = '" + pModelVendas.getVenValorRecebido() + "',"
                    + "ven_desconto = '" + pModelVendas.getVenValorDesconto() + "'"
                    + " WHERE pk_id_venda = '" + pModelVendas.getVenId() + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelVendas retornarVendaDAO(int pIdVenda) {
        ModelVendas modelVendas = new ModelVendas();

        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_venda, "
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido, "
                    + "ven_valor_bruto, "
                    + "ven_valor_recebido, "
                    + "ven_desconto "
                    + "FROM tbl_vendas WHERE pk_id_venda = '" + pIdVenda + "';");
            while (this.getResultSet().next()) {
                modelVendas.setVenId(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenValorRecebido(this.getResultSet().getDouble(6));
                modelVendas.setVenValorDesconto(this.getResultSet().getDouble(7));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return modelVendas;
    }

    public ArrayList<ModelVendas> retornarListaVendasDAO() {
        ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_venda, "
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido, "
                    + "ven_valor_bruto, "
                    + "ven_desconto "
                    + "FROM tbl_vendas ORDER BY pk_id_venda ASC;");
            while (this.getResultSet().next()) {
                modelVendas.setVenId(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenValorDesconto(this.getResultSet().getDouble(6));
                listaModelVendas.add(modelVendas);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelVendas;
    }

    public boolean efetuarRecebimentoDAO(ModelVendas pModelVendas) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(""
                    + "UPDATE tbl_vendas SET "
                    + "ven_valor_recebido = '" + pModelVendas.getVenValorRecebido() + "'"
                    + " WHERE pk_id_venda = '" + pModelVendas.getVenId() + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    public boolean alterarValorRecebimentoEmVendaDAO(double valorRecebido, int idVenda) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(""
                    + "UPDATE tbl_vendas SET "
                    + "ven_valor_recebido = '" + valorRecebido + "'"
                    + " WHERE pk_id_venda = '" + idVenda + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
