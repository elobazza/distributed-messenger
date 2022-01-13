package controller;

import java.io.IOException;
import persistencia.PersistenciaLoginUsuario;

/**
 * @author Eloisa e Maria Eduarda Buzana
 */
public class ControllerLoginUsuario {
    
    private PersistenciaLoginUsuario persistencia;

    public ControllerLoginUsuario() {
        this.persistencia = new PersistenciaLoginUsuario();
    }

    public PersistenciaLoginUsuario getPersistencia() {
        return persistencia;
    }

    public boolean login(String username, String senha) throws IOException {
        return this.getPersistencia().login(username, senha);
    }
}
