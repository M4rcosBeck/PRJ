/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Janelas;

import Modelos.Modelo_Usuario;

/**
 *
 * @author Faculdade
 */
public class Janela_Principal extends javax.swing.JFrame {

    Modelo_Usuario modelo_usuario = new Modelo_Usuario();
    
    /**
     * Creates new form Janela_Principal
     */
    public Janela_Principal() {
        initComponents();
        verificaLogin(true);
    }
    
    public void verificaLogin(boolean status){
        bt_janelacaixa.setEnabled(status);
        bt_relatorio.setEnabled(status);
        bt_addcliente.setEnabled(status);
        bt_ultimavenda.setEnabled(status);
        bt_Produto.setEnabled(status);
        menuCliente.setEnabled(status);
        menuProduto.setEnabled(status);
        menuDeslogar.setEnabled(status);

        menu_ultimavenda.setEnabled(status);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_janelacaixa = new javax.swing.JButton();
        bt_addcliente = new javax.swing.JButton();
        bt_ultimavenda = new javax.swing.JButton();
        bt_relatorio = new javax.swing.JButton();
        bt_Produto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_arquivo = new javax.swing.JMenu();
        menuLogin = new javax.swing.JMenuItem();
        menuDeslogar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSair = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuUsuario = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenuItem();
        menuProduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menu_ultimavenda = new javax.swing.JMenuItem();
        menu_relatorios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ponto de Venda");
        setResizable(false);

        bt_janelacaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_caixa.jpg"))); // NOI18N
        bt_janelacaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_janelacaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_janelacaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_janelacaixaActionPerformed(evt);
            }
        });

        bt_addcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_cliente.jpg"))); // NOI18N
        bt_addcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addclienteActionPerformed(evt);
            }
        });

        bt_ultimavenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_ultvenda.jpg"))); // NOI18N
        bt_ultimavenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ultimavendaActionPerformed(evt);
            }
        });

        bt_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_relatorios.JPG"))); // NOI18N
        bt_relatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_relatorioActionPerformed(evt);
            }
        });

        bt_Produto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bt_produto.jpg"))); // NOI18N
        bt_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ProdutoActionPerformed(evt);
            }
        });

        menu_arquivo.setText("Arquivo");

        menuLogin.setText("Login");
        menuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLoginActionPerformed(evt);
            }
        });
        menu_arquivo.add(menuLogin);

        menuDeslogar.setText("Deslogar");
        menu_arquivo.add(menuDeslogar);
        menu_arquivo.add(jSeparator1);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menu_arquivo.add(menuSair);

        jMenuBar1.add(menu_arquivo);

        jMenu3.setText("Cadastro");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ProdutoActionPerformed(evt);
            }
        });

        menuUsuario.setText("Usu??rios");
        menuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUsuarioActionPerformed(evt);
            }
        });
        jMenu3.add(menuUsuario);

        menuCliente.setText("Clientes");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addclienteActionPerformed(evt);
            }
        });
        jMenu3.add(menuCliente);

        menuProduto.setText("Produtos");
        menuProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ProdutoActionPerformed(evt);
            }
        });
        jMenu3.add(menuProduto);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Consulta");

        menu_ultimavenda.setText("??ltimas Vendas");
        jMenu2.add(menu_ultimavenda);

        menu_relatorios.setText("Relat??rios");
        menu_relatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_relatorioActionPerformed(evt);
            }
        });
        jMenu2.add(menu_relatorios);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_janelacaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_addcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_ultimavenda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_ultimavenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_addcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_janelacaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_janelacaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_janelacaixaActionPerformed
        //CONSTRUTOR DA JANELA DO CAIXA
        Janela_Caixa janela_caixa = new Janela_Caixa(null, true);
        janela_caixa.setLocationRelativeTo(null);
        janela_caixa.setVisible(true);
    }//GEN-LAST:event_bt_janelacaixaActionPerformed

    private void bt_addclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addclienteActionPerformed
        //CONSTRUTOR DA JANELA DE CADASTRO DE CLIENTES
        Cadastro_Cliente cadastro_cliente = new Cadastro_Cliente(null, true);
        cadastro_cliente.setLocationRelativeTo(null);
        cadastro_cliente.setVisible(true);
    }//GEN-LAST:event_bt_addclienteActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        //BOT??O SAIR
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLoginActionPerformed
        // CONSTRUTOR DA JANELA LOGIN
        Janela_Login janela_login = new Janela_Login(null, true);
        janela_login.setLocationRelativeTo(null);
        janela_login.setVisible(true);
    }//GEN-LAST:event_menuLoginActionPerformed

    private void bt_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ProdutoActionPerformed
        // CONSTRUTOR DA JANELA LOGIN
        Janelas.Cadastro_Produto cadastro_produto = new Janelas.Cadastro_Produto(null, true);
        cadastro_produto.setLocationRelativeTo(null);
        cadastro_produto.setVisible(true);
    }//GEN-LAST:event_bt_ProdutoActionPerformed

    private void menuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUsuarioActionPerformed
        // CONSTRUTOR DA JANELA CADASTRO DE USUARIO
        Janelas.Janela_Usuario janela_usuario = new Janelas.Janela_Usuario(null, true);
        janela_usuario.setLocationRelativeTo(null);
        janela_usuario.setVisible(true);
    }//GEN-LAST:event_menuUsuarioActionPerformed

    private void bt_ultimavendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ultimavendaActionPerformed
        // CONSTRUTOR DA JANELA ULTIMAS VENDAS
        Janelas.Janela_UltimaVenda janela_ultimavenda = new Janelas.Janela_UltimaVenda(null, true);
        janela_ultimavenda.setLocationRelativeTo(null);
        janela_ultimavenda.setVisible(true);
    }//GEN-LAST:event_bt_ultimavendaActionPerformed

    private void bt_relatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_relatorioActionPerformed
        Janelas.Janela_Relatorios janela_relatorios = new Janelas.Janela_Relatorios(null, true);
        janela_relatorios.setLocationRelativeTo(null);
        janela_relatorios.setVisible(true);
    }//GEN-LAST:event_bt_relatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Produto;
    private javax.swing.JButton bt_addcliente;
    private javax.swing.JButton bt_janelacaixa;
    private javax.swing.JButton bt_relatorio;
    private javax.swing.JButton bt_ultimavenda;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuDeslogar;
    private javax.swing.JMenuItem menuLogin;
    private javax.swing.JMenuItem menuProduto;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuUsuario;
    private javax.swing.JMenu menu_arquivo;
    private javax.swing.JMenuItem menu_relatorios;
    private javax.swing.JMenuItem menu_ultimavenda;
    // End of variables declaration//GEN-END:variables


}
