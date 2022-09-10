/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerClientes;
import controller.ControllerVendasCliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.ModelClientes;
import model.ModelVendasCliente;

/**
 *
 * @author Usuario
 */
public class ViewDividas extends javax.swing.JFrame {

    ModelClientes modelCliente = new ModelClientes();
    ControllerClientes controllerCliente = new ControllerClientes();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();

    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList<>();

    /**
     * Creates new form ViewDividas
     */
    public ViewDividas() {
        initComponents();
        this.listarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jcbCliente = new componentes.UJComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDividas = new javax.swing.JTable();
        jbRealizarRecebimento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dívidas");

        jbVoltar.setText("Voltar");

        jLabel1.setText("Código");

        jLabel2.setText("Cliente");

        jtfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoFocusLost(evt);
            }
        });

        jcbCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jtDividas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código venda", "Data", "Valor", "Valor pago", "Valor restante"
            }
        ));
        jScrollPane1.setViewportView(jtDividas);

        jbRealizarRecebimento.setText("Realizar recebimento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbRealizarRecebimento)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jbVoltar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVoltar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jbRealizarRecebimento)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbClientePopupMenuWillBecomeInvisible
        if (jcbCliente.isPopupVisible()) {
            this.carregarComboBoxClientes();
        }
    }//GEN-LAST:event_jcbClientePopupMenuWillBecomeInvisible

    private void jtfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoFocusLost
        this.setComboBoxCliente();
        this.carregarVendas();
    }//GEN-LAST:event_jtfCodigoFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDividas().setVisible(true);
            }
        });
    }

    //Metodo para carregar os clientes dentro do Combo Box
    private void carregarComboBoxClientes() {
        modelCliente = controllerCliente.retornarClienteController(jcbCliente.getSelectedItem().toString());
        //gambiarra pra retornar como String um valor inteiro
        jtfCodigo.setText(String.valueOf(modelCliente.getIdCliente()));
        this.carregarVendas();
    }

    //Metodo para adicionar a lista com os clientes dentro do ComboBox
    private void listarClientes() {
        //retorna todos os clientes pra dentro da lista
        listaModelClientes = controllerCliente.retornarListaClienteController();
        //remove todos valores dentro do combo box pra evitar repetição
        jcbCliente.removeAllItems();
        //adiciona cada elemento da lista dentro do combo box
        for (int i = 0; i < listaModelClientes.size(); i++) {
            //passa o nome de cada elemento da lista para o combo box
            jcbCliente.addItem(listaModelClientes.get(i).getCliNome());
        }
    }

    //Metodo para passar o nome do cliente ao inserir o código no campo Codigo
    private void setComboBoxCliente() {
        try {
            //pega o cliente e passa para o modelCliente
            modelCliente = controllerCliente.retornarClienteController(Integer.parseInt(jtfCodigo.getText()));
            //pega o nome do cliente e adiciona no combo box ao tirar o foco do campo COd. Cliente
            jcbCliente.setSelectedItem(modelCliente.getCliNome());
        } catch (Exception e) {
        }
    }

    //Metodo para carregar as vendas do cliente na tabela
    private void carregarVendas() {
        int codigo = Integer.parseInt(jtfCodigo.getText());
        DefaultTableModel modelo = (DefaultTableModel) jtDividas.getModel();
        modelo.setNumRows(0);
        listaModelVendasCliente = controllerVendasCliente.getListaVendasClienteController(codigo);
        int cont = listaModelVendasCliente.size();

        for (int i = 0; i < cont; i++) {
            if (listaModelVendasCliente.get(i).getModelVendas().getVenValorLiquido() >= listaModelVendasCliente.get(i).getModelVendas().getVenValorRecebido()) {
                modelo.addRow(new Object[]{
                    listaModelVendasCliente.get(i).getModelVendas().getVenId(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenDataVenda(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenValorLiquido(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenValorRecebido(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenValorLiquido()
                    - listaModelVendasCliente.get(i).getModelVendas().getVenValorRecebido()
                });

            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRealizarRecebimento;
    private javax.swing.JButton jbVoltar;
    private componentes.UJComboBox jcbCliente;
    private javax.swing.JTable jtDividas;
    private javax.swing.JTextField jtfCodigo;
    // End of variables declaration//GEN-END:variables
}
