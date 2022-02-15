package model;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ModelAmizade {
    
    private String nome;
    private String ip;
    private int    porta;
    
    public ModelAmizade() {}

    public ModelAmizade(String nome, String ip, int porta) {
        this.nome  = nome;
        this.ip    = ip;
        this.porta = porta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
}