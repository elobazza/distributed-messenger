package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import model.ModelAmizade;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaRemoveAmizade extends PersistenciaAmizadePadrao {
    
    public void removeAmizade(String nome) throws IOException {
       
        this.iniciaLeitor();
        //Cria Arquivo Temporario
        File tempFile = new File("tempfile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        
        String linha = this.getLeitor().readLine(); 
        while(linha != null) {
            String[] infos = linha.split("-");
            ModelAmizade amizade = new ModelAmizade(infos[0], infos[1]);
            if(!amizade.getNome().equals(nome)) {
                writer.write(linha);
                writer.newLine();
            }
            
            linha = this.getLeitor().readLine(); 
        }
        
        writer.close();
        this.encerraLeitor();
        
        
        /////
        this.iniciaGravador();
        BufferedReader reader = new BufferedReader(new FileReader(tempFile));
        
        String linhaLeitura = reader.readLine(); 
        while(linhaLeitura != null && !linhaLeitura.equals(" ")) {
                this.getGravador().write(linhaLeitura);
                linhaLeitura = reader.readLine(); 
                if(linhaLeitura != null) {
                    this.getGravador().newLine();
                }
        }
        
        reader.close();
        this.encerraGravador();
        
    }
    
}
