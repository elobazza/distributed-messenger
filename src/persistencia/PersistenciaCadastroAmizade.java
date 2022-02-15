package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import model.ModelAmizade;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaCadastroAmizade extends PersistenciaAmizadePadrao {
 
    public void cadastrar (String nome, String ip, int porta) throws IOException {
        String retorno = nome + "-" + ip + "-" + porta;
        
        
        this.iniciaLeitor();
        //Cria Arquivo Temporario
        File tempFile = new File("src/database/tempfile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
        
        String linha = this.getLeitor().readLine(); 
        while(linha != null) {
            String[] infos = linha.split("-");
            ModelAmizade amizade = new ModelAmizade(infos[0], infos[1], Integer.parseInt(infos[2]));
            writer.write(linha);
            writer.newLine();
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
                this.getGravador().newLine();
        }
        
        this.getGravador().write(retorno); // GRAVA NOVO REGISTRO
        
        reader.close();
        this.encerraGravador();
        
    }
}
