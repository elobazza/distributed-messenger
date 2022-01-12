package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Eloisa e Maria Eduarda
 */
public class PersistenciaUsuarioPadrao {

    private File arquivo = new File("src/database/usuarios.txt");
    
    private FileReader leitorArq;
    private FileWriter gravadorArq;
    
    private BufferedReader leitor;
    private BufferedWriter gravador;
    

    public void iniciaLeitor() throws FileNotFoundException {
        leitorArq = new FileReader(arquivo);
        leitor    = new BufferedReader(leitorArq);
    }

    public void iniciaGravador() throws IOException {
        gravadorArq = new FileWriter(arquivo);
        gravador    = new BufferedWriter(gravadorArq);
    }  
    
    public BufferedReader getLeitor() {
        return this.leitor;
    }
    
    public BufferedWriter getGravador() {
        return this.gravador;
    }
    
    public void encerraLeitor() throws IOException {
        this.leitor.close();
        this.leitorArq.close();
    }
    
    public void encerraGravador() throws IOException {
        this.gravador.newLine();
        this.gravador.close();
        this.gravadorArq.close();
    }
}
