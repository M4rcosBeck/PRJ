/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Janelas;

import Controlador.Controlador_Cliente;
import Controlador.Controlador_Produto;
import Controlador.Controlador_Vendas;
import Controlador.Controlador_VendasProdutos;
import Modelos.Modelo_Cliente;
import Modelos.Modelo_SessaoUsuario;
import Modelos.Modelo_Vendas;
import Modelos.Modelo_VendasProdutos;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ponto_venda.Modelo_Produto;
import util.Classe_Data;

/**
 *
 * @author Faculdade
 */
public class Janela_Caixa extends javax.swing.JDialog {

    Controlador_Cliente controladorCliente = new Controlador_Cliente();
    Controlador_Produto controladorProduto = new Controlador_Produto();
    Controlador_Vendas controladorVendas = new Controlador_Vendas();
    Controlador_VendasProdutos controladorVendasProdutos = new Controlador_VendasProdutos();
    Modelo_Cliente modeloCliente = new Modelo_Cliente();
    Modelo_Produto modeloProduto = new Modelo_Produto();
    Modelo_Vendas modeloVendas = new Modelo_Vendas();
    Modelo_VendasProdutos modeloVendasProdutos = new Modelo_VendasProdutos();
    Modelo_SessaoUsuario modeloSessaoUsuario = new Modelo_SessaoUsuario();
    ArrayList<Modelo_Cliente> listaModeloCliente = new ArrayList<>();
    ArrayList<Modelo_Produto> listaModeloProduto = new ArrayList<>();
    ArrayList<Modelo_VendasProdutos> listaModeloVendasProdutos = new ArrayList<>();
    Classe_Data classeData = new Classe_Data();
    private Janela_Finalizar janelaFinalizar;

