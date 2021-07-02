/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import static gamadesktop.backconnector.ControlerListener.dep;
import gamadesktop.controler.GamaControler;
import gamadesktop.modelo.to.Cargo;
import gamadesktop.view.ViewPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andre
 */
public class RecuperaCargosListener extends ControlerListener implements ActionListener {

    public RecuperaCargosListener(GamaControler g, ViewPrincipal v) {
        super(g, v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing Recupera cargos listener disparado");
        gamaView.limpaListaCargos();
        ArrayList<Cargo> lista = new ArrayList<Cargo>();
        gamaControler.recuperarCargos(lista, null);
        Iterator it = lista.iterator();
        while(it.hasNext()){
            Cargo c = (Cargo)it.next();
            gamaView.insereCargoLista(c);
        }
    }
    
    
}
