package controller;

import java.io.IOException;
import persistencia.PersistenciaCadastroUsuario;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerCadastroUsuario {
    
    private PersistenciaCadastroUsuario persistencia;

    public ControllerCadastroUsuario() {
        this.persistencia = new PersistenciaCadastroUsuario();
    }

    public PersistenciaCadastroUsuario getPersistencia() {
        return persistencia;
    }

    public void cadastrar(String nome, String username, String email, String senha) throws IOException {
        this.getPersistencia().cadastrar(nome, username, email, senha);
    }
}
