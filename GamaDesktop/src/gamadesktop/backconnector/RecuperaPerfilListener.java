/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import static gamadesktop.backconnector.ControlerListener.dep;
import gamadesktop.controler.GamaControler;
import gamadesktop.modelo.to.Perfil;
import gamadesktop.view.ViewPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andre
 */
public class RecuperaPerfilListener extends ControlerListener implements ActionListener{

    public RecuperaPerfilListener(GamaControler g, ViewPrincipal v) {
        super(g, v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dep.log("Conector swing Recupera perfis listener disparado");
        gamaView.limpaListaPerfis();
        ArrayList<Perfil> lista = new ArrayList<Perfil>();
        gamaControler.recuperarPerfis(lista, null);
        Iterator it = lista.iterator();
        while(it.hasNext()){
            Perfil p = (Perfil)it.next();
            gamaView.inserePerfilLista(p);
        }
    }
    
}
