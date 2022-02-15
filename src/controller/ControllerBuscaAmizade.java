package controller;

import java.io.IOException;
import persistencia.PersistenciaBuscaAmizade;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerBuscaAmizade {
    
    private PersistenciaBuscaAmizade persistencia;

    public ControllerBuscaAmizade() {
        this.persistencia = new PersistenciaBuscaAmizade();
    }

    public PersistenciaBuscaAmizade getPersistencia() {
        return persistencia;
    }

    public String getIp(String nome) throws IOException {
        return this.getPersistencia().getIp(nome);
    }
    
    public int getPorta(String nome) throws IOException {
        return this.getPersistencia().getPorta(nome);
    }
    
}
