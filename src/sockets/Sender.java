package sockets;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Eloisa e Maria Eduarda
 */
public class Sender extends Connection {

    private String hostContato;
    private int portaContato;
    private String mensagem;
    
    public Sender(String hostContato, int portaContato, String mensagem) {
        this.hostContato = hostContato;
        this.portaContato = portaContato;
        this.mensagem = mensagem;
    }  
    
    @Override
    public void run() {
        try ( Socket conexao = new Socket(hostContato, portaContato)) /* try-with */ {
            
            this.setConn(conexao);
            OutputStream output = getConn().getOutputStream();
            
            System.out.println("oi");
            output.write(mensagem.getBytes());
            
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void close() throws IOException {
        this.getConn().close();
    }
}
