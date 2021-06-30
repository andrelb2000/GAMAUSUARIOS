/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.controler.GamaControler;
import gamadesktop.view.PerfilJFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */
public class AbrirEditarPerfilListener extends ControlerListener implements ActionListener{
    private PerfilJFrame  perfilView;   
    public AbrirEditarPerfilListener(GamaControler g,PerfilJFrame pjf) {
        super(g);
        perfilView = pjf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing abrir nova janela para editar perfil listener disparado");
    }
    
}
