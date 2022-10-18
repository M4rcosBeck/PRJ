/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Janelas;

import Controlador.Controlador_Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import ponto_venda.Modelo_Produto;
import utilidade.FormataPonto;

/**
 *
 * @author Faculdade
 */
public class Cadastro_Produto extends javax.swing.JDialog {

    ArrayList<Modelo_Produto> listaModeloProduto = new ArrayList<>();
    Controlador.Controlador_Produto controladorProdutos = new Controlador.Controlador_Produto();
    Modelo_Produto modelo_produto = new Modelo_Produto();
    FormataPonto formatador = new FormataPonto();
    Boolean salvarAlteracao = false;

    /**
     * Creates new form Cadastro_Produto
     */
    public Cadastro_Produto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarProdutos();
        habilitarDesabilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_produto = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        txtQuant = new javax.swing.JFormattedTextField();
        txtPreco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        jLabel1.setText("Produto");

        jLabel2.setText("Quantidade");

        jLabel3.setText("Preço");

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jLabel4.setText("Código");

        table_produto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Código", "Nome", "Preço", "Estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_produto);
        if (table_produto.getColumnModel().getColumnCount() > 0) {
            table_produto.getColumnModel().getColumn(0).setResizable(false);
            table_produto.getColumnModel().getColumn(0).setPreferredWidth(30);
            table_produto.getColumnModel().getColumn(1).setPreferredWidth(70);
            table_produto.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        jLabel5.setText("Pesquisar:");

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/find.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cross.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/accept.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        txtQuant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btBuscar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvar)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btLimpar)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        salvarAlteracao = false;
        habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (salvarAlteracao == false) {
            this.salvarProduto();
        } else if (salvarAlteracao == true) {
            this.alterarProduto();
            salvarAlteracao = false;
        } else {
            JOptionPane.showMessageDialog(this, "Erro Desconhecido", "ERRO", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        int linha = table_produto.getSelectedRow();
        int idProduto = (int) table_produto.getValueAt(linha, 0);

        if (controladorProdutos.excluirProdutoControlador(idProduto)) {
            JOptionPane.showMessageDialog(this, "Produto Excluido com Sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.carregarProdutos();
            habilitarDesabilitarCampos(false);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        habilitarDesabilitarCampos(false);
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        salvarAlteracao = true;
        int linha = this.table_produto.getSelectedRow();

        try {
            int idProduto = (int) this.table_produto.getValueAt(linha, 0);
            //Recuperrar os dados do banco
            modelo_produto = controladorProdutos.retornarProdutoControlador(idProduto);
            //Retorna os valores para a interface
            this.txtCodigo.setText(String.valueOf(modelo_produto.getCodigo()));
            this.txtProduto.setText(modelo_produto.getNome());
            this.txtQuant.setText(String.valueOf(modelo_produto.getEstoque()));
            this.txtPreco.setText(String.valueOf(modelo_produto.getPreco()));
            habilitarDesabilitarCampos(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nenhum registro selecionado ou código inválido", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.table_produto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.table_produto.setRowSorter(classificador);
        String texto = txtPesquisar.getText();
        classificador.setRowFilter(RowFilter.regexFilter(texto, 2));
    }//GEN-LAST:event_btBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastro_Produto dialog = new Cadastro_Produto(new javax.swing.JFrame(), true);
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

    private void salvarProduto() {
        if (txtCodigo.getText().length() < 8 || txtCodigo.getText().length() > 8) {
            JOptionPane.showMessageDialog(this, "Código do produto deve conter 8 digitos!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            modelo_produto.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
            modelo_produto.setNome(this.txtProduto.getText());
            modelo_produto.setPreco(formatador.converteVirgulaparaPonto(this.txtPreco.getText()));
            modelo_produto.setEstoque(Integer.parseInt(this.txtQuant.getText()));

            //Salva no banco de dados
            if (controladorProdutos.salvarProdutoControlador(modelo_produto) > 0) {
                JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "SALVO", JOptionPane.INFORMATION_MESSAGE);
                this.limparCampos();
                this.carregarProdutos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void alterarProduto() {
        if (txtCodigo.getText().length() < 8 || txtCodigo.getText().length() > 8) {
            JOptionPane.showMessageDialog(this, "Código do produto deve conter 8 digitos!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            int linha = this.table_produto.getSelectedRow();
            int idProduto = (int) this.table_produto.getValueAt(linha, 0);
            modelo_produto.setId(idProduto);
            modelo_produto.setCodigo(Integer.parseInt(this.txtCodigo.getText()));
            modelo_produto.setNome(this.txtProduto.getText());
            modelo_produto.setPreco(formatador.converteVirgulaparaPonto(this.txtPreco.getText()));
            modelo_produto.setEstoque(Integer.parseInt(this.txtQuant.getText()));

            //Salva no banco de dados
            if (controladorProdutos.alterarProdutoControlador(modelo_produto)) {
                JOptionPane.showMessageDialog(this, "Produto alterado com sucesso!", "SALVO", JOptionPane.INFORMATION_MESSAGE);
                this.limparCampos();
                this.carregarProdutos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    /**
     * HABILITA OS CAMPOS DO FORMULÁRIO
     *
     * @param condicao
     */
    private void habilitarDesabilitarCampos(boolean condicao) {
        txtCodigo.setEditable(condicao);
        txtProduto.setEditable(condicao);
        txtQuant.setEditable(condicao);
        txtPreco.setEditable(condicao);
        btSalvar.setEnabled(condicao);
    }

    /**
     * LIMPA OS CAMPOS DO FORMULÁRIO
     *
     * @param condicao
     */
    private void limparCampos() {
        txtCodigo.setText("");
        txtProduto.setText("");
        txtPreco.setText("");
        txtQuant.setText("");
    }

    /**
     * PREENCHE A TABELA DE PRODUTOS COM OS PRODUTOS DO BANCO DE DADOS
     */
    private void carregarProdutos() {
        listaModeloProduto = controladorProdutos.retornarListaProdutoControlador();
        DefaultTableModel modelo = (DefaultTableModel) table_produto.getModel();
        modelo.setNumRows(0);

        //Insere os produtos na tabela
        int contador = listaModeloProduto.size();
        for (int i = 0; i < contador; i++) {
            modelo.addRow(new Object[]{
                listaModeloProduto.get(i).getId(),
                listaModeloProduto.get(i).getCodigo(),
                listaModeloProduto.get(i).getNome(),
                listaModeloProduto.get(i).getPreco(),
                listaModeloProduto.get(i).getEstoque()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_produto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JFormattedTextField txtQuant;
    // End of variables declaration//GEN-END:variables

}
