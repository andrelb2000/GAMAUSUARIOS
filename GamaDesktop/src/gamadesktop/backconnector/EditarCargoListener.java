/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.view.CargoJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */
public class EditarCargoListener extends ControlerListener implements ActionListener{
    private CargoJFrame   cargoView; 
    public EditarCargoListener(GamaControler g,CargoJFrame cjf) {
        super(g);
        cargoView = cjf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing editar cargo listener disparado");
    }
    
}