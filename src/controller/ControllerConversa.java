package controller;

import java.util.ArrayList;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerConversa {
    
    private ArrayList<String> mensagens;
    private String ipContato;

    public ControllerConversa(String ipContato) {
        mensagens = new ArrayList<>();
        this.ipContato = ipContato;
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
