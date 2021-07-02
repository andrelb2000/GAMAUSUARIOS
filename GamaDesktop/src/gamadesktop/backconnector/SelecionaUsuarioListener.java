/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.modelo.to.Usuario;
import gamadesktop.view.ViewPrincipal;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author andre
 */
public class SelecionaUsuarioListener extends ControlerListener implements ListSelectionListener{

    public SelecionaUsuarioListener(GamaControler g, ViewPrincipal v) {
        super(g, v);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        gamaView.mostraUsuarioSelecionado();
    }
    
}
