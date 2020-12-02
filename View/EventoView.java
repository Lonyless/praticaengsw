package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Control.Control;
import Model.CardapioBEAN;
import Model.EventoBEAN;
import Model.FornecedorBEAN;
import Model.IngredienteBEAN;
import javax.swing.table.DefaultTableModel;

public class EventoView extends javax.swing.JFrame {

    public EventoView() {
        initComponents();
        listar();
        fillCardapioCB();

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
        salvarButton = new javax.swing.JButton();
        desativarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        eventoTable = new javax.swing.JTable();
        pesquisarButton = new javax.swing.JButton();
        pesquisarTF = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        ativosCK = new javax.swing.JCheckBox();
        nomeTF = new javax.swing.JTextField();
        novoButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        cardapioLabel = new javax.swing.JLabel();
        cardapioCB = new javax.swing.JComboBox<>();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salvarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        desativarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        desativarButton.setText("Destivar/Ativar");
        desativarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desativarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cancelarButton.setText("Cancelar");

        eventoTable.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        eventoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cardapio", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(eventoTable);
        if (eventoTable.getColumnModel().getColumnCount() > 0) {
            eventoTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            eventoTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        pesquisarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        pesquisarTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        nomeLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        nomeLabel.setText("Nome");

        ativosCK.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ativosCK.setText("Ativos");

        nomeTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        novoButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        editarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        cardapioLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cardapioLabel.setText("Cardapio");

        cardapioCB.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cardapioCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<selecione>" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardapioCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardapioLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane)
                                .addComponent(nomeLabel)
                                .addComponent(nomeTF)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pesquisarTF)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(novoButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(editarButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(salvarButton)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(desativarButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cancelarButton))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(ativosCK)
                                            .addGap(84, 84, 84)
                                            .addComponent(pesquisarButton))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cardapioLabel)
                .addGap(18, 18, 18)
                .addComponent(cardapioCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(novoButton)
                        .addComponent(editarButton)
                        .addComponent(salvarButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarButton)
                        .addComponent(desativarButton)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarButton)
                    .addComponent(pesquisarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativosCK))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        alterar(selectedEvento.getId(), nomeTF.getText(), cardapioCB.getSelectedIndex()-1);
        listar();
        nomeTF.setText("");

        cardapioCB.setSelectedIndex(0);
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void desativarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) eventoTable.getModel();

        desativarAtivar((Integer) model.getValueAt(eventoTable.getSelectedRow(), 0), (Boolean) model.getValueAt(eventoTable.getSelectedRow(), 3));
        listar();
    }//GEN-LAST:event_desativarButtonActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        pesquisar(pesquisarTF.getText(), ativosCK.isSelected());
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        inserir(nomeTF.getText(), cardapioCB.getSelectedIndex()-1);
        listar();
        nomeTF.setText("");

        cardapioCB.setSelectedIndex(0);
    }//GEN-LAST:event_novoButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) eventoTable.getModel();

        nomeTF.setText((String) model.getValueAt(eventoTable.getSelectedRow(), 1));
        cardapioCB.setSelectedItem((String) model.getValueAt(eventoTable.getSelectedRow(), 2));

        selectedEvento.setId((Integer) model.getValueAt(eventoTable.getSelectedRow(), 0));
    }//GEN-LAST:event_editarButtonActionPerformed

    private void disposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disposeButtonActionPerformed
        erroDialog.dispose();
    }//GEN-LAST:event_disposeButtonActionPerformed

    EventoBEAN selectedEvento = new EventoBEAN();

    static Control controle = new Control();
    ArrayList<CardapioBEAN> listaCardapio = new ArrayList<CardapioBEAN>();

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

    private void fillCardapioCB() {

        listaCardapio = controle.listaCardapio();

        for (CardapioBEAN cardapio : listaCardapio) {
            cardapioCB.addItem(cardapio.getNome());
        }

    }

    private void pesquisar(String str, boolean cbAtivo) {

        DefaultTableModel model = (DefaultTableModel) eventoTable.getModel();
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

        DefaultTableModel model = (DefaultTableModel) eventoTable.getModel();

        model.setRowCount(0);

        List<EventoBEAN> listEvento = controle.listaEvento();
        List<CardapioBEAN> listCardapio = controle.listaCardapio();

        for (EventoBEAN evento : listEvento) {

            boolean ativo = false;

            if (evento.getStatus() == 1) {
                ativo = true;
            }

            model.addRow(new Object[]{
                evento.getId(),
                evento.getNome(),
                controle.findCardapio(evento.getId_cardapio()).getNome(),
                ativo
            });

        }
    }

    private void inserir(String nome, int indexCardapio) {

        CardapioBEAN cardapio = listaCardapio.get(indexCardapio);

        EventoBEAN evento = new EventoBEAN(nome, cardapio.getId(), 1);

        List<EventoBEAN> listEvento = controle.listaEvento();

        boolean exist = false;

        for (EventoBEAN _evento : listEvento) {
            if (evento.getNome() == _evento.getNome()
                    && evento.getId_cardapio() == _evento.getId_cardapio()) {
                exist = true;
            }
        }

        if (!exist) {
            controle.addEvento(evento);
        }

    }

    private static void desativarAtivar(int id, boolean status) {

        EventoBEAN evento = controle.findEvento(id);

        if (status == false) {
            evento.setStatus(1);
        } else {
            evento.setStatus(0);

        }

        controle.updateEvento(evento);

    }

    private void alterar(int id, String nome, int indexCardapio) {

        CardapioBEAN cardapio = listaCardapio.get(indexCardapio);

        EventoBEAN evento = new EventoBEAN(id, nome, 1, cardapio.getId());

        controle.updateEvento(evento);

    }

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
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ativosCK;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JComboBox<String> cardapioCB;
    private javax.swing.JLabel cardapioLabel;
    private javax.swing.JButton desativarButton;
    private javax.swing.JButton disposeButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JDialog erroDialog;
    private javax.swing.JTable eventoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JButton novoButton;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pesquisarTF;
    private javax.swing.JButton salvarButton;
    // End of variables declaration//GEN-END:variables
}
