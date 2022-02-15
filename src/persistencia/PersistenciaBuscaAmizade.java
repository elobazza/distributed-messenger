package persistencia;

import java.io.IOException;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaBuscaAmizade extends PersistenciaAmizadePadrao {
    
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
    
    public int getPorta(String nome) throws IOException {
        this.iniciaLeitor();
        
        String linha = this.getLeitor().readLine(); 
        while(linha != null) {
            String[] infos = linha.split("-");
            if(infos[0].equals(nome)) {
                System.out.println(infos[2]);
                return Integer.parseInt(infos[2]);
            }
            linha = this.getLeitor().readLine(); 
        }
        
        return 0;
    }
}
