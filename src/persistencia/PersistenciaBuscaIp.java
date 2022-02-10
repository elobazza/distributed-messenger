package persistencia;

import java.io.IOException;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaBuscaIp extends PersistenciaAmizadePadrao {
    
    public String getIp(String nome) throws IOException {
        this.iniciaLeitor();
        
        String linha = this.getLeitor().readLine(); 
        while(linha != null) {
            String[] infos = linha.split("-");
            if(infos[0].equals(nome)) {
                return infos[1];
            }
            linha = this.getLeitor().readLine(); 
        }
        
        return "";
    }
}
