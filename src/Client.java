import java.net.Socket;

/**
 * @author Eloisa e Maria Eduarda
 */
public class Client extends Thread {
 
//    private Socket socket;
    
    private String host;
    private int porta;
    
    private String hostContato;
    private int portaContato;
    
    private boolean running;

    public Client(String hostContato, int portaContato) {
        this.hostContato  = hostContato;
        this.portaContato = portaContato;
    }
    
    public void run() {
        System.out.println("Porta recebida do contato: " + portaContato);
        connect();
    }
    
    public void connect() {
        try {
            Socket socket = new Socket(hostContato, portaContato);
            
            while (running) {
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
