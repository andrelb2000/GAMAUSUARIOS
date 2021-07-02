/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop;

import gamadesktop.controler.GamaControler;
import gamadesktop.backconnector.GamaDesktopBackConnector;
import gamadesktop.view.ViewPrincipal;

/**
 *
 * @author andre
 */
public class GamaDesktop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ponto de entrada de sistema para módulo controlador
       GamaControler gamaControler   = new GamaControler();
       ViewPrincipal gamaView        = new ViewPrincipal();
       GamaDesktopBackConnector gdbc = new GamaDesktopBackConnector(gamaControler,gamaView);
       gdbc.executar();
    }
    
}
