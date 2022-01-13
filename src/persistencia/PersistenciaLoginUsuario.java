package persistencia;

import java.io.IOException;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaLoginUsuario extends PersistenciaUsuarioPadrao {
    
    public boolean login(String username, String senha) throws IOException {
        this.iniciaLeitor();
        String linha = this.getLeitor().readLine(); 
        
        while(linha != null) {
            String[] infos = linha.split("-");
            
            if(infos[1].equals(username) && infos[3].equals(senha)) {
                return true;
            } 
            else {
                linha = this.getLeitor().readLine();
            }
            
        }
        
        this.encerraLeitor();
        return false;
    }
}
