/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop;

import gamadesktop.controler.GamaControler;
import gamadesktop.backconnector.GamaDesktopBackConnector;

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
       GamaControler gama = new GamaControler();
       GamaDesktopBackConnector gdbc = new GamaDesktopBackConnector(gama);
       gdbc.executar();
    }
    
}
