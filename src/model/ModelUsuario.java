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
    
    private HashMap<String, ModelUsuario> amigos; //username, Model
    
    
}
