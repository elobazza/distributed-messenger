package client;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Eloisa  e Maria Eduarda
 */
public class MainClient {
     public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o host");
        String host = input.next();
        
        System.out.println("Informe a porta");
        int porta = input.nextInt();
        
//        new Client(host, porta);
        new Client("192.168.1.23", 8080);

    }
}
