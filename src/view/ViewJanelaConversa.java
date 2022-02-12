package view;

import sockets.Sender;
import controller.ControllerConversa;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;
import sockets.Receiver;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ViewJanelaConversa extends javax.swing.JFrame implements InterfaceViewObserver {
    
    private ControllerConversa controller;
    private ListModelConversa listModel;

    public ViewJanelaConversa(String nome, String ip) throws IOException {
        this.controller = new ControllerConversa(ip);
        initComponents();
        
        this.getContentPane().setBackground(new Color(242, 236, 228));
        this.pnChat.setBackground(Color.white);
        lbNome.setText(nome);
        
        this.listModel = new ListModelConversa(this.controller);
        this.controller.addObserver(this);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btEnviar = new javax.swing.JButton();
        tfMensagem = new javax.swing.JTextField();
        pnChat = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chat = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btEnviar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btEnviar.setText("Enviar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

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

        chat.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chat.setModel(new ListModelConversa(this.controller));
        chat.setBackground(new Color(242, 236, 228));
        jScrollPane1.setViewportView(chat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnChat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(tfMensagem))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        String novaMensagem = tfMensagem.getText();
        
        this.controller.addMensagem(novaMensagem);
        Sender sender = new Sender(controller.getIp(), 5050, novaMensagem);
        
        new Thread(() -> {
            sender.run();
        }).start();
        
        tfMensagem.setText("");
        atualizaListModel();
        
        try {
            sender.close();
        } catch (IOException ex) {
            Logger.getLogger(ViewJanelaConversa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEnviarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Receiver receiver = new Receiver(5051, this.controller);
            new Thread(() -> {
                receiver.run();
            }).start();
        } catch (IOException ex) {
            Logger.getLogger(ViewJanelaConversa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnviar;
    private javax.swing.JList<String> chat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel pnChat;
    private javax.swing.JTextField tfMensagem;
    // End of variables declaration//GEN-END:variables
    
    public void atualizaListModel() {
        this.chat.updateUI();
    }
}
