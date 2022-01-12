package client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Eloisa e Maria Eduarda
 */
public class Client {
 
    private String host;
    private int porta;
    private Socket socket;
    DataOutputStream output;
    private Scanner input;

    public Client(String host, int porta) {
        this.host = host;
        this.porta = porta;
        this.input = new Scanner(System.in);
        
        try {
            this.socket = new Socket(host, porta);
            System.out.println("Conectado");
            
            this.output = new DataOutputStream(this.socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            
//            this.operacoes();            
            
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public DataOutputStream getOutput() {
        return output;
    }

    public void setOutput(DataOutputStream output) {
        this.output = output;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
}
