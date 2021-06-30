/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.dao;
import static gamadesktop.modelo.dao.BaseDAO.dep;
import gamadesktop.modelo.to.Cargo;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class CargoDAO extends BaseDAO{
    
    public void insereCargo(Cargo c){
        try{
            
        }catch(Exception e){
            dep.log("Erro inserção CARGO: "+e);
        }
    }
    public void removeCargo(Cargo c){
        try{
            
        }catch(Exception e){
            dep.log("Erro Remocao CARGO: "+e);
        }  
    }
    public void recuperaCargos(ArrayList<Cargo> lista){
        try{
            
        }catch(Exception e){
            dep.log("Erro Recuperando LISTA de CARGOS: "+e);
        }          
    }
    public void recuperaCargo(Cargo p){
        try{
            
        }catch(Exception e){
            dep.log("Erro Recuperando Cargo: "+e);
        }          
    }
    
    
}
