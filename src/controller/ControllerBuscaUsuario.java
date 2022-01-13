package controller;

import java.io.IOException;
import model.ModelUsuario;
import persistencia.PersistenciaBuscaUsuario;

/**
 * @author Eloisa e Maria Eduarda Buzana
 */
public class ControllerBuscaUsuario {
    
    private PersistenciaBuscaUsuario persistencia;

    public ControllerBuscaUsuario() {
        this.persistencia = new PersistenciaBuscaUsuario();
    }

    public PersistenciaBuscaUsuario getPersistencia() {
        return persistencia;
    }

    public ModelUsuario buscar(String username) throws IOException {
        return this.getPersistencia().buscar(username);
    }
}
