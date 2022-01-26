package view;

import controller.ControllerBatePapo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import model.ModelAmizade;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ListModelAmizade extends DefaultListModel<String> {
    
    public ListModelAmizade() {}

    @Override
    public int getSize() {
        try {
            return ControllerBatePapo.getInstance().getQtdAmizades();
        } catch (IOException ex) {
            Logger.getLogger(ListModelAmizade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public String getElementAt(int index) {
        try {
            return ControllerBatePapo.getInstance().getAmizade(index).getNome();
        } catch (IOException ex) {
            Logger.getLogger(ListModelAmizade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
