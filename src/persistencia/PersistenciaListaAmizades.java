package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import model.ModelAmizade;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaListaAmizades extends PersistenciaAmizadePadrao {
    
    public ArrayList<ModelAmizade> listar() throws FileNotFoundException, IOException {
        ArrayList<ModelAmizade> amizades = new ArrayList<>();
        
        this.iniciaLeitor();
        
        String linha = this.getLeitor().readLine(); 
        while(linha != null) {
            
            String[] infos = linha.split("-");
            ModelAmizade amizade = new ModelAmizade(infos[0], infos[1], Integer.parseInt(infos[2]));
            amizades.add(amizade);
            
            linha = this.getLeitor().readLine(); 
        }
        
        this.encerraLeitor();
        
        return amizades;
    }
}
