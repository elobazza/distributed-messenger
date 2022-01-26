package controller;

import java.io.IOException;
import java.util.ArrayList;
import model.ModelAmizade;

/**
 * @author Eloisa e
 */
public class ControllerBatePapo {
    
    private ArrayList<ModelAmizade> amizades;
    private static ControllerBatePapo instance = null;
    
    
    public static ControllerBatePapo getInstance() {
        if (instance == null) {
            instance = new ControllerBatePapo();
        }
        return instance;
    }
    
    public void listaAmizades() throws IOException {
        this.amizades = new ControllerListaAmizades().listar();
    }
    
    public int getQtdAmizades() throws IOException {
        this.listaAmizades();
        return this.amizades.size();
    }
    
    public ModelAmizade getAmizade(int row) throws IOException {
        return this.amizades.get(row);
    }
}
