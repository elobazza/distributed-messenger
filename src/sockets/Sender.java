package sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author Eloisa e Maria Eduarda
 */
public class Sender extends Connection {

    private String hostContato;
    private int portaContato;
    private String mensagem;
    private JFrame frame;
    
    public Sender(String hostContato, int portaContato, String mensagem, JFrame frame) {
        this.hostContato = hostContato;
        this.portaContato = portaContato;
        this.mensagem = mensagem;
        this.frame = frame;
    }  
    
    @Override
    public void run() {
        try {
            Socket conexao = new Socket(hostContato, portaContato);
            this.setConn(conexao);
            OutputStream output = getConn().getOutputStream();
            
            output.write(mensagem.getBytes());
            
            this.close();   
        }  catch (ConnectException e) {
            JOptionPane.showMessageDialog(frame, "Poxa, caiu a conexão! :C");
        } catch (IOException ex) {
            Logger.getLogger(Sender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void close() throws IOException {
        this.getConn().shutdownInput();
    }
}
