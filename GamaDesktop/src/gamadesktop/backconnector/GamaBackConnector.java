/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.Depurador;
import gamadesktop.controler.GamaControler;


/**
 *
 * @author andre
 */
public class GamaBackConnector{
    
    protected static final Depurador dep = Depurador.getDepurador();
    protected GamaControler gamaControler = null;

    public GamaBackConnector(GamaControler g) {
        gamaControler = g;
    }    
}
