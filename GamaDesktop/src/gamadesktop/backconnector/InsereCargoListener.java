/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.view.CargoJFrame;
import gamadesktop.view.ViewPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gamadesktop.modelo.to.Cargo;

/**
 *
 * @author andre
 */
public class InsereCargoListener extends ControlerListener implements ActionListener{
        
    public InsereCargoListener(GamaControler g,ViewPrincipal v) {
        super(g,v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing insere cargo listener disparado");
        Cargo c = gamaView.obterCargoDigitado();
        gamaControler.inserirCargo(c);
        gamaView.insereCargoLista(c);
    }
    
    
}
