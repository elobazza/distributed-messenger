package controller;

import java.util.ArrayList;
import view.InterfaceViewObserver;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ControllerConversa implements InterfaceControllerObserved {
    
    private ArrayList<String> mensagens;
    private String nomeContato;
    private String ipContato;
    private int porta;
    
    private final ArrayList<InterfaceViewObserver> observers;

    public ControllerConversa(String nomeContato, String ipContato, int porta) {
        this.mensagens = new ArrayList<>();
        this.observers = new ArrayList<>();
        
        this.nomeContato = nomeContato;
        this.ipContato   = ipContato;
        this.porta       = porta;
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
    
    public int getPorta() {
        return this.porta;
    }
    
    public String getIp() {
        return this.ipContato;
    }
    
    public String getNome() {
        return this.nomeContato;
    }

    public void addObserver(InterfaceViewObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(InterfaceViewObserver observer) {
        this.observers.remove(observer);
    }
    
    public synchronized void notifyListModelChanged() {
        for (InterfaceViewObserver observer : this.observers) {
            observer.atualizaListModel();
        }
    }
}
