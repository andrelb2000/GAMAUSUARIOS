/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.dao;

import static gamadesktop.modelo.dao.BaseDAO.dep;
import gamadesktop.modelo.to.Cargo;
import gamadesktop.modelo.to.Usuario;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class UsuarioDAO extends BaseDAO{
    
    
    public void insereUsuario(Usuario u){
        try{
            
        }catch(Exception e){
            dep.log("Erro inserção USUARIO: "+e);
        }
    }
    public void removeUsuario(Usuario u){
        try{
            
        }catch(Exception e){
            dep.log("Erro Remocao USUARIO: "+e);
        }  
    }
    public void recuperaUsuarios(ArrayList<Usuario> lista){
        try{
            
        }catch(Exception e){
            dep.log("Erro Recuperando LISTA de USUARIOS: "+e);
        }          
    }
    public void recuperaUsuario(Usuario p){
        try{
            
        }catch(Exception e){
            dep.log("Erro Recuperando USUARIO: "+e);
        }          
    }
    
    
}
