package view;

import controller.ControllerBatePapo;
import controller.ControllerListaAmizades;
import controller.ControllerRemoveAmizade;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import model.ModelAmizade;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ViewTelaPrincipal extends javax.swing.JFrame {

//    private TableModelAmigos tableModel;
    private ListModelAmizade listModel = new ListModelAmizade();
    ArrayList<ModelAmizade> amizades;
            
    public ViewTelaPrincipal() throws IOException {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.pnBatePapo.setBackground(new Color(242, 236, 228));
        this.pnFotinho.setBackground(new Color(201, 179, 153));
        this.pnChatAtivo.setBackground(Color.white);
        
        if(true) {
            pnFotinho.setVisible(false);
            pnChatAtivo.setVisible(false);
            lbNome.setVisible(false);
            tfNovaMensagem.setVisible(false);
            btEnviar.setVisible(false);
        }
        
//        this.atualizaTableModel(new TableModelAmigos());
        this.amizades = new ControllerListaAmizades().listar();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBatePapo = new javax.swing.JPanel();
        tfNovaMensagem = new javax.swing.JTextField();
        btEnviar = new javax.swing.JButton();
        pnChatAtivo = new javax.swing.JPanel();
        pnFotinho = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        btAdiciona = new javax.swing.JButton();
        btRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAmigos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btEnviar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFotinhoLayout = new javax.swing.GroupLayout(pnFotinho);
        pnFotinho.setLayout(pnFotinhoLayout);
        pnFotinhoLayout.setHorizontalGroup(
            pnFotinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        pnFotinhoLayout.setVerticalGroup(
            pnFotinhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        lbNome.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbNome.setText("Jean Poffo");

        javax.swing.GroupLayout pnChatAtivoLayout = new javax.swing.GroupLayout(pnChatAtivo);
        pnChatAtivo.setLayout(pnChatAtivoLayout);
        pnChatAtivoLayout.setHorizontalGroup(
            pnChatAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChatAtivoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnFotinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnChatAtivoLayout.setVerticalGroup(
            pnChatAtivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnChatAtivoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnFotinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnChatAtivoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnBatePapoLayout = new javax.swing.GroupLayout(pnBatePapo);
        pnBatePapo.setLayout(pnBatePapoLayout);
        pnBatePapoLayout.setHorizontalGroup(
            pnBatePapoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBatePapoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBatePapoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBatePapoLayout.createSequentialGroup()
                        .addComponent(tfNovaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBatePapoLayout.createSequentialGroup()
                        .addComponent(pnChatAtivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnBatePapoLayout.setVerticalGroup(
            pnBatePapoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBatePapoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnChatAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                .addGroup(pnBatePapoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNovaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        jScrollPane1.setViewportView(listAmigos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdiciona, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnBatePapo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnBatePapo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1)
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
        new ViewBuscaAmizade().setVisible(true);
    }//GEN-LAST:event_btAdicionaActionPerformed

    private void btRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveActionPerformed
        String nomeRemover = listAmigos.getSelectedValue();
        try {
            new ControllerRemoveAmizade().removeAmizade(nomeRemover);
            
            
        } catch (IOException ex) {
            Logger.getLogger(ViewTelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        atualizaTableModel(listModel);
        
    }//GEN-LAST:event_btRemoveActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEnviarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdiciona;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JList<String> listAmigos;
    private javax.swing.JPanel pnBatePapo;
    private javax.swing.JPanel pnChatAtivo;
    private javax.swing.JPanel pnFotinho;
    private javax.swing.JTextField tfNovaMensagem;
    // End of variables declaration//GEN-END:variables

    public void atualizaTable() {
        
    }

    public void atualizaTableModel(ListModelAmizade listModelAmigos) {
        this.listModel = listModelAmigos;
        this.listAmigos.setModel(this.listModel);
    }

//    public void atualizaListModel(ListModelAmizade listModelAmizade) {
//        this.listAmigos = listModelAmizade;
//        this.listAmigos.setModel(this.listModel);
//    }

}
