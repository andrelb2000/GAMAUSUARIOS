/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.backconnector;

import gamadesktop.Depurador;
import gamadesktop.controler.GamaControler;
import gamadesktop.view.CargoJFrame;
import gamadesktop.view.PerfilJFrame;
import gamadesktop.view.UsuarioJFrame;
/**
 *
 * @author andre
 */
public class GamaDesktopBackConnector {
    private GamaControler gamaControler = null;
    private static final Depurador dep = Depurador.getDepurador();
    private CargoJFrame   cargoView;
    private PerfilJFrame  perfilView;    
    private UsuarioJFrame usuarioView;


    public GamaDesktopBackConnector(GamaControler g) {
        dep.log("Conector de interface entre a view e o controlador sendo criado");
        gamaControler = g;
        cargoView   = new CargoJFrame();
        perfilView  = new PerfilJFrame();    
        usuarioView = new UsuarioJFrame();
        dep.log("Views criadas ainda nao abertas");
    } 
    public void executar(){
        //TODO Criar Listeners, Iniciar view principal e disparar Views
        dep.log("Criando todos os Listeners");
        /// Listeners da view de cadastro de usuarios
        InsereUsuarioListener     iul  = new InsereUsuarioListener(gamaControler,usuarioView);
               
        /// Listeners da view de Cargos
        AbrirEditarCargoListener aecl  = new AbrirEditarCargoListener(gamaControler,cargoView);
        InsereCargoListener      icl   = new InsereCargoListener(gamaControler,cargoView);
        EditarCargoListener      ecl   = new EditarCargoListener(gamaControler,cargoView);
        RemoveCargoListener      rcl   = new RemoveCargoListener(gamaControler,cargoView);
        
        /// Listeners da view de Perfis
        AbrirEditarPerfilListener aepl = new AbrirEditarPerfilListener(gamaControler,perfilView);
        InserePerfilListener    ipl    = new InserePerfilListener(gamaControler,perfilView);
        EditarPerfilListener    epl    = new EditarPerfilListener(gamaControler,perfilView);
        RemovePerfilListener    rpl    = new RemovePerfilListener(gamaControler,perfilView);
       
        dep.log("disparando view principal de cadastro");
        
        
        
        
        
        
    }
    
    
}
