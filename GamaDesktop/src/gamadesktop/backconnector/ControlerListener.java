/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;
import gamadesktop.Depurador;
import gamadesktop.controler.GamaControler;
import gamadesktop.view.ViewPrincipal;

/**
 *
 * @author andre
 */
public class ControlerListener {
    protected static final Depurador dep = Depurador.getDepurador();
    protected GamaControler gamaControler = null;
    protected ViewPrincipal gamaView = null;


    public ControlerListener(GamaControler g,ViewPrincipal v) {
        gamaControler = g;
        gamaView = v;
    } 
}
