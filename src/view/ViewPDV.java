/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProduto;
import controller.ControllerVenda;
import controller.ControllerVendasProdutos;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;
import model.ModelSessaoUsuario;
import model.ModelVenda;
import model.ModelVendasProdutos;
import util.BLDatas;
import util.BLMascaras;

/**
 *
 * @author Wendel
 */
public class ViewPDV extends javax.swing.JFrame {

    ModelProduto modelProduto = new ModelProduto();
    ControllerProduto controllerProduto = new ControllerProduto();
    ModelVenda modelVenda = new ModelVenda();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    ArrayList<ModelProduto> listaModelProdutos = new ArrayList<>();
    ControllerVenda controllerVenda = new ControllerVenda();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();
    BLMascaras bLMascaras = new BLMascaras();
    BLDatas bLDatas = new BLDatas();
    int quantidade;
    ViewPagamentoPDV viewPagamentoPDV;
    ViewPesquisarProduto viewPesquisarProduto;

    /**
     * Creates new form ViewPDV
     */
    public ViewPDV() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        quantidade = 1;
        pegaOperador();
        this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
        this.viewPesquisarProduto = new ViewPesquisarProduto(this, true);
        limpaTela();
        jTextFieldCodigoProduto.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel8 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        panel4 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCaixa = new javax.swing.JLabel();
        jLabelOperador = new javax.swing.JLabel();
        jLabelSatus = new javax.swing.JLabel();
        panel5 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldBruto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jTextFieldCodigoProduto = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItemQuantidade = new javax.swing.JMenuItem();
        jMenuItemExcluir = new javax.swing.JMenuItem();
        jMenuItemFechaVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PDV - WS VENDAS");
        setBackground(new java.awt.Color(153, 255, 153));

