package persistencia;

import java.io.IOException;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaCadastroUsuario extends PersistenciaUsuarioPadrao {
    
    public void cadastrar (String nome, String username, String email, String senha) throws IOException {
        String retorno = nome + "-" + username + "-" + email + "-" + senha;
        this.iniciaGravador();
        this.getGravador().write(retorno);
        this.encerraGravador();
    }
}
