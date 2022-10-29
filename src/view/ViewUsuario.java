/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerUsuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelPergunta;
import model.ModelUsuarios;
import util.Formatador;

/**
 *
 * @author Usuario
 */
public class ViewUsuario extends javax.swing.JFrame {

    ArrayList<ModelUsuarios> listaModelUsuarios = new ArrayList<>();
    ControllerUsuarios controllerUsuario = new ControllerUsuarios();
    ModelUsuarios modelUsuarios = new ModelUsuarios();
    String salvarAlterar = "salvar";
    Formatador formatador = new Formatador();
    String senhaAtual;

    /**
     * Creates new form ViewUsuario
     */
    public ViewUsuario() {
        initComponents();
        this.carregarUsuarios();
        //this.habilitarDesabilitarCampos(false);
        this.jtfSenhaAtual.setEnabled(false);
        this.carregarPerguntaSegurança();

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
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JPasswordField();
        jtfConfirmarSenha = new javax.swing.JPasswordField();
        jtfSenhaAtual = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jcbPermissao = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jcbItemPergunta = new javax.swing.JComboBox<>();
        jLabelPergunta = new javax.swing.JLabel();
        jtfResposta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuários");
        setResizable(false);

        jLabel1.setText("Código");

        jtfCodigo.setEnabled(false);

        jLabel2.setText("Nome:");

        jLabel3.setText("Login:");

        jLabel4.setText("Nova Senha");

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);
        if (jTableUsuario.getColumnModel().getColumnCount() > 0) {
            jTableUsuario.getColumnModel().getColumn(0).setMinWidth(90);
            jTableUsuario.getColumnModel().getColumn(0).setMaxWidth(90);
        }

        jLabel5.setText("Confirmar senha:");

        jLabel6.setText("Senha atual");

        jLabel7.setText("Permissão");

        jcbPermissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Admin" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pergunta de segurança"));

        jcbItemPergunta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jcbItemPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbItemPerguntaActionPerformed(evt);
            }
        });

        jLabelPergunta.setText("jLabel8");

        jtfResposta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfRespostaFocusGained(evt);
            }
        });

        jLabel8.setText("R:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcbItemPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbItemPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPergunta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfResposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSenhaAtual))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(259, 259, 259)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPermissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVoltar))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jbExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSalvar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbAlterar)
                    .addComponent(jbNovo))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        this.limparTabela();
        //this.habilitarDesabilitarCampos(true);
        this.jtfNome.requestFocus();
        this.salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        if (salvarAlterar.equals("salvar")) {
            this.salvarUsuario();
        } else if (salvarAlterar.equals("alterar")) {
            this.alterarUsuario();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        //Exclui um produto no banco
        int linha = jTableUsuario.getSelectedRow();
        int codigoUsuario = (int) jTableUsuario.getValueAt(linha, 0);

        try {
            controllerUsuario.excluirUsuarioController(codigoUsuario);
            JOptionPane.showMessageDialog(
                    this, "Usuário excluído com sucesso.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, "Ocorreu um erro ao excluir o usuário no banco de dados.", "ERRO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            this.carregarUsuarios();
            this.limparTabela();
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        this.salvarAlterar = "alterar";

        int linha = this.jTableUsuario.getSelectedRow();
        try {

            int codigoProduto = (int) this.jTableUsuario.getValueAt(linha, 0);
            //this.habilitarDesabilitarCampos(true);
            this.jtfNome.requestFocus();
            //recupera os dados do banco
            modelUsuarios = controllerUsuario.retornarUsuarioController(codigoProduto);
            //seta nos campos na interface
            this.jtfCodigo.setText(String.valueOf(modelUsuarios.getUsuId()));
            this.jtfNome.setText(modelUsuarios.getUsuNome());
            this.jtfLogin.setText(String.valueOf(modelUsuarios.getUsuLogin()));
            this.jcbPermissao.setSelectedIndex(modelUsuarios.getUsuPermissao());
            this.jcbItemPergunta.setSelectedIndex(modelUsuarios.getUsuIndexPergunta());
            jtfSenhaAtual.setEnabled(true);

            //captura a senha
            this.senhaAtual = modelUsuarios.getUsuSenha();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    this, "Código inválido ou nenhum registro selecionado.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        new ViewPrincipal().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jtfRespostaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfRespostaFocusGained
        carregarPerguntaSegurança();
    }//GEN-LAST:event_jtfRespostaFocusGained

    private void jcbItemPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbItemPerguntaActionPerformed
        this.carregarPerguntaSegurança();
    }//GEN-LAST:event_jcbItemPerguntaActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    public void carregarUsuarios() {
        listaModelUsuarios = controllerUsuario.retornarListaUsuarioController(); //atribui os valores retornados a uma lista
        DefaultTableModel modelo = (DefaultTableModel) jTableUsuario.getModel();

        //Cada vez que o metodo é chamado, a tabela é zerada as linhas - evita dados repetidos na tela
        modelo.setNumRows(0);

        //inserir produtos na tabela
        int count = listaModelUsuarios.size(); //pega o tamanho da lista pra percorrer todos os dados dela
        for (int i = 0; i < count; i++) {
            modelo.addRow(new Object[]{ //adiciona uma linha 
                //passa o que cada coluna da linha apresentará em ordem
                listaModelUsuarios.get(i).getUsuId(),
                listaModelUsuarios.get(i).getUsuNome(),
                listaModelUsuarios.get(i).getUsuLogin()
            });
        }

    }

    private void limparTabela() {
        this.jtfCodigo.setText("");
        this.jtfNome.setText("");
        this.jtfLogin.setText("");
        this.jtfSenha.setText("");
        this.jtfConfirmarSenha.setText("");
        this.jtfSenhaAtual.setText("");
        this.jtfResposta.setText("");
        this.jtfNome.requestFocus();
        this.jtfSenhaAtual.setEnabled(false);

    }

    //habilita/desabilita a edição dos campos da view
    /*private void habilitarDesabilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfLogin.setEnabled(condicao);
        jtfSenha.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
        jtfConfirmarSenha.setEnabled(condicao);
        
        
    }*/
    private void salvarUsuario() {
        //pega os valores dos campos da interface e coloca dentro de cada atributo do objeto
        modelUsuarios.setUsuNome(this.jtfNome.getText());
        modelUsuarios.setUsuLogin(this.jtfLogin.getText());
        modelUsuarios.setUsuPermissao(this.jcbPermissao.getSelectedIndex());
        modelUsuarios.setUsuIndexPergunta(this.jcbItemPergunta.getSelectedIndex());
        modelUsuarios.setUsuPergunta(this.jtfResposta.getText());
        String senha = String.valueOf(this.jtfSenha.getPassword());
        String confirmarSenha = String.valueOf(this.jtfConfirmarSenha.getPassword());

        if (senha.equals(confirmarSenha) && !senha.equals("") && !confirmarSenha.equals("")) {
            modelUsuarios.setUsuSenha(senha);
        } else {
            JOptionPane.showMessageDialog(
                    this, "Os campos de senha foram inseridos incorretamente.", "ERRO", JOptionPane.ERROR_MESSAGE);
            this.carregarUsuarios();
            this.limparTabela();
            //this.habilitarDesabilitarCampos(false);
            return;
        }

        try {
            controllerUsuario.salvarUsuarioController(modelUsuarios);
            JOptionPane.showMessageDialog(
                    this, "Usuário salvo com sucesso.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, "Ocorreu um erro ao inserir o usuário no banco de dados.", "ERRO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            this.carregarUsuarios();
            this.limparTabela();
        }
    }

    private void alterarUsuario() {
        //pega os valores dos campos da interface e coloca dentro de cada atributo do objeto
        modelUsuarios.setUsuId(Integer.parseInt(this.jtfCodigo.getText()));
        modelUsuarios.setUsuNome(this.jtfNome.getText());
        modelUsuarios.setUsuLogin(this.jtfLogin.getText());
        modelUsuarios.setUsuPermissao(this.jcbPermissao.getSelectedIndex());
        modelUsuarios.setUsuIndexPergunta(this.jcbItemPergunta.getSelectedIndex());
        modelUsuarios.setUsuPergunta(this.jtfResposta.getText());
        modelUsuarios.setUsuSenha(String.valueOf(this.jtfSenhaAtual.getPassword()));
        String senhaInserida = String.valueOf(this.jtfSenha.getPassword());
        String senhaInseridaValidação = String.valueOf(this.jtfConfirmarSenha.getPassword());;

        //VERIFICA SE A SENHA ESTÁ CORRETA PARA PODER ALTERAR O USUARIO
        if (controllerUsuario.getValidarUsuarioSenhaController(modelUsuarios)) {

            //VERIFICA SE O CAMPO NÃO ESTÁ VAZIO, POIS SE ESTIVER VAZIO ELE NÃO PODE ALTERAR A SENHA
            if (!senhaInserida.equals("") && !senhaInseridaValidação.equals("")) {

                //VERIFICA SE FOI PASSADO UMA NOVA SENHA E SE ELA ESTÁ SENDO VALIDADA EM DOIS CAMPOS
                if (senhaInserida.equals(senhaInseridaValidação)) {

                    //nova senha sendo passada aqui para ser alterada no banco
                    modelUsuarios.setUsuSenha(String.valueOf(this.jtfSenha.getPassword()));
                } else {
                    JOptionPane.showMessageDialog(
                            this, "Senhas não conferem.", "ERRO", JOptionPane.ERROR_MESSAGE);
                    this.jtfSenha.setText("");
                    this.jtfConfirmarSenha.setText("");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(
                        this, "Senha não foi alterada.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

            //SE TODAS CONDIÇÕES FOREM VERDADEIRAS ELE ALTERA NO BANCO DE DADOS O USUARIO
            try {
                controllerUsuario.alterarUsuarioController(modelUsuarios);
                JOptionPane.showMessageDialog(
                        this, "Usuário alterado com sucesso.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(
                        this, "Ocorreu um erro ao inserir o Usuário no banco de dados.", "ERRO", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } finally {
                this.carregarUsuarios();
                this.limparTabela();
            }

        } else {
            JOptionPane.showMessageDialog(
                    this, "Senha incorreta.", "ERRO", JOptionPane.ERROR_MESSAGE);
            this.jtfSenhaAtual.setText("");
            this.jtfSenha.setText("");
            this.jtfConfirmarSenha.setText("");
        }
    }

    private void carregarPerguntaSegurança() {
        int index = this.jcbItemPergunta.getSelectedIndex();
        this.jLabelPergunta.setText(ModelPergunta.pergunta[index]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelPergunta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcbItemPergunta;
    private javax.swing.JComboBox<String> jcbPermissao;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JPasswordField jtfConfirmarSenha;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfResposta;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JPasswordField jtfSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
