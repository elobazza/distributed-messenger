package controller;

import java.io.IOException;
import persistencia.PersistenciaRemoveAmizade;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerRemoveAmizade {
    
    private PersistenciaRemoveAmizade persistencia;

    public ControllerRemoveAmizade() {
        this.persistencia = new PersistenciaRemoveAmizade();
    }

    public PersistenciaRemoveAmizade getPersistencia() {
        return persistencia;
    }

    public void removeAmizade(String nome) throws IOException {
        this.getPersistencia().removeAmizade(nome);
    }
}
