/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerClientes;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerVendas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelClientes;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendas;

/**
 *
 * @author Usuario
 */
public class ViewRecebimentosProdutosDividas extends javax.swing.JFrame {

    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ModelClientes modelCliente = new ModelClientes();
    ModelVendas modelVendas = new ModelVendas();
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ControllerClientes controllerCliente = new ControllerClientes();
    ControllerVendas controllerVendas = new ControllerVendas();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutos = new ArrayList<>();
    public int codigoCliente = -1;
    public int codigoVenda = -1;
    public double valorTotal = 0;
    
    
    public ViewRecebimentosProdutosDividas() {
        initComponents();
        this.carregarVenda();
    }
    
    public ViewRecebimentosProdutosDividas(int pCodigoCliente, int pCodigoVenda) {
        initComponents();
        String nome = controllerCliente.retornarClienteController(pCodigoCliente).getCliNome();
        
        this.jlCodigoVenda.setText("Código da Venda: " + pCodigoVenda);
        this.jlCliente.setText("Cliente: " + nome);
        this.codigoCliente = pCodigoCliente;
        this.codigoVenda = pCodigoVenda;
        this.carregarVenda();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jlCodigoVenda = new javax.swing.JLabel();
        jlCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfValorLiquido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfValorBruto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfDesconto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico de Venda");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Produto", "Nome", "Quantidade", "Valor unitário", "Valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setMinWidth(100);
            jTableProdutos.getColumnModel().getColumn(0).setMaxWidth(100);
            jTableProdutos.getColumnModel().getColumn(2).setMinWidth(75);
            jTableProdutos.getColumnModel().getColumn(2).setMaxWidth(75);
            jTableProdutos.getColumnModel().getColumn(3).setMinWidth(90);
            jTableProdutos.getColumnModel().getColumn(3).setMaxWidth(90);
            jTableProdutos.getColumnModel().getColumn(4).setMinWidth(90);
            jTableProdutos.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        jlCodigoVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCodigoVenda.setText("Código da Venda: ");

        jlCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlCliente.setText("Cliente: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Valor liquído:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Valor bruto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Desconto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCliente)
                            .addComponent(jlCodigoVenda))
                        .addGap(0, 556, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfValorLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCodigoVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfValorLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewRecebimentosProdutosDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRecebimentosProdutosDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRecebimentosProdutosDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRecebimentosProdutosDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRecebimentosProdutosDividas().setVisible(true);
            }
        });
    }
    
    private void carregarVenda(){
        try {
            int linha = jTableProdutos.getSelectedRow();

            modelVendas = controllerVendas.retornarVendaController(codigoVenda);
            modelCliente = controllerCliente.retornarClienteController(codigoCliente);
            listaModelProdutosVendasProdutos = controllerProdutosVendasProdutos.
                    getListaProdutosVendasProdutosController(codigoVenda);

            DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
            modelo.setNumRows(0);

            for (int i = 0; i < listaModelProdutosVendasProdutos.size(); i++) {
                //jtfNumeroVenda.setText(String.valueOf(listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenda()));

                modelo.addRow(new Object[]{
                    listaModelProdutosVendasProdutos.get(i).getModelProdutos().getIdProduto(),
                    listaModelProdutosVendasProdutos.get(i).getModelProdutos().getProNome(),
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade(),
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor(),
                    listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade()
                    * listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor()

                });
                
                this.valorTotal += listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProQuantidade()
                    * listaModelProdutosVendasProdutos.get(i).getModelVendasProdutos().getVenProValor();
            }
            
            this.jtfValorLiquido.setText(formatarValor(modelVendas.getVenValorLiquido()));
            this.jtfValorBruto.setText(formatarValor(modelVendas.getVenValorBruto()));
            this.jtfDesconto.setText(formatarValor(modelVendas.getVenValorDesconto()));
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro inesperado.", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }
    
    private String formatarValor(Double valor) {
        return String.format("%.2f", valor).replaceAll(",", ".");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JLabel jlCliente;
    private javax.swing.JLabel jlCodigoVenda;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfValorBruto;
    private javax.swing.JTextField jtfValorLiquido;
    // End of variables declaration//GEN-END:variables
}