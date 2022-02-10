package controller;

import java.io.IOException;
import persistencia.PersistenciaBuscaIp;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerBuscaIp {
    
    private PersistenciaBuscaIp persistencia;

    public ControllerBuscaIp() {
        this.persistencia = new PersistenciaBuscaIp();
    }

    public PersistenciaBuscaIp getPersistencia() {
        return persistencia;
    }

    public String getIp(String nome) throws IOException {
        return this.getPersistencia().getIp(nome);
    }
    
}
