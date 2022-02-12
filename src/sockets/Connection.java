package sockets;

import java.net.Socket;

/**
 * @author Eloisa e Maria Eduarda
 */
public abstract class Connection extends Thread {
    
    private Socket conn;

    public Socket getConn() {
        return conn;
    }

    public void setConn(Socket conn) {
        this.conn = conn;
    }
    
}
