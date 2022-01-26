/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.table;

import controller.ControllerBatePapo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import model.ModelAmizade;

/**
 *
 * @author elois
 */
public class TableModelAmigos extends AbstractTableModel {
    
    public TableModelAmigos() {}
    
    @Override
    public int getRowCount() {
        try {
            return ControllerBatePapo.getInstance().getQtdAmizades();
        } catch (IOException ex) {
            Logger.getLogger(TableModelAmigos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            ModelAmizade amigo = ControllerBatePapo.getInstance().getAmizade(rowIndex);
            return amigo.getNome() + " - " + amigo.getIp();
        } catch (IOException ex) {
            Logger.getLogger(TableModelAmigos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
}
