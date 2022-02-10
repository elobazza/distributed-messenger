package view;

import controller.ControllerConversa;
import javax.swing.AbstractListModel;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ListModelConversa extends AbstractListModel<String> {
    
    private ControllerConversa controller;
    
    public ListModelConversa(ControllerConversa controller) {
        this.controller = controller;
    }
    
    @Override
    public int getSize() {
        return this.controller.getQtdMensagens();
    }

    @Override
    public String getElementAt(int index) {
        return this.controller.getMensagem(index);
    }
    
}
