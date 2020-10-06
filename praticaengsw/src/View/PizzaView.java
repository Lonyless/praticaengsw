package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Control.Control;
import Model.FornecedorBEAN;
import Model.IngredienteBEAN;
import Model.PizzaBEAN;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PizzaView extends javax.swing.JFrame {

    public PizzaView() {
        initComponents();

        fillIngredienteCB();
        fillPizzaTable();

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
        ingredienteInsertTable = new javax.swing.JTable();
        ingredienteCB = new javax.swing.JComboBox<>();
        removeIngredienteButton = new javax.swing.JButton();
        descTF = new javax.swing.JTextField();
        novoButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        nomeTF = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeLabel1 = new javax.swing.JLabel();
        desativarButton = new javax.swing.JButton();
        pesquisarButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        PizzaTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingredienteViewTable = new javax.swing.JTable();
        pesquisarTF = new javax.swing.JTextField();
        ativosCK = new javax.swing.JCheckBox();
        editarButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        addIngredienteButton = new javax.swing.JButton();

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
            ingredienteTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            ingredienteTable1.getColumnModel().getColumn(2).setHeaderValue("Tipo Medida");
            ingredienteTable1.getColumnModel().getColumn(3).setHeaderValue("Fornecedor");
            ingredienteTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ingredienteInsertTable.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ingredienteInsertTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ingrediente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(ingredienteInsertTable);
        if (ingredienteInsertTable.getColumnModel().getColumnCount() > 0) {
            ingredienteInsertTable.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        ingredienteCB.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        ingredienteCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Ingrediente>" }));

        removeIngredienteButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        removeIngredienteButton.setText("Rem");
        removeIngredienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeIngredienteButtonActionPerformed(evt);
            }
        });

        descTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

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

        PizzaTable.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        PizzaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Detalhes", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PizzaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PizzaTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(PizzaTable);
        if (PizzaTable.getColumnModel().getColumnCount() > 0) {
            PizzaTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            PizzaTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        ingredienteViewTable.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ingredienteViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ingrediente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ingredienteViewTable);

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

        addIngredienteButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        addIngredienteButton.setText("Add");
        addIngredienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredienteButtonActionPerformed(evt);
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
                                .addComponent(ingredienteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(addIngredienteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeIngredienteButton))
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeLabel1)
                            .addComponent(nomeLabel)
                            .addComponent(nomeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                            .addComponent(descTF))
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
                        .addComponent(descTF))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingredienteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeIngredienteButton)
                    .addComponent(addIngredienteButton))
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

        alterar(nomeTF.getText(), descTF.getText());
        nomeTF.setText("");
        descTF.setText("");

    }//GEN-LAST:event_salvarButtonActionPerformed

    private void desativarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ingredienteInsertTable.getModel();

        desativarAtivar((Integer) model.getValueAt(ingredienteInsertTable.getSelectedRow(), 0), (Boolean) model.getValueAt(ingredienteInsertTable.getSelectedRow(), 4));

        fillPizzaTable();
    }//GEN-LAST:event_desativarButtonActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        pesquisar(pesquisarTF.getText(), ativosCK.isSelected());
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed

        inserir(nomeTF.getText(), descTF.getText());
        nomeTF.setText("");
        descTF.setText("");
        fillPizzaTable();

    }//GEN-LAST:event_novoButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        DefaultTableModel modelPizza = (DefaultTableModel) PizzaTable.getModel();

        nomeTF.setText((String) modelPizza.getValueAt(ingredienteInsertTable.getSelectedRow(), 1));
        descTF.setText((String) modelPizza.getValueAt(ingredienteInsertTable.getSelectedRow(), 2));

        fillIngredienteInsertTable();
    }//GEN-LAST:event_editarButtonActionPerformed

    private void disposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disposeButtonActionPerformed
        erroDialog.dispose();
    }//GEN-LAST:event_disposeButtonActionPerformed

    private void removeIngredienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeIngredienteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ingredienteInsertTable.getModel();

        model.removeRow(ingredienteInsertTable.getSelectedRow());
    }//GEN-LAST:event_removeIngredienteButtonActionPerformed

    private void addIngredienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredienteButtonActionPerformed
        fillIngredienteTable();
    }//GEN-LAST:event_addIngredienteButtonActionPerformed

    private void PizzaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PizzaTableMouseClicked
        fillIngredienteViewTable();
    }//GEN-LAST:event_PizzaTableMouseClicked

    IngredienteBEAN selectedIngrediente = new IngredienteBEAN();

    static Control controle = new Control();
    ArrayList<IngredienteBEAN> listaIngrediente = new ArrayList<IngredienteBEAN>();
    ArrayList<PizzaBEAN> listaPizza = new ArrayList<PizzaBEAN>();

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

    private void fillIngredienteViewTable() {
        DefaultTableModel modelPizza = (DefaultTableModel) PizzaTable.getModel();
        DefaultTableModel modelIngrediente = (DefaultTableModel) ingredienteViewTable.getModel();

        modelPizza.setRowCount(0);
        modelIngrediente.setRowCount(0);

        PizzaBEAN selectedPizza = new PizzaBEAN((Integer) modelPizza.getValueAt(PizzaTable.getSelectedRow(), 0));

        ArrayList<IngredienteBEAN> _listaIngrediente = controle.listIngredientePizza(selectedPizza);

        for (IngredienteBEAN ingrediente : _listaIngrediente) {
            modelIngrediente.addRow(new Object[]{
                ingrediente.getId(),
                ingrediente.getNome()
            });
        }

    }

    private void fillIngredienteInsertTable() {
        DefaultTableModel modelInsertIngrediente = (DefaultTableModel) ingredienteInsertTable.getModel();
        DefaultTableModel modelViewIngrediente = (DefaultTableModel) ingredienteViewTable.getModel();

        modelInsertIngrediente.setRowCount(0);
        modelViewIngrediente.setRowCount(0);

        for (int i = 0; i < modelViewIngrediente.getRowCount(); i++) {
            modelInsertIngrediente.addRow(new Object[]{
                modelViewIngrediente.getValueAt(i, 0)
            });
        }
    }

    private void fillIngredienteTable() {
        DefaultTableModel model = (DefaultTableModel) ingredienteInsertTable.getModel();
                
        if (ingredienteCB.getSelectedIndex() != 0) {
            model.addRow(new Object[]{
                listaIngrediente.get(ingredienteCB.getSelectedIndex() - 1).getId(),
                listaIngrediente.get(ingredienteCB.getSelectedIndex() - 1).getNome()
            });
        }

    }

    private void fillPizzaTable() {

        DefaultTableModel model = (DefaultTableModel) PizzaTable.getModel();

        model.setRowCount(0);    
        
        listaPizza = controle.listaPizza();

        for (PizzaBEAN pizza : listaPizza) {

            boolean ativo = false;

            if (pizza.getStatus() == 1) {
                ativo = true;
            }

            model.addRow(new Object[]{
                pizza.getId(),
                pizza.getNome(),
                pizza.getDetalhes(),
                ativo
            });
        }
    }

    private void fillIngredienteCB() {
        listaIngrediente = controle.listaIngrediente();

        for (IngredienteBEAN ingrediente : listaIngrediente) {
            ingredienteCB.addItem(ingrediente.getNome());
        }

    }

    private void pesquisar(String str, boolean cbAtivo) {

        DefaultTableModel model = (DefaultTableModel) ingredienteInsertTable.getModel();
        model.setRowCount(0);

        if (str.equals("")) {

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

    private void inserir(String nome, String desc) {

        DefaultTableModel model = (DefaultTableModel) ingredienteInsertTable.getModel();

        ArrayList<IngredienteBEAN> _ingredienteList = new ArrayList<IngredienteBEAN>();

        for (int i = 0; i < model.getRowCount(); i++) {
            _ingredienteList.add(new IngredienteBEAN((Integer) model.getValueAt(i, 0)));
        }

        try {
            controle.addPizza(new PizzaBEAN(nome, desc, 1), _ingredienteList);
        } catch (SQLException ex) {
            Logger.getLogger(PizzaView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void desativarAtivar(int id, boolean status) {

        PizzaBEAN pizza = controle.findPizza(id);

        if (status == false) {
            pizza.setStatus(1);
        } else {
            pizza.setStatus(0);

        }

        controle.updatePizza(pizza);

    }

    private void alterar(String nome, String desc) {

        DefaultTableModel model = (DefaultTableModel) ingredienteInsertTable.getModel();

        ArrayList<IngredienteBEAN> _ingredienteList = new ArrayList<IngredienteBEAN>();

        for (int i = 0; i < model.getRowCount(); i++) {
            _ingredienteList.add(new IngredienteBEAN((String) model.getValueAt(i, 0)));
        }

        controle.updatePizza(new PizzaBEAN(nome, desc, 1), _ingredienteList);

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
    private javax.swing.JTable PizzaTable;
    private javax.swing.JButton addIngredienteButton;
    private javax.swing.JCheckBox ativosCK;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton desativarButton;
    private javax.swing.JTextField descTF;
    private javax.swing.JButton disposeButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JDialog erroDialog;
    private javax.swing.JComboBox<String> ingredienteCB;
    private javax.swing.JTable ingredienteInsertTable;
    private javax.swing.JTable ingredienteTable1;
    private javax.swing.JTable ingredienteViewTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLabel1;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JButton novoButton;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pesquisarTF;
    private javax.swing.JButton removeIngredienteButton;
    private javax.swing.JButton salvarButton;
    // End of variables declaration//GEN-END:variables
}
