package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Control.Control;
import Model.FornecedorBEAN;
import Model.IngredienteBEAN;
import javax.swing.table.DefaultTableModel;

public class PizzaView extends javax.swing.JFrame {

    public PizzaView() {
        initComponents();
        listar();
        fillFornecedorCB();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        erroDialog = new javax.swing.JDialog();
        erroDialog.setTitle("Erro");
        erroDialog.setLocationRelativeTo(null);
        jLabel1 = new javax.swing.JLabel();
        disposeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ingredienteTable1 = new javax.swing.JTable();
        jScrollPane = new javax.swing.JScrollPane();
        ingredienteTable = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        cancelarButton1 = new javax.swing.JButton();
        nomeTF1 = new javax.swing.JTextField();
        novoButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        nomeTF = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeLabel1 = new javax.swing.JLabel();
        desativarButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ingredienteTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingredienteTable3 = new javax.swing.JTable();
        pesquisarTF = new javax.swing.JTextField();
        ativosCK = new javax.swing.JCheckBox();
        editarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        cancelarButton2 = new javax.swing.JButton();

        erroDialog.setMinimumSize(new java.awt.Dimension(273, 135));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Dados de entrada Invalidos ");

        disposeButton.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        disposeButton.setText("Dispensar");
        disposeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disposeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout erroDialogLayout = new javax.swing.GroupLayout(erroDialog.getContentPane());
        erroDialog.getContentPane().setLayout(erroDialogLayout);
        erroDialogLayout.setHorizontalGroup(
            erroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erroDialogLayout.createSequentialGroup()
                .addGroup(erroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(erroDialogLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(disposeButton))
                    .addGroup(erroDialogLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        erroDialogLayout.setVerticalGroup(
            erroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erroDialogLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(disposeButton)
                .addContainerGap())
        );

        ingredienteTable1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ingredienteTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo Medida", "Fornecedor", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
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
        jScrollPane1.setViewportView(ingredienteTable1);
        if (ingredienteTable1.getColumnModel().getColumnCount() > 0) {
            ingredienteTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            ingredienteTable1.getColumnModel().getColumn(0).setHeaderValue("ID");
            ingredienteTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            ingredienteTable1.getColumnModel().getColumn(2).setHeaderValue("Tipo Medida");
            ingredienteTable1.getColumnModel().getColumn(3).setHeaderValue("Fornecedor");
            ingredienteTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            ingredienteTable1.getColumnModel().getColumn(4).setHeaderValue("Ativo");
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingredienteTable.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ingredienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(ingredienteTable);

        jComboBox1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Ingrediente>" }));

        cancelarButton1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cancelarButton1.setText("Rem");
        cancelarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButton1ActionPerformed(evt);
            }
        });

        nomeTF1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        novoButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cancelarButton.setText("Cancelar");

        nomeTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        nomeLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        nomeLabel.setText("Detalhes");

        nomeLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        nomeLabel1.setText("Nome");

        desativarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        desativarButton.setText("On/Off");
        desativarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desativarButtonActionPerformed(evt);
            }
        });

        pesquisarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        ingredienteTable2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ingredienteTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ingredienteTable2);
        if (ingredienteTable2.getColumnModel().getColumnCount() > 0) {
            ingredienteTable2.getColumnModel().getColumn(0).setPreferredWidth(25);
            ingredienteTable2.getColumnModel().getColumn(0).setHeaderValue("ID");
            ingredienteTable2.getColumnModel().getColumn(2).setPreferredWidth(30);
            ingredienteTable2.getColumnModel().getColumn(2).setHeaderValue("Ativo");
        }

        ingredienteTable3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ingredienteTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ingredienteTable3);

        pesquisarTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        ativosCK.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ativosCK.setText("Ativos");

        editarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        salvarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        cancelarButton2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cancelarButton2.setText("Add");
        cancelarButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(desativarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pesquisarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(ativosCK)
                                    .addGap(18, 18, 18)
                                    .addComponent(pesquisarButton)))
                            .addGap(42, 42, 42)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelarButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarButton1))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeLabel1)
                            .addComponent(nomeLabel)
                            .addComponent(nomeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(nomeTF1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salvarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(nomeLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(novoButton))
                        .addGap(7, 7, 7)
                        .addComponent(nomeLabel)
                        .addGap(15, 15, 15)
                        .addComponent(nomeTF1))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarButton1)
                    .addComponent(cancelarButton2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarButton)
                        .addGap(18, 18, 18)
                        .addComponent(desativarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarButton)
                    .addComponent(pesquisarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativosCK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        alterar(selectedIngrediente.getId(), nomeTF.getText(), (String) medidaCB.getSelectedItem(), fornecedorCB.getSelectedIndex());
        listar();
        nomeTF.setText("");
        medidaCB.setSelectedIndex(0);
        fornecedorCB.setSelectedIndex(0);
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void desativarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();

        desativarAtivar((Integer) model.getValueAt(ingredienteTable.getSelectedRow(), 0), (Boolean) model.getValueAt(ingredienteTable.getSelectedRow(), 4));
        listar();
    }//GEN-LAST:event_desativarButtonActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        pesquisar(pesquisarTF.getText(), ativosCK.isSelected());
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        inserir(nomeTF.getText(), (String) medidaCB.getSelectedItem(), fornecedorCB.getSelectedIndex());
        listar();
        nomeTF.setText("");
        medidaCB.setSelectedIndex(0);
        fornecedorCB.setSelectedIndex(0);
    }//GEN-LAST:event_novoButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();

        nomeTF.setText((String) model.getValueAt(ingredienteTable.getSelectedRow(), 1));
        medidaCB.setSelectedItem((String) model.getValueAt(ingredienteTable.getSelectedRow(), 2));
        fornecedorCB.setSelectedItem((String) model.getValueAt(ingredienteTable.getSelectedRow(), 3));

        selectedIngrediente.setId((Integer) model.getValueAt(ingredienteTable.getSelectedRow(), 0));
    }//GEN-LAST:event_editarButtonActionPerformed

    private void disposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disposeButtonActionPerformed
        erroDialog.dispose();
    }//GEN-LAST:event_disposeButtonActionPerformed

    private void cancelarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarButton1ActionPerformed

    private void cancelarButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarButton2ActionPerformed

    IngredienteBEAN selectedIngrediente = new IngredienteBEAN();

    static Control controle = new Control();
    ArrayList<IngredienteBEAN> listaIngrediente = new ArrayList<IngredienteBEAN>();

    public static Date convert_StringToDate(String dataStr) {
        java.sql.Date data = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data = new java.sql.Date(format.parse(dataStr).getTime());
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return data;
    }

    private void fillIngredienteCB() {
        listaIngrediente = controle.listaIngrediente();
    }

    private void pesquisar(String str, boolean cbAtivo) {

        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();
        model.setRowCount(0);

        if (str.equals("")) {
            listar();
        }

        List<IngredienteBEAN> listaIngrediente = controle.listaIngrediente();

        for (IngredienteBEAN ingrediente : listaIngrediente) {

            boolean ativo;

            if (ingrediente.getStatus() == 1) {
                ativo = true;
            } else {
                ativo = false;
            }

            if (ingrediente.getNome().equals(str)) {
                if (cbAtivo == true) {
                    if (ingrediente.getStatus() == 1) {
                        model.addRow(new Object[]{
                            ingrediente.getId(),
                            ingrediente.getNome(),
                            ingrediente.getMedida(),
                            ingrediente.getId_fornecedor(),
                            ativo
                        });
                    }
                } else {
                    model.addRow(new Object[]{
                        ingrediente.getId(),
                        ingrediente.getNome(),
                        ingrediente.getMedida(),
                        ingrediente.getId_fornecedor(),
                        ativo
                    });
                }
            }
        }
    }

    private void listar() {

        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();

        model.setRowCount(0);

        List<IngredienteBEAN> listIngrediente = controle.listaIngrediente();
        List<FornecedorBEAN> listFornecedor = controle.listaFornecedor();

        for (IngredienteBEAN ingrediente : listIngrediente) {

            boolean ativo = false;

            if (ingrediente.getStatus() == 1) {
                ativo = true;
            }

            model.addRow(new Object[]{
                ingrediente.getId(),
                ingrediente.getNome(),
                ingrediente.getMedida(),
                controle.findFornecedor(ingrediente.getId_fornecedor()).getRazaoSocial(),
                ativo
            });

        }
    }

    private void inserir(String nome, String medida, int indexFornecedor) {

        if (indexFornecedor != 0 && !medida.equals("<selecione>")) {
            FornecedorBEAN fornecedor = listaFornecedor.get(indexFornecedor);

            IngredienteBEAN ingrediente = new IngredienteBEAN(nome, medida, fornecedor.getId(), 1);

            List<IngredienteBEAN> listIngrediente = controle.listaIngrediente();

            boolean exist = false;

            for (IngredienteBEAN _ingrediente : listIngrediente) {
                if (ingrediente.getNome() == _ingrediente.getNome()
                        && ingrediente.getId_fornecedor() == _ingrediente.getId_fornecedor()) {
                    exist = true;
                }
            }

            if (!exist) {
                controle.addIngrediente(ingrediente);
            }

        } else {
            erroDialog.setVisible(true);
        }

    }

    private static void desativarAtivar(int id, boolean status) {

        IngredienteBEAN ingrediente = controle.findIngrediente(id);

        if (status == false) {
            ingrediente.setStatus(1);
        } else {
            ingrediente.setStatus(0);

        }

        controle.updateIngrediente(ingrediente);

    }

    private void alterar(int id, String nome, String medida, int indexFornecedor) {

        if (indexFornecedor != 0 && !medida.equals("<selecione>")) {
            FornecedorBEAN fornecedor = listaFornecedor.get(indexFornecedor);

            IngredienteBEAN ingrediente = new IngredienteBEAN(id, nome, medida, 1, fornecedor.getId());

            controle.updateIngrediente(ingrediente);
        } else {
            erroDialog.setVisible(true);
        }

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PizzaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PizzaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ativosCK;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton cancelarButton1;
    private javax.swing.JButton cancelarButton2;
    private javax.swing.JButton desativarButton;
    private javax.swing.JButton disposeButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JDialog erroDialog;
    private javax.swing.JTable ingredienteTable;
    private javax.swing.JTable ingredienteTable1;
    private javax.swing.JTable ingredienteTable2;
    private javax.swing.JTable ingredienteTable3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JTextField nomeTF1;
    private javax.swing.JButton novoButton;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pesquisarTF;
    private javax.swing.JButton salvarButton;
    // End of variables declaration//GEN-END:variables
}
