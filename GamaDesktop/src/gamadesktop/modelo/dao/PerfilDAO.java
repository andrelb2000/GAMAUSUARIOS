/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.dao;

import static gamadesktop.modelo.dao.BaseDAO.dep;
import gamadesktop.modelo.to.Perfil;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class PerfilDAO extends BaseDAO{
    public void inserePerfil(Perfil p){
        try{
            
        }catch(Exception e){
            dep.log("Erro inserção PERFIL: "+e);
        }
    }
    public void insereListaPerfis(ArrayList<Perfil> lista){
        try{
            
        }catch(Exception e){
            dep.log("Erro inserção de LISTA de PERFIS: "+e);
        }
    }
    public void removePerfil(Perfil p){
        try{
            
        }catch(Exception e){
            dep.log("Erro Remocao PERFIL: "+e);
        }  
    }
    public void recuperaPerfis(ArrayList<Perfil> lista){
        try{
            
        }catch(Exception e){
            dep.log("Erro Recuperando LISTA de PERFIS: "+e);
        }          
    }
    public void recuperaPerfil(Perfil p){
        try{
            
        }catch(Exception e){
            dep.log("Erro Recuperando Perfil: "+e);
        }          
    }
    
}
