/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Janelas;

import Controlador.Controlador_Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelos.Modelo_Usuario;

/**
 *
 * @author Faculdade
 */
public class Janela_Usuario extends javax.swing.JDialog {

    Controlador_Usuario controladorUsuario = new Controlador_Usuario();
    Modelo_Usuario modelo_usuario = new Modelo_Usuario();
    ArrayList<Modelo_Usuario> listaModeloUsuario = new ArrayList<>();
    Boolean salvarAlteracao = false;
    
    /**
     * Creates new form Janela_Usuario
     */
    public Janela_Usuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        habilitarDesabilitarCampos(false);
        carregarUsuarios();
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
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        passSenha = new javax.swing.JPasswordField();
        passConfirmar = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usu??rio");
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("Senha");

        jLabel3.setText("Login");

        jLabel4.setText("Confirmar Senha");

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Login"
            }
        ));
        jScrollPane1.setViewportView(table_user);
        if (table_user.getColumnModel().getColumnCount() > 0) {
            table_user.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(txtNome)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(passSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar)
                    .addComponent(btAlterar)
                    .addComponent(btNovo)
                    .addComponent(btSalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if(salvarAlteracao == false){
            this.salvarCliente();
        }else if(salvarAlteracao == true){
            this.alterarCliente();
            salvarAlteracao = false;
        }else{
            JOptionPane.showMessageDialog(this, "Erro Desconhecido", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int linha = table_user.getSelectedRow();
        int idUsuario = (int) table_user.getValueAt(linha, 0);
        
        if(controladorUsuario.excluirUsuarioController(idUsuario)){
            JOptionPane.showMessageDialog(this, "Usu??rio Excluido com Sucesso!", "ATEN????O", JOptionPane.WARNING_MESSAGE);
            this.carregarUsuarios();
            habilitarDesabilitarCampos(false);
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir o usu??rio!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        salvarAlteracao = true;
        int linha = table_user.getSelectedRow();
        int idUsuario = (int) table_user.getValueAt(linha, 0);
        
        modelo_usuario = controladorUsuario.getUsuarioController(idUsuario);
        //Retorna os valores para a interface
        this.txtNome.setText(String.valueOf(modelo_usuario.getNomeUser()));
        this.txtLogin.setText(modelo_usuario.getLoginUser());
        this.passSenha.setText(String.valueOf(modelo_usuario.getPasswordUser()));
        habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        salvarAlteracao = false;
        limparCampos();
        habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        habilitarDesabilitarCampos(false);
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Janela_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Janela_Usuario dialog = new Janela_Usuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    /**
     * CARREGA OS USU??RIOS DO BANCO NA TABELA
     */
    private void carregarUsuarios(){
        listaModeloUsuario = controladorUsuario.getListaUsuarioController();
        DefaultTableModel modelo = (DefaultTableModel) table_user.getModel();
        //Zera o n??mero de linhas da tabela para evitar erros
        modelo.setNumRows(0);
        
        int cont = listaModeloUsuario.size();
        for(int i = 0; i < cont; i++){
            modelo.addRow(new Object[]{
                listaModeloUsuario.get(i).getIdUsuario(),
                listaModeloUsuario.get(i).getNomeUser(),
                listaModeloUsuario.get(i).getLoginUser()
            });
        }
    }
    
    /**
     * LIMPA TODOS OS CAMPOS DO FORMUL??RIO
     */
    private void limparCampos(){
        txtNome.setText("");
        passSenha.setText("");
        txtLogin.setText("");
        passConfirmar.setText("");
    }
    
        /**
     * HABILITA E DESABILITA OS CAMPOS DO FORMUL??RIO
     * @param condicao 
     */
    private void habilitarDesabilitarCampos(boolean condicao){
        txtNome.setEditable(condicao);
        passSenha.setEditable(condicao);
        txtLogin.setEditable(condicao);
        passConfirmar.setEditable(condicao);
        btSalvar.setEnabled(condicao);
    }
    
    private void salvarCliente(){
        String pwd1 = new String(passSenha.getPassword());
        String pwd2 = new String(passConfirmar.getPassword());
            
        try{
            modelo_usuario.setNomeUser(txtNome.getText());
            modelo_usuario.setLoginUser(txtLogin.getText());

            if(pwd1.equals(pwd2)){
                modelo_usuario.setPasswordUser(pwd1);

                habilitarDesabilitarCampos(true);

                if(controladorUsuario.salvarUsuarioController(modelo_usuario)>0){
                    JOptionPane.showMessageDialog(this, "Registro salvo com sucesso!", "SALVO", JOptionPane.INFORMATION_MESSAGE);
                    this.limparCampos();
                    this.carregarUsuarios();
                    habilitarDesabilitarCampos(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao salvar o registro!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Senhas Incompat??veis", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado ou c??digo inv??lido", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * ALTERA UM REGISTRO SELECIONADO DA TABELA NO BANCO DE DADOS
     */
    private void alterarCliente(){
        int linha = this.table_user.getSelectedRow();
        String pwd1 = new String(passSenha.getPassword());
        String pwd2 = new String(passConfirmar.getPassword());
            
        try{
            int idUsuario = (int) this.table_user.getValueAt(linha, 0);
            
            modelo_usuario.setIdUsuario(idUsuario);
            modelo_usuario.setNomeUser(txtNome.getText());
            modelo_usuario.setLoginUser(txtLogin.getText());

            if(pwd1.equals(pwd2)){
                modelo_usuario.setPasswordUser(pwd1);

                habilitarDesabilitarCampos(true);

                if(controladorUsuario.atualizarUsuarioController(modelo_usuario)){
                    JOptionPane.showMessageDialog(this, "Registro alterado com sucesso!", "SALVO", JOptionPane.INFORMATION_MESSAGE);
                    this.limparCampos();
                    this.carregarUsuarios();
                    habilitarDesabilitarCampos(false);
                }else{
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o registro!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Senhas Incompat??veis", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado ou c??digo inv??lido", "AVISO", JOptionPane.ERROR_MESSAGE);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passConfirmar;
    private javax.swing.JPasswordField passSenha;
    private javax.swing.JTable table_user;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
