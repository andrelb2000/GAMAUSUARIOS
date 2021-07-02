/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.view;

import gamadesktop.Depurador;
import gamadesktop.backconnector.AbrirEditarCargoListener;
import gamadesktop.backconnector.AbrirEditarPerfilListener;
import gamadesktop.backconnector.EditarCargoListener;
import gamadesktop.backconnector.EditarPerfilListener;
import gamadesktop.backconnector.InsereCargoListener;
import gamadesktop.backconnector.InserePerfilListener;
import gamadesktop.backconnector.InsereUsuarioListener;
import gamadesktop.backconnector.InserePerfilUsuarioListener;
import gamadesktop.backconnector.RemoveCargoListener;
import gamadesktop.backconnector.RecuperaCargosListener;
import gamadesktop.backconnector.RemovePerfilListener;
import gamadesktop.backconnector.RemoveUsuarioListener;
import gamadesktop.backconnector.RecuperaUsuariosListener;  
import gamadesktop.backconnector.RecuperaPerfilListener;
import gamadesktop.backconnector.SelecionaUsuarioListener;
import gamadesktop.modelo.to.Cargo;
import gamadesktop.modelo.to.Perfil;
import gamadesktop.modelo.to.Usuario;

/**
 *
 * @author andre
 */
public class ViewPrincipal {
    
        private static final Depurador dep = Depurador.getDepurador();
        private CargoJFrame   cargoView;
        private PerfilJFrame  perfilView;    
        private UsuarioJFrame usuarioView;

        public ViewPrincipal() {
            cargoView   = new CargoJFrame();
            perfilView  = new PerfilJFrame();    
            usuarioView = new UsuarioJFrame();
            dep.log("Views criadas ainda nao abertas");          
        }
        public void adicionaListenersUsuario(InsereUsuarioListener iul,
                                             AbrirEditarCargoListener aecl,
                                             AbrirEditarPerfilListener aepl,
                                             RecuperaUsuariosListener rul,
                                             RemoveUsuarioListener rmul,
                                             InserePerfilUsuarioListener ipul,
                                             SelecionaUsuarioListener sul
        ){
            usuarioView.adicionaInsereUsuarioListener(iul);
            usuarioView.adicionaAbreEditarCargoListener(aecl);
            usuarioView.adicionaAbreEditarPerfilListener(aepl); 
            usuarioView.adicionaRecuperaUsuariosListener(rul);                 
            usuarioView.adicionaRemoveUsuariolListener(rmul);
            usuarioView.adiicionaInserePerfilUsuarioListener(ipul);
            usuarioView.adicionaSelecionaUsuaarioListener(sul);
        }
        public void adicionaCargoListeners( InsereCargoListener      icl,
                                            EditarCargoListener      ecl,
                                            RemoveCargoListener      rcl,
                                            RecuperaCargosListener   rcsl
                                            ){
            cargoView.adicionaInsereCargoListener(icl);
            cargoView.adicionaEditarCargoListener(ecl);
            cargoView.adicionaRemoveCargoListener(rcl);
            cargoView.acidionaRecupararCargosListener(rcsl);
            
        }
        public void adicionaPerfilListeners(InserePerfilListener    ipl,
                                            EditarPerfilListener    epl,        
                                            RemovePerfilListener    rpl,
                                            RecuperaPerfilListener  rcpl){     
            perfilView.adicionaInserePerfilListener(ipl);
            perfilView.adicionaEditarPerfilListener(epl);
            perfilView.adicionaRemovePerfilListener(rpl);
            perfilView.acidionaRecupararPerfisListener(rcpl);
        }
        public void inicializar(){
            usuarioView.setVisible(true);
        }
        
        // Redirecionamento de Views de PERFIL
        public void disparaPerfilView(){
            perfilView.setVisible(true);
        }
        public Perfil obterPerfilDigitado(){
            return perfilView.obterPerfilDigitado();
        }    
        public void inserePerfilLista(Perfil p){
            perfilView.inserePerfilLista(p);
        }
        public void limpaListaPerfis(){
            perfilView.limpaListaPerfis();
        }
        
        // Redirecionamento de Views de CARGOS
        public void disparaCargoView(){
            cargoView.setVisible(true);
        }
        public Cargo obterCargoDigitado(){
            return cargoView.obterCargoDigitado();
        }
        public void limpaListaCargos(){
            cargoView.limpaCargoLista();
        }
        public void insereCargoLista(Cargo c){
            cargoView.insereCargoLista(c);
        }
              
        // Redirecionamento de Views de Usuário
       public Usuario obterUsuarioDigitado(){
           return usuarioView.obterUsuarioDigitado();
       }
       public Perfil obterPerfilInserirUsuario(){
           return usuarioView.obterPerfilASerInseridoUsuario();           
       }
       public void insereNovoPerfilUsuario(Perfil p){
           usuarioView.insereListaPerfisUsuario(p);
       }
       
       public void limpaListaUsuarios(){
           usuarioView.limpaListaUsuarios();           
       }
       public void insereUsuarioLista(Usuario u){
           usuarioView.insereUsuarioLista(u);
       }
       public void insereNovoUsuarioLista(Usuario u){
           usuarioView.insereNovoUsuarioLista(u);
       }
       public void mostraUsuarioSelecionado(){
           usuarioView.colocaUsuarioSelecionado();
       }
    
    
}