    /**
     * Creates new form Janela_Caixa
     */
    public Janela_Caixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarClientes();
        txtCodProduto.requestFocusInWindow();
        lblHora.setText(String.valueOf(new java.util.Date(System.currentTimeMillis())));
        operador();
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
        txtOperador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_caixa = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtValorUni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        btSair = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        comboNomeCliente = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtNVenda = new javax.swing.JTextField();
        txtCodProduto = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caixa");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Operador:");

        txtOperador.setText("Nome do Operador");

        jLabel5.setText("Hor??rio:");

        lblHora.setText("Hor??rio Vigente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOperador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtOperador)
                    .addComponent(jLabel5)
                    .addComponent(lblHora))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        table_caixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??d Produto", "Produto", "Quantidade", "Valor Uni.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_caixa);
        if (table_caixa.getColumnModel().getColumnCount() > 0) {
            table_caixa.getColumnModel().getColumn(1).setPreferredWidth(180);
            table_caixa.getColumnModel().getColumn(2).setPreferredWidth(50);
            table_caixa.getColumnModel().getColumn(3).setPreferredWidth(50);
            table_caixa.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        jLabel8.setText("C??DIGO");

        txtProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtProduto.setEnabled(false);

        jLabel9.setText("??LTIMO PRODUTO");

        jLabel10.setText("VALOR UNIT??RIO");

        txtValorUni.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtValorUni.setEnabled(false);

        jLabel11.setText("QUANTIDADE");

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jLabel12.setText("SUBTOTAL");

        txtSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtSubtotal.setEnabled(false);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arrow_undo.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setActionCommand("");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/money_dollar.png"))); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("TOTAL A PAGAR:");

        txtValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorTotal.setEnabled(false);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btExcluir.setText("Excluir Produto");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel14.setText("DESCONTO");

        txtDesconto.setBackground(new java.awt.Color(242, 242, 242));
        txtDesconto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtDesconto.setEnabled(false);
        txtDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescontoFocusLost(evt);
            }
        });

        jLabel3.setText("C??digo Cliente");

        jLabel4.setText("Nome do Cliente");

        txtCodCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodClienteFocusLost(evt);
            }
        });

        comboNomeCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboNomeClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel15.setText("N?? Venda");

        txtNVenda.setBackground(new java.awt.Color(255, 153, 153));

        txtCodProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodProduto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(292, 292, 292)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtNVenda))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCodProduto)
                                    .addComponent(txtValorUni)
                                    .addComponent(txtQuantidade)
                                    .addComponent(txtSubtotal)
                                    .addComponent(txtDesconto)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14)))
                                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(btFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                                    .addComponent(txtProduto))))))
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorTotal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(6, 6, 6)
                        .addComponent(txtValorUni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(6, 6, 6)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addGap(6, 6, 6)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(txtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        // BOT??O SAIR
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void txtCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodClienteFocusLost
        carregarCliente();
    }//GEN-LAST:event_txtCodClienteFocusLost

    private void comboNomeClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboNomeClientePopupMenuWillBecomeInvisible
        if (comboNomeCliente.isPopupVisible()) {
            modeloCliente = controladorCliente.getClienteController(comboNomeCliente.getSelectedItem().toString());
            txtCodCliente.setText(String.valueOf(modeloCliente.getIdCliente()));
        }
    }//GEN-LAST:event_comboNomeClientePopupMenuWillBecomeInvisible

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        int linha = table_caixa.getRowCount();
        if (linha <= 0) {
            JOptionPane.showMessageDialog(this, "N??o existe nenhum item na cesta de compras!", "CESTA VAZIA", JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.janelaFinalizar = new Janela_Finalizar(null, true);
            janelaFinalizar.setValorTotal(Float.parseFloat(txtValorTotal.getText()));
            janelaFinalizar.setTextFieldValorTotal();
            janelaFinalizar.setVisible(true);

            txtValorTotal.setText(String.valueOf(janelaFinalizar.getValorTotal()));
            txtSubtotal.setText(String.valueOf(janelaFinalizar.getValorTotal() + janelaFinalizar.getDesconto()));
            txtDesconto.setText(String.valueOf(janelaFinalizar.getDesconto()));

            System.out.println(janelaFinalizar.getFormaPagamento());

            if (janelaFinalizar.isPagamentoEfetuadoComSucesso()) {
                //FINALIZA A VENDA E SALVA NO BANCO DE DADOS
                finalizarVenda();
            } else {
                JOptionPane.showMessageDialog(this, "Pagamento cancelado!", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }


    }//GEN-LAST:event_btFinalizarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        String autorizacao = JOptionPane.showInputDialog("Informe o c??digo do supervisor:");
        try {
            if (autorizacao.equals("123456")) {
                int linha = table_caixa.getSelectedRow();
                DefaultTableModel modelo = (DefaultTableModel) table_caixa.getModel();
                modelo.removeRow(linha);
                somarValorTotal();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Opera????o n??o executada!", "FALHA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtCodProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyReleased
        getEnter(evt);
    }//GEN-LAST:event_txtCodProdutoKeyReleased

    private void txtDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescontoFocusLost
        somarValorTotal();
    }//GEN-LAST:event_txtDescontoFocusLost

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
            java.util.logging.Logger.getLogger(Janela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Janela_Caixa dialog = new Janela_Caixa(new javax.swing.JFrame(), true);
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
     * COMPLETA A COMBOBOX COM OS CLIENTES CADASTRADOS NO BANCO DE DADOS
     */
    private void listarClientes() {
        listaModeloCliente = controladorCliente.getListaClienteController();
        comboNomeCliente.removeAllItems();
        comboNomeCliente.addItem("");
        for (int i = 0; i < listaModeloCliente.size(); i++) {
            comboNomeCliente.addItem(listaModeloCliente.get(i).getNomeCliente());
        }
    }

    /**
     * SOMA OS VALORES DOS ITENS ADICIONADOS NA VENDA
     */
    private void somarValorTotal() {
        double soma = 0;
        double valor;

        int cont = table_caixa.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = (double) table_caixa.getValueAt(i, 4);
            soma = soma + valor;
        }
        txtValorTotal.setText(String.valueOf(soma));
    }

    /**
     * APLICA O DESCONTO AO VALOR TOTAL DA COMPRA
     */
    private void desconto() {
        try {
            txtValorTotal.setText(String.valueOf(Double.parseDouble(txtValorTotal.getText()) - Double.parseDouble(txtDesconto.getText())));
        } catch (NumberFormatException e) {

        }

    }

    /**
     * LIMPA O FORMUL??RIO DO CAIXA
     */
    private void limpaCaixa() {
        txtCodCliente.setText("");
        listarClientes();
        txtNVenda.setText("");
        txtCodProduto.setText("");
        txtProduto.setText("");
        txtValorUni.setText("");
        txtQuantidade.setText("");
        txtValorTotal.setText("");
        txtSubtotal.setText("");
        txtDesconto.setText("");
        DefaultTableModel modelo = (DefaultTableModel) table_caixa.getModel();
        modelo.setNumRows(0);
        txtCodProduto.requestFocusInWindow();

    }

    private void carregarCliente() {
        modeloCliente = controladorCliente.getClienteController(Integer.parseInt(txtCodCliente.getText()));
        comboNomeCliente.setSelectedItem(modeloCliente.getNomeCliente());
    }

    private void getEnter(java.awt.event.KeyEvent e) {
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                if (txtQuantidade.getText().equals("")) {
                    txtQuantidade.setText("1");
                }

                modeloProduto = controladorProduto.retornarProdutoCodControlador(Integer.parseInt(txtCodProduto.getText()));
                //modeloProduto = controladorProduto.retornarProdutoControlador(Integer.parseInt(txtCodProduto.getText()));

                //VERIFICA SE O ITEM ADICIONADO ?? V??LIDO
                if (modeloProduto.getCodigo() == 0) {
                    JOptionPane.showMessageDialog(this, "Produto n??o encontrado!", "ERRO", JOptionPane.WARNING_MESSAGE);
                    txtCodProduto.setText("");
                    txtCodProduto.requestFocusInWindow();
                } else {
                    DefaultTableModel modelo = (DefaultTableModel) table_caixa.getModel();
                    int cont = 0;
                    for (int i = 0; i < cont; i++) {
                        modelo.setNumRows(0);
                    }

                    double quantidade = Double.parseDouble(txtQuantidade.getText());

                    modelo.addRow(new Object[]{
                        modeloProduto.getCodigo(),
                        modeloProduto.getNome(),
                        txtQuantidade.getText(),
                        modeloProduto.getPreco(),
                        quantidade * modeloProduto.getPreco()
                    });

                    txtProduto.setText(modeloProduto.getNome());
                    txtValorUni.setText(String.valueOf(modeloProduto.getPreco()));

                    txtCodProduto.setText("");
                    txtQuantidade.setText("1");
                    txtCodProduto.requestFocusInWindow();
                    somarValorTotal();
                    desconto();
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Este campo deve receber apenas n??meros!", "ERRO", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void operador() {
        txtOperador.setText(modeloSessaoUsuario.nome);
    }

    private void finalizarVenda() {
        int codigoProduto = 0;
        double desconto = 0;

        if (txtDesconto.getText().equals("")) {
            desconto = 0;
        } else {
            desconto = Double.parseDouble(txtDesconto.getText());
        }

        listaModeloVendasProdutos = new ArrayList<>();

        //Se n??o tiver cliente coloca o cod do cliente como zero.
        if (txtCodCliente.getText().equals("")) {
            txtCodCliente.setText("1");
            carregarCliente();
        }
        modeloVendas.setCodCliente(Integer.parseInt(txtCodCliente.getText()));

        //Tenta converter a hora do sistema padr??o para o sistema americano.
        try {
            modeloVendas.setVendaDataVenda(classeData.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao converter a data!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }

        modeloVendas.setVendaValorLiquido(Double.parseDouble(txtValorTotal.getText()));
        modeloVendas.setVendaValorBruto(Double.parseDouble(txtSubtotal.getText()));
        modeloVendas.setVendaDesconto(desconto);

        //SALVA A VENDA NA VARI??VEL
        int codVenda = controladorVendas.salvarVendasController(modeloVendas);
        txtNVenda.setText(String.valueOf(codVenda));

        //SALVA NO BANCO DE DADOS
        if (codVenda > 0) {
            JOptionPane.showMessageDialog(this, "Venda concluida com sucesso!", "FINALIZADO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao concluir a venda!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }

        int cont = table_caixa.getRowCount();
        for (int i = 0; i < cont; i++) {
            //ZERA O MODELO DE VENDAS PRODUTOS
            modeloVendasProdutos = new Modelo_VendasProdutos();
            modeloProduto = new Modelo_Produto();

            //PEGA O C??DIGO DO PRODUTO NA TABELA E RETORNA O ID DELE NO BANCO DE DADOS
            int codProduto = (int) this.table_caixa.getValueAt(i, 0);
            modeloProduto = controladorProduto.retornarProdutoCodControlador(codProduto);
            codigoProduto = modeloProduto.getId();

            //ENVIA AS INFORMA????ES DA TABELA PARA O MODELO
            modeloVendasProdutos.setProduto(codigoProduto);
            modeloVendasProdutos.setVenda(codVenda);
            modeloVendasProdutos.setVendaProValor((double) table_caixa.getValueAt(i, 3));
            modeloVendasProdutos.setVendaProQuant(Integer.parseInt(table_caixa.getValueAt(i, 2).toString()));
            //produtos subtrai estoque
            modeloProduto.setId(codigoProduto);
            modeloProduto.setEstoque(controladorProduto.retornarProdutoControlador(codigoProduto).getEstoque()
                    - Integer.parseInt(table_caixa.getValueAt(i, 2).toString()));

            //ADICIONA OS ITENS DO MODELO A LISTA
            listaModeloVendasProdutos.add(modeloVendasProdutos);
            listaModeloProduto.add(modeloProduto);
        }

        //SALVAR OS PRODUTOS DA VENDA
        if (controladorVendasProdutos.salvarVendasProdutosController(listaModeloVendasProdutos)) {
            //SALVA A ALTERA????O NO ESTOQUE
            controladorProduto.alterarEstoqueProdutoControlador(listaModeloProduto);
            JOptionPane.showMessageDialog(this, "Estoque alterado com sucesso!", "FINALIZADO", JOptionPane.INFORMATION_MESSAGE);
            imprimirVenda();
            limpaCaixa();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao processar o estoque!", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void imprimirVenda() {
        //cria????o do documento
        Document document = new Document();
        try {
            //cria uma instancia do documento e da o nome ao arquivo pdf gerado
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\mp-be\\Desktop\\Relatorio_de_Venda.pdf"));

            //abre o documento gerado para edi????o
            document.open();

            //seta o tamanho da p??gina do pdf
            document.setPageSize(PageSize.A4);

            //CABE??ALHO
            document.add(new Paragraph("Relat??rio de Venda"));
            document.add(new Paragraph(""));

            //L?? a tabela
            int contador = listaModeloVendasProdutos.size();
            for (int i = 0; i < contador; i++) {
                document.add(new Paragraph("Item " + i + " "
                        + table_caixa.getValueAt(i, 0) + " "
                        + table_caixa.getValueAt(i, 1) + " "
                        + table_caixa.getValueAt(i, 2) + " "
                        + table_caixa.getValueAt(i, 3) + " "
                ));
            }
            
            document.add(new Paragraph(""));
            document.add(new Paragraph("Total: " + txtValorTotal.getText()));
            document.add(new Paragraph("Desconto: " + txtDesconto.getText()));
            document.add(new Paragraph("Troco: " + janelaFinalizar.getTroco()));
        } catch (DocumentException de) {
            System.err.println(de.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        } finally {
            document.close();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> comboNomeCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JTable table_caixa;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JFormattedTextField txtCodProduto;
    private javax.swing.JTextField txtDesconto;
    private javax.swing.JTextField txtNVenda;
    private javax.swing.JLabel txtOperador;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorUni;
    // End of variables declaration//GEN-END:variables
}
