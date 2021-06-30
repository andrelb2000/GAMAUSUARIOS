/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.controler;

import gamadesktop.Depurador;
import gamadesktop.modelo.to.*;
import gamadesktop.modelo.dao.CargoDAO;
import gamadesktop.modelo.dao.PerfilDAO;
import gamadesktop.modelo.dao.UsuarioDAO;
import java.util.ArrayList;

/*
 * @author andre
 */
public class GamaControler {
    private static final Depurador dep = Depurador.getDepurador();
    private CargoDAO   cargoDAO;
    private PerfilDAO  perfilDAO;
    private UsuarioDAO usuarioDAO;
    
    public void inserirCargo(Cargo c){
        cargoDAO.insereCargo(c);        
    }
    public void inserirPerfil(Perfil p){
        perfilDAO.inserePerfil(p);        
    }
    public void inserirUsuario(Usuario u){
        perfilDAO.insereListaPerfis(u.getPerfisUauario());
        cargoDAO.insereCargo(u.getCargoUsuario());
        usuarioDAO.insereUsuario(u);
    }
    public void removerCargo(Cargo c){
        cargoDAO.removeCargo(c);
    }
    public void removerPerfil(Perfil p){
        perfilDAO.removePerfil(p);
    }
    public void removerUsuario(Usuario u){
        usuarioDAO.removeUsuario(u);
        //TODO verificar cargos e perfis nao usados e remover
    }
    public void alterarCargo(Cargo c){
        
    }
    public void alterarPerfil(Perfil p){
        
    }
    public void alterarUsuario(Usuario u){

    }
    
   
    public void recuperarCargos(ArrayList<Cargo> lista,Cargo c){
        if(c==null){
            cargoDAO.recuperaCargos(lista);
        }else{
            cargoDAO.recuperaCargo(c);
        }        
    }
    public void recuperarPerfis(ArrayList<Perfil> lista,Perfil p){
        if(p==null){
            perfilDAO.recuperaPerfis(lista);
        }else{
            perfilDAO.recuperaPerfil(p);
        }
    }
    public void recuperarUsuarios(ArrayList<Usuario> lista,Usuario u){
        if(u==null){
            usuarioDAO.recuperaUsuarios(lista);
        }else{
            usuarioDAO.recuperaUsuario(u);
        }
    }
    
    
    public GamaControler() {
           dep.log("Controlador sendo criado");
           dep.log("Criando os DAOs");
           cargoDAO     = new CargoDAO() ;
           perfilDAO    = new PerfilDAO();
           usuarioDAO   = new UsuarioDAO();
           dep.log("Criando os DAOs - Observe se houve erros de conexao");
    }
    
    public void executar(){
        try{
            dep.log("Sistema inicializando");
            
            
            
            dep.log("Fim Execucao");
        }catch(Exception e){
            dep.log("Erro de inicialização da aplicação: "+e);
        }
        
    }
    
}
