/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.view.UsuarioJFrame;
import gamadesktop.view.ViewPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gamadesktop.modelo.to.*;

/**
 *
 * @author andre
 */
public class InsereUsuarioListener extends ControlerListener implements ActionListener{


    public InsereUsuarioListener(GamaControler g,ViewPrincipal v) {
        super(g,v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing insere usuario listener disparado");
        Usuario u = gamaView.obterUsuarioDigitado();
        gamaControler.inserirUsuario(u);       
        gamaView.insereNovoUsuarioLista(u);
    }
    
    
    
}
