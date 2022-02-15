package sockets;

import controller.ControllerConversa;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 * @author Eloisa e Maria Eduarda
 */
public class Receiver extends Connection {
        
    private int porta;
    private ControllerConversa controller;
    private ServerSocket server;
    
    public Receiver(int porta, ControllerConversa controller) throws IOException{
        this.porta = porta;
        this.controller = controller;
    } 
    
    @Override
    public void run() {
        try {
            this.server = new ServerSocket(porta);
            
            System.out.println("Esperando conexão");
            
            while (!this.server.isClosed()) {
                
                Socket conn = null;
                try {
                    conn = this.server.accept();
                    System.out.println("Conexão recebida de: " + conn.getInetAddress().getHostAddress());

                    InputStream inputStream = conn.getInputStream();

                    byte[] dadosBrutos = new byte[1024];
                    int qtdBytesLidos = inputStream.read(dadosBrutos);

                    String mensagem = new String(dadosBrutos, 0, qtdBytesLidos);

                    this.updateUiWithMessage(mensagem);

                    System.out.println(mensagem);
                } catch (SocketException se) {
                    System.out.println("Fechou o server");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void updateUiWithMessage(String message) {
        new Thread() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        controller.addMensagem(controller.getNome()+ ": " + message);
                        controller.notifyListModelChanged();
                    }
                });
            }
        }.start();
    }
    
    public void close() throws IOException {
        this.server.close(); 
    }
}
