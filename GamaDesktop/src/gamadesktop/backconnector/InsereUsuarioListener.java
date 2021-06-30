/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.view.UsuarioJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author andre
 */
public class InsereUsuarioListener extends ControlerListener implements ActionListener{
        private UsuarioJFrame usuarioView;

    public InsereUsuarioListener(GamaControler g,UsuarioJFrame ujf) {
        super(g);
        usuarioView = ujf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing insere usuario listener disparado");
        
    }
    
    
    
}
