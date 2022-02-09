package controller;

import java.util.ArrayList;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerConversa {
    
    ArrayList<String> mensagens = new ArrayList<>();
    
    private static ControllerConversa instance = null;
    
    
    public static ControllerConversa getInstance() {
        if (instance == null) {
            instance = new ControllerConversa();
        }
        return instance;
    }
    
    public void addMensagem(String mensagem) {
        mensagens.add(mensagem);
    }
    
    public int getQtdMensagens() {
        return mensagens.size();
    }
    
    public String getMensagem(int index) {
        return mensagens.get(index);
    }
    
    public ArrayList<String> getMensagens() {
        return mensagens;
    }
    
}
