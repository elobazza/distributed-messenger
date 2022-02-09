package view;

import controller.ControllerConversa;
import javax.swing.DefaultListModel;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ListModelConversa extends DefaultListModel<String> {
    
    public ListModelConversa() {}
    
    @Override
    public int getSize() {
        return ControllerConversa.getInstance().getQtdMensagens();
    }

    @Override
    public String getElementAt(int index) {
        return ControllerConversa.getInstance().getMensagem(index);
    }    
}
