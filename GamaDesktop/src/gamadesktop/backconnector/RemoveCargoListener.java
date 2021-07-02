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
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author andre
 */
public class RemoveCargoListener extends ControlerListener implements ActionListener{

    public RemoveCargoListener(GamaControler g,ViewPrincipal v) {
        super(g,v);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing remover CARGO listener disparado");
        Cargo c = gamaView.obterCargoDigitado();
        gamaControler.removerCargo(c);
        gamaView.limpaListaCargos();
        ArrayList<Cargo> lista = new ArrayList<Cargo>();
        gamaControler.recuperarCargos(lista, null);
        Iterator it = lista.iterator();
        while(it.hasNext()){
            c = (Cargo)it.next();
            gamaView.insereCargoLista(c);
        }
    }
    
}
