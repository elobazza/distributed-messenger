package view;

import controller.ControllerConversa;
import java.awt.Color;

/**
 *
 * @author Eloisa e Maria Eduarda
 */
public class ViewJanelaConversa extends javax.swing.JFrame {
    
    private ControllerConversa controller;

    public ViewJanelaConversa(String nome) {
        initComponents();
        this.getContentPane().setBackground(new Color(242, 236, 228));
        this.pnChat.setBackground(Color.white);
        lbNome.setText(nome);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEnviar = new javax.swing.JButton();
        tfMensagem = new javax.swing.JTextField();
        pnChat = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btEnviar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btEnviar.setText("Enviar");

        lbNome.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbNome.setText("Nome Pessoa");

        javax.swing.GroupLayout pnChatLayout = new javax.swing.GroupLayout(pnChat);
        pnChat.setLayout(pnChatLayout);
        pnChatLayout.setHorizontalGroup(
            pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChatLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbNome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnChatLayout.setVerticalGroup(
            pnChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChatLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(lbNome)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tfMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tfMensagem))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnChat;
    private javax.swing.JTextField tfMensagem;
    // End of variables declaration//GEN-END:variables
}
