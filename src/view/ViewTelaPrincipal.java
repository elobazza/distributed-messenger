package view;

import controller.ControllerListaAmizades;
import controller.ControllerRemoveAmizade;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelAmizade;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ViewTelaPrincipal extends javax.swing.JFrame {

    private ListModelAmizade listModel = new ListModelAmizade();
    ArrayList<ModelAmizade> amizades;
            
    public ViewTelaPrincipal() throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.pnBatePapo.setBackground(new Color(242, 236, 228));
        
        if(true) {
            lbNome.setVisible(false);
            btConversar.setVisible(false);
        }
        
        this.amizades = new ControllerListaAmizades().listar();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBatePapo = new javax.swing.JPanel();
        btConversar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        btAdiciona = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAmigos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btConversar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btConversar.setText("Conversar");
        btConversar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConversarActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNome.setText("Nome");

        javax.swing.GroupLayout pnBatePapoLayout = new javax.swing.GroupLayout(pnBatePapo);
        pnBatePapo.setLayout(pnBatePapoLayout);
        pnBatePapoLayout.setHorizontalGroup(
            pnBatePapoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBatePapoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btConversar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
            .addComponent(lbNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnBatePapoLayout.setVerticalGroup(
            pnBatePapoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBatePapoLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btConversar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btAdiciona.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btAdiciona.setText("Adiciona");
        btAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionaActionPerformed(evt);
            }
        });

        btRemove.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btRemove.setText("Remove");
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveActionPerformed(evt);
            }
        });

        listAmigos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        listAmigos.setModel(new ListModelAmizade());
        listAmigos.setAutoscrolls(false);
        listAmigos.setFixedCellHeight(40);
        listAmigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAmigosMouseClicked(evt);
            }
        });
        listAmigos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listAmigosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(listAmigos);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("LISTA DE AMIGOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(pnBatePapo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnBatePapo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionaActionPerformed
        new ViewCadastroAmizade(this).setVisible(true);
    }//GEN-LAST:event_btAdicionaActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        String nomeRemover = listAmigos.getSelectedValue();
        
        if(nomeRemover == null) {
            JOptionPane.showMessageDialog(rootPane, "Selecione alguém para fazer a remoção!");
        }
        else {
            int opcao = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover "+ nomeRemover + "? :C", "Remover Amizade", 0);

            if(opcao == 0) {
                try {
                    new ControllerRemoveAmizade().removeAmizade(nomeRemover);
                    atualizaListModel();
                } catch (IOException ex) {
                    Logger.getLogger(ViewTelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btConversarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConversarActionPerformed
        String nome = listAmigos.getSelectedValue();
        
        new ViewJanelaConversa(nome).setVisible(true);
    }//GEN-LAST:event_btConversarActionPerformed

    private void listAmigosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listAmigosKeyPressed
    }//GEN-LAST:event_listAmigosKeyPressed

    private void listAmigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAmigosMouseClicked
        lbNome.setText(listAmigos.getSelectedValue());
        lbNome.setVisible(true);
        btConversar.setVisible(true);
    }//GEN-LAST:event_listAmigosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdiciona;
    private javax.swing.JButton btConversar;
    private javax.swing.JButton btRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JList<String> listAmigos;
    private javax.swing.JPanel pnBatePapo;
    // End of variables declaration//GEN-END:variables


    public void atualizaListModel() {
        this.listAmigos.setModel(this.listModel);
    }

}
