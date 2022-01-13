package persistencia;

import java.io.IOException;
import model.ModelUsuario;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaBuscaUsuario extends PersistenciaUsuarioPadrao {
    
    public ModelUsuario buscar(String username) throws IOException {
        this.iniciaLeitor();
        String linha = this.getLeitor().readLine(); 
        
        while(linha != null) {
            String[] infos = linha.split("-");
            
            if(infos[1].equals(username)) {
                ModelUsuario usuario = new ModelUsuario();
                usuario.setNome(infos[0]);
                usuario.setUsername(infos[1]);
                usuario.setEmail(infos[2]);
                return usuario;
            } 
            else {
                linha = this.getLeitor().readLine();
            }
            
        }
        
        this.encerraLeitor();
        return null;
    }
}
