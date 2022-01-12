package model;

import java.util.HashMap;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ModelUsuario {
    
    private int    id;
    private String nome;
    private String username;
    private String email;
    private String senha;
    
    private boolean online;
    private HashMap<String, ModelUsuario> amigos;

    public ModelUsuario() {}

    public ModelUsuario(String nome, String username, String email, String senha) {
//        this.id = id;
        this.nome = nome;
        this.username = username;
        this.email = email;
        this.senha = senha;
        this.amigos = new HashMap<String, ModelUsuario>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public HashMap<String, ModelUsuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(HashMap<String, ModelUsuario> amigos) {
        this.amigos = amigos;
    }
    
    public void addAmigo(ModelUsuario amigo) {
        this.amigos.put(amigo.getUsername(), amigo);
    }
    
    public void removeAmigo(String username) {
        this.amigos.remove(username);
    }
}
