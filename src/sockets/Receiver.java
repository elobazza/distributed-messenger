package sockets;

import controller.ControllerConversa;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Eloisa e Maria Eduarda
 */
public class Receiver extends Connection {
        
    private int porta;
    private ControllerConversa controller;
    
    public Receiver(int porta, ControllerConversa controller) throws IOException{
        this.porta = porta;
        this.controller = controller;
    } 
    
    @Override
    public void run() {
        try ( ServerSocket ss = new ServerSocket(porta)) /* try-with */ {
            System.out.println("Esperando conexão");
//            ss.setReuseAddress(true);
            
            try ( Socket conn = ss.accept()) {
                System.out.println("Conexão recebida de: " + conn.getInetAddress().getHostAddress());
                
                InputStream inputStream = conn.getInputStream();

                byte[] dadosBrutos = new byte[1024];
                int qtdBytesLidos = inputStream.read(dadosBrutos);

                String mensagem = new String(dadosBrutos, 0, qtdBytesLidos);
                
                controller.addMensagem(mensagem);
                controller.notifyListModelChanged();
                
                System.out.println(mensagem);
            }
        } catch (IOException ex) {
            Logger.getLogger(Receiver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
