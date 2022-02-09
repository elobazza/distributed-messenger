package controller;

import java.io.IOException;
import persistencia.PersistenciaCadastroAmizade;

/**
 * @author Eloisa e Maria Eduarda Buzana
 */
public class ControllerCadastroAmizade {

    private PersistenciaCadastroAmizade persistencia;

    public ControllerCadastroAmizade() {
        this.persistencia = new PersistenciaCadastroAmizade();
    }

    public PersistenciaCadastroAmizade getPersistencia() {
        return persistencia;
    }

    public void cadastrar(String nome, String ip) throws IOException {
        this.getPersistencia().cadastrar(nome, ip);
    }
}
