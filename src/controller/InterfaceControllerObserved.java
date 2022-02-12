package controller;

import view.InterfaceViewObserver;

/**
 * @author Eloisa e Maria Eduarda
 */
public interface InterfaceControllerObserved {
    
    public void addObserver(InterfaceViewObserver observer);
    
    public void removeObserver(InterfaceViewObserver observer);
    
}
