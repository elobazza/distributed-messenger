package model;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ModelAmizade {
    
    private String nome;
    private String ip;
    
    public ModelAmizade() {}

    public ModelAmizade(String nome, String ip) {
        this.nome = nome;
        this.ip = ip;
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
}
