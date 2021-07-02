/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.view.PerfilJFrame;
import gamadesktop.view.ViewPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gamadesktop.modelo.to.Perfil;


/**
 *
 * @author andre
 */
public class RemovePerfilListener extends ControlerListener implements ActionListener{
  
    public RemovePerfilListener(GamaControler g,ViewPrincipal v) {
        super(g,v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing remover perfil listener disparado");
        Perfil p = gamaView.obterPerfilDigitado();
        gamaControler.removerPerfil(p);       
    }
    
}
