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
public class EditarPerfilListener extends ControlerListener implements ActionListener{
    private PerfilJFrame  perfilView;   
    public EditarPerfilListener(GamaControler g,ViewPrincipal v) {
        super(g,v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing editar perfil listener disparado");
        Perfil p = gamaView.obterPerfilDigitado();
        gamaControler.alterarPerfil(p);
    }
    
}
