package controller;

import java.io.IOException;
import java.util.ArrayList;
import model.ModelAmizade;
import persistencia.PersistenciaListaAmizades;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerListaAmizades {
    private PersistenciaListaAmizades persistencia;

    public ControllerListaAmizades() {
        this.persistencia = new PersistenciaListaAmizades();
    }

    public PersistenciaListaAmizades getPersistencia() {
        return persistencia;
    }

    public ArrayList<ModelAmizade> listar() throws IOException {
        return this.getPersistencia().listar();
    }
}
