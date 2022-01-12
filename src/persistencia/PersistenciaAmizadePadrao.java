/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class PersistenciaAmizadePadrao {

    private BufferedReader leitor;
    private BufferedWriter gravador;
    
    public PersistenciaAmizadePadrao() throws FileNotFoundException, IOException {
        File arquivo = new File("../database/amizades.txt");
        
        FileReader leitorArq   = new FileReader(arquivo);
        FileWriter gravadorArq = new FileWriter(arquivo);
        
        leitor   = new BufferedReader(leitorArq);
        gravador = new BufferedWriter(gravadorArq);
    }

    public BufferedReader getLeitor() {
        return leitor;
    }

    public BufferedWriter getGravador() {
        return gravador;
    }   
    
    
}
