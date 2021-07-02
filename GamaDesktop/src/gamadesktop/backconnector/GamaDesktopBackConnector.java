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
import gamadesktop.view.ViewPrincipal;
/**
 *
 * @author andre
 */
public class GamaDesktopBackConnector extends GamaBackConnector {

    private ViewPrincipal gamaView = null;

    public GamaDesktopBackConnector(GamaControler g,ViewPrincipal v) {
        super(g);
        dep.log("Conector de interface entre a view e o controlador sendo criado");
        gamaView = v;
    } 
    public void executar(){
        // Criar Listeners, Iniciar view principal e disparar Views
        dep.log("Criando todos os Listeners");
        /// Listeners da view de cadastro de usuarios
        InsereUsuarioListener       iul  = new InsereUsuarioListener(gamaControler,gamaView);
        AbrirEditarCargoListener   aecl  = new AbrirEditarCargoListener(gamaControler,gamaView);
        AbrirEditarPerfilListener   aepl = new AbrirEditarPerfilListener(gamaControler,gamaView);
        RecuperaUsuariosListener    rul  = new RecuperaUsuariosListener(gamaControler,gamaView);  
        RemoveUsuarioListener       rmul = new RemoveUsuarioListener(gamaControler,gamaView);
        InserePerfilUsuarioListener ipul = new InserePerfilUsuarioListener(gamaControler,gamaView);
        SelecionaUsuarioListener    sul  = new SelecionaUsuarioListener(gamaControler,gamaView);
        gamaView.adicionaListenersUsuario(iul,aecl,aepl,rul,rmul,ipul,sul);    
        /// Listeners da view de Cargos
        InsereCargoListener      icl   = new InsereCargoListener(gamaControler,gamaView);
        EditarCargoListener      ecl   = new EditarCargoListener(gamaControler,gamaView);
        RemoveCargoListener      rcl   = new RemoveCargoListener(gamaControler,gamaView);
        RecuperaCargosListener   rcsl  = new RecuperaCargosListener(gamaControler,gamaView);
        gamaView.adicionaCargoListeners(icl,ecl,rcl,rcsl);
        /// Listeners da view de Perfis
        InserePerfilListener    ipl    = new InserePerfilListener(gamaControler,gamaView);
        EditarPerfilListener    epl    = new EditarPerfilListener(gamaControler,gamaView);
        RemovePerfilListener    rpl    = new RemovePerfilListener(gamaControler,gamaView);
        RecuperaPerfilListener  rcpl   = new RecuperaPerfilListener(gamaControler,gamaView);
        gamaView.adicionaPerfilListeners(ipl,epl,rpl,rcpl);
              
        dep.log("disparando view principal de cadastro");
        gamaView.inicializar();
       
    }
    
    
}
