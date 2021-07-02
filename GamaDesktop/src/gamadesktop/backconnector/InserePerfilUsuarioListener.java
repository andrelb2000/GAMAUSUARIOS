/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.view.ViewPrincipal;
import gamadesktop.modelo.to.Perfil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */
public class InserePerfilUsuarioListener extends ControlerListener implements ActionListener{

    public InserePerfilUsuarioListener(GamaControler g, ViewPrincipal v) {
        super(g, v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Perfil p = gamaView.obterPerfilInserirUsuario();
        gamaView.insereNovoPerfilUsuario(p);  
    }
    
}
