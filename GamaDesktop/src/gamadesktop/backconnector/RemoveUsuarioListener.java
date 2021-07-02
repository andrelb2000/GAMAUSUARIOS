/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import static gamadesktop.backconnector.ControlerListener.dep;
import gamadesktop.controler.GamaControler;
import gamadesktop.modelo.to.Usuario;
import gamadesktop.view.ViewPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andre
 */
public class RemoveUsuarioListener extends ControlerListener implements ActionListener{

    public RemoveUsuarioListener(GamaControler g, ViewPrincipal v) {
        super(g, v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing remove usuario listener disparado");
        Usuario u = gamaView.obterUsuarioDigitado();
        gamaControler.removerUsuario(u);       
        gamaView.limpaListaUsuarios();
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        gamaControler.recuperarUsuarios(lista, null);
        Iterator it = lista.iterator();
        while(it.hasNext()){
            u = (Usuario)it.next();
            dep.log("Recuperando usuario "+u+ " do banco e inserindo no painel");
            gamaView.insereUsuarioLista(u);
        }          
        
    }   
}