        panel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconfinder_3_1668044 (1)_1.png"))); // NOI18N
        jLabel8.setText("WS Vendas");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CAIXA:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("OPERADOR:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("STATUS:");

        jLabelCaixa.setBackground(new java.awt.Color(204, 204, 204));
        jLabelCaixa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelCaixa.setText("01");

        jLabelOperador.setBackground(new java.awt.Color(204, 204, 204));
        jLabelOperador.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelOperador.setText("Operador");

        jLabelSatus.setBackground(new java.awt.Color(204, 204, 204));
        jLabelSatus.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelSatus.setText("status caixa");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelSatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelOperador, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCaixa))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelOperador))
                .addGap(18, 18, 18)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelSatus))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("VALOR BRUTO:");

        jTextFieldBruto.setEditable(false);
        jTextFieldBruto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldBruto.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldBruto.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jTextFieldBruto.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("COMANDOS:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("F3 - INFORMAR QUANTIDADE");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("F4 - EXCLUIR ITEM");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("F5 - FECHAR VENDA");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("F6 - SAIR");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("F1 - PESQUISAR ITEM");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBruto)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTableProdutos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "CÓDIGO", "NOME", "QTD.", "VALOR UNIT.", "VALOR TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableProdutos.setRowHeight(40);
        jTableProdutos.setRowMargin(10);
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);
            jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(30);
            jTableProdutos.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTableProdutos.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTextFieldCodigoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jTextFieldCodigoProduto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoProdutoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoProdutoKeyReleased(evt);
            }
        });

        jMenu1.setText("ARQUIVO");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem1.setText("SAIR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("COMANDOS");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setText("PESQUISAR PRODUTO");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItemQuantidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItemQuantidade.setText("QUANTIDADE");
        jMenuItemQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemQuantidade);

        jMenuItemExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItemExcluir.setText("EXCLUIR");
        jMenuItemExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExcluirActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemExcluir);

        jMenuItemFechaVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItemFechaVenda.setText("FECHAR A VENDA");
        jMenuItemFechaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFechaVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemFechaVenda);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFechaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFechaVendaActionPerformed
        // TODO add your handling code here:
        try {
            this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
            viewPagamentoPDV.setValorTotal(Float.parseFloat(jTextFieldBruto.getText()));
            viewPagamentoPDV.setTextFieldValorTotal();
            viewPagamentoPDV.setVisible(true);

            if (viewPagamentoPDV.isConfirmado()) {
                salvaVenda();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "NÃO HÁ ITENS ADICIONADOS", "MANUTENÇÃO DE VENDAS", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemFechaVendaActionPerformed

    private void jMenuItemQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuantidadeActionPerformed
        // TODO add your handling code here:
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("INFORME A QUANTIDADE DE PRODUTOS:"));
        //System.out.println("Quantidade: " + quantidade);

    }//GEN-LAST:event_jMenuItemQuantidadeActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExcluirActionPerformed
        // TODO add your handling code here:
        int quantidadeLinha = jTableProdutos.getRowCount();
        if (quantidadeLinha < 1) {
            JOptionPane.showMessageDialog(this, "NÃO HÁ ITENS PARA EXCLUIR!", "MANUTENÇÃO DE VENDAS", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
            int linha = Integer.parseInt(JOptionPane.showInputDialog("INFORME O ITEM QUE DESEJA EXCLUIR:"));
            modelo.removeRow(linha - 1);
            jTextFieldBruto.setText(String.valueOf(somaValorTotal()));
            for (int i = 0; i < quantidadeLinha; i++) {
                try {
                    modelo.setValueAt(i + 1, i, 0);
                } catch (Exception e) {
                }
            }
        }

    }//GEN-LAST:event_jMenuItemExcluirActionPerformed

    private void jTextFieldCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdutoKeyPressed
        // TODO add your handling code here:
        pegarConteudo(evt);
    }//GEN-LAST:event_jTextFieldCodigoProdutoKeyPressed

    private void jTextFieldCodigoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdutoKeyReleased
        // TODO add your handling code here:
        //pegarConteudo(evt);
    }//GEN-LAST:event_jTextFieldCodigoProdutoKeyReleased

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        viewPesquisarProduto.setVisible(true);
        jTextFieldCodigoProduto.setText(String.valueOf(viewPesquisarProduto.getCodigoProduto()));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * Salva a venda no banco
     */
    private void salvaVenda() {
        int codigoProduto = 0, codigoVenda = 0;
        modelVenda = new ModelVenda();
        modelVenda.setCliente(1);
        try {
            modelVenda.setVenData(bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        modelVenda.setVenValorBruto(Double.parseDouble(jTextFieldBruto.getText()));
        modelVenda.setVenDesconto(viewPagamentoPDV.getDesconto());
        modelVenda.setVenValorLiquido(bLMascaras.arredondamentoComPontoDuasCasas(viewPagamentoPDV.getValorTotal()));

        //salva a venda
        codigoVenda = controllerVenda.salvarVendaController(modelVenda);

        for (int i = 0; i < jTableProdutos.getRowCount(); i++) {
            codigoProduto = (int) jTableProdutos.getValueAt(i, 1);
            modelVendasProdutos = new ModelVendasProdutos();
            modelProduto = new ModelProduto();
            modelVendasProdutos.setProduto(codigoProduto);
            modelVendasProdutos.setVenda(codigoVenda);
            modelVendasProdutos.setVenProValor((double) jTableProdutos.getValueAt(i, 4));
            modelVendasProdutos.setNomeProduto(jTableProdutos.getValueAt(i, 2).toString());
            modelVendasProdutos.setVenProQuantidade(Integer.parseInt(jTableProdutos.getValueAt(i, 3).toString()));

            //Baixa no estoque
            modelProduto.setIdProduto(codigoProduto);
            modelProduto.setProEstoque(controllerProduto.retornarProdutoController(codigoProduto).getProEstoque()
                    - Integer.parseInt(jTableProdutos.getValueAt(i, 3).toString()));

            listaModelVendasProdutos.add(modelVendasProdutos);
            listaModelProdutos.add(modelProduto);
        }

        if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
            //alterar o estoque dos produtos
            controllerProduto.alterarEstoqueProdutoController(listaModelProdutos);
            JOptionPane.showMessageDialog(this, "VENDA EFETUADA COM SUCESSO!", "MANUTENÇÃO DE VENDAS", JOptionPane.INFORMATION_MESSAGE);
            imprimirCupom(listaModelVendasProdutos, modelVenda);
            limpaTela();
        } else {
            JOptionPane.showMessageDialog(this, "ERRO AO SALVAR PRODUTOS DA VENDA!", "MANUTENÇÃO DE VENDAS", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * realiza a impressão do cupom não fiscal
     *
     * @param listaModelVendasProdutos
     * @param modelVenda
     */
    private void imprimirCupom(ArrayList<ModelVendasProdutos> listaModelVendasProdutos, ModelVenda modelVenda) {
        String dataF = "dd/MM/yyyy";
        String horaF = "HH:mm:ss";
        String data, hora;

        Date tempoAtual = new Date();
        //Pegando a data
        SimpleDateFormat formata = new SimpleDateFormat(dataF);
        data = formata.format(tempoAtual);
        //pegando a hora
        formata = new SimpleDateFormat(horaF);
        hora = formata.format(tempoAtual);

        String conteudoImprimir = "";

        for (int i = 0; i < listaModelVendasProdutos.size(); i++) {
            conteudoImprimir += listaModelVendasProdutos.get(i).getProduto() + "    "
                    + listaModelVendasProdutos.get(i).getVenProQuantidade() + "     "
                    + listaModelVendasProdutos.get(i).getVenProValor() + "    "
                    + listaModelVendasProdutos.get(i).getNomeProduto() + "\n\r";
        }
        this.imprimir(
                  "EXCLUSIVA MODAS                                 \n\r"
                + "RUA DO COMERCIO 123, CENTRO                     \n\r"
                + "CNPJ 00.000.000/0001-00                         \n\r"
                + "Data: " + data + "             Hora: " + hora +"\n\r"
                + "------------------------------------------------\n\r"
                + "                SEM VALOR FISCAL                \n\r"
                + "------------------------------------------------\n\r"
                + "COD  QTD   PRECO   DESCRICAO                    \n\r"
                + conteudoImprimir +                              "\n\r"
                + "------------------------------------------------\n\r"
                + "   SUBTOTAL: " + modelVenda.getVenValorBruto()+"\n\r"
                + "   DESCONTO: " + modelVenda.getVenDesconto() + "\n\r"
                + "VALOR TOTAL: " + modelVenda.getVenValorLiquido() + "\n\r"
                + "------------------------------------------------\n\r"
                + "      TROCA SOMENTE EM ATE 7 DIAS E COM A NOTA  \n\r"
                + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\f"
        );
    }

    /**
     * Função para imprimir
     *
     * @param pTexto
     */
    public void imprimir(String pTexto) {
        try {
            InputStream prin = new ByteArrayInputStream(pTexto.getBytes());
            DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
            SimpleDoc documentoTexto = new SimpleDoc(prin, docFlavor, null);
            PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();
            //pega a impressora padrão
            PrintRequestAttributeSet printerAttributes = new HashPrintRequestAttributeSet();
            printerAttributes.add(new JobName("Impressão", null));
            printerAttributes.add(OrientationRequested.PORTRAIT);
            printerAttributes.add(MediaSizeName.ISO_A4);
            //informa o tipo de folha
            DocPrintJob PrintJob = impressora.createPrintJob();

            try {
                PrintJob.print(documentoTexto, (PrintRequestAttributeSet) printerAttributes);
                //tenta imprimir
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar a impressão!", "Erro", JOptionPane.ERROR_MESSAGE);
                //Mensarem de erro
            }
            prin.close();
        } catch (Exception e) {

        }
    }

    /**
     * Pega o produto e seta na tabela
     *
     * @param e
     */
    private void pegarConteudo(java.awt.event.KeyEvent e) {
        jLabelSatus.setText("CAIXA OCUPADO");
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                modelProduto = controllerProduto.retornarProdutoController(Integer.parseInt(jTextFieldCodigoProduto.getText()));
                modelo.addRow(new Object[]{
                    modelo.getRowCount() + 1,
                    modelProduto.getIdProduto(),
                    modelProduto.getProNome(),
                    quantidade,
                    modelProduto.getProValor(),
                    quantidade * modelProduto.getProValor()
                });
                jTextFieldBruto.setText(String.valueOf(somaValorTotal()));
                jTextFieldCodigoProduto.setText("");
                quantidade = 1;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "INFORME O CÓDIGO DO PRODUTO!", "MANUTENÇÃO DE VENDAS", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Efetua oo calculo dos valores da venda
     *
     * @return
     */
    private float somaValorTotal() {
        float soma = 0, valor = 0;
        int cont = jTableProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Float.parseFloat(String.valueOf(jTableProdutos.getValueAt(i, 5)));
            soma += valor;
        }
        return soma;
    }

    /**
     * Pega o operador ativo no caixa
     */
    public void pegaOperador() {
        jLabelOperador.setText(modelSessaoUsuario.nome);
    }

    /**
     * Limpa a tela
     */
    private void limpaTela() {
        jTextFieldBruto.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        modelo.setNumRows(0);
        jLabelSatus.setText("CAIXA LIVRE");
    }

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
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCaixa;
    private javax.swing.JLabel jLabelOperador;
    private javax.swing.JLabel jLabelSatus;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemExcluir;
    private javax.swing.JMenuItem jMenuItemFechaVenda;
    private javax.swing.JMenuItem jMenuItemQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldBruto;
    private javax.swing.JFormattedTextField jTextFieldCodigoProduto;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private java.awt.Panel panel4;
    private java.awt.Panel panel5;
    // End of variables declaration//GEN-END:variables

}
