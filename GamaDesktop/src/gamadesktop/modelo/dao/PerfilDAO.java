/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.dao;

import static gamadesktop.modelo.dao.BaseDAO.conexaoDB;
import static gamadesktop.modelo.dao.BaseDAO.dep;
import gamadesktop.modelo.to.Cargo;
import gamadesktop.modelo.to.Perfil;
import java.util.ArrayList;
import java.sql.*;
import java.util.Iterator;

/**
 *
 * @author andre
 */
public class PerfilDAO extends BaseDAO{
    private String INSERT_SQL = "INSERT INTO PERFIL_TB(PERFIL,NIVEL) "
                                     + "VALUES(?,?) ";
    private String UPDATE_SQL  = "UPDATE PERFIL_TB SET NIVEL = ? WHERE PERFIL = ?";
    private String DELETE_SQL  = "DELETE FROM PERFIL_TB WHERE PERFIL = ?";
    private String DELETE_SQL2 = "DELETE "
                               + "FROM PERFIL_TB a "
                               + "WHERE a.PERFIL NOT IN "
                               +       "(SELECT b.PERFIL "
                                       + "FROM USUARIO_PERFIL_TB b)";  
    private String QUERY1_SQL = "SELECT PERFIL,NIVEL  FROM PERFIL_TB";
    private String QUERY2_SQL = "SELECT PERFIL,NIVEL  FROM PERFIL_TB WHERE PERFIL = ?";
        
    public void inserePerfil(Perfil p){
        try{
            dep.log("Perfil DAO inserindo o objeto "+p);
            PreparedStatement comando = conexaoDB.prepareStatement(INSERT_SQL);
            comando.setString(1, p.getNomePerfil());
            comando.setInt(2, 0);
            comando.execute();
            comando.close();
        }catch(Exception e){
            dep.log("Erro inserção PERFIL: "+e);
        }
    }
    public void insereListaPerfis(ArrayList<Perfil> lista){
        try{
            dep.log("Perfil DAO inserindo lista de perfis "); 
            PreparedStatement comando = conexaoDB.prepareStatement(INSERT_SQL);
            Iterator it = lista.iterator();
            int nrIns = 0;
            while(it.hasNext()){
                Perfil p = (Perfil)it.next();
                comando.setString(1, p.getNomePerfil());
                comando.setInt(2, 0);           
                comando.execute();
                nrIns++;
            }
            comando.close();
            dep.log("Perfis inseridos: " + nrIns);    
            
        }catch(Exception e){
            dep.log("Erro inserção de LISTA de PERFIS: "+e);
        }
    }
    public void removePerfil(Perfil p){
        try{
            dep.log("Perfil DAO removendo o objeto "+p); 
            PreparedStatement comando = conexaoDB.prepareStatement(DELETE_SQL);
            comando.setString(1, p.getNomePerfil());           
            comando.execute();
            comando.close();
        }catch(Exception e){
            dep.log("Erro Remocao PERFIL: "+e);
        }  
    }
    public void removePerfisSemUsuarios(){
        try{
            dep.log("Perfil DAO removendo perfis sem usuarios: "); 
            Statement comando = conexaoDB.createStatement();                       
            comando.execute(DELETE_SQL2);
            comando.close();           
        }catch(Exception e){
            dep.log("Erro Remocao PERFIL: "+e);
        }  
    }  
    public int recuperaPerfis(ArrayList<Perfil> lista){
        try{
            dep.log("Perfil DAO obtendo lista de perfis "); 
            Statement comando = conexaoDB.createStatement();
            ResultSet rs = comando.executeQuery(QUERY1_SQL);
            int nrRegistrosLidos = 0;
            while(rs.next()){
                String perfil = rs.getString(0);
                int    nivel  = rs.getInt(1);
                Perfil      p = new Perfil(perfil,nivel);
                lista.add(p);        
                nrRegistrosLidos++;
            }
            dep.log("Encerrando leitura de Perfis - Total Registros: "+nrRegistrosLidos);
            return nrRegistrosLidos;   
        }catch(Exception e){
            dep.log("Erro Recuperando LISTA de PERFIS: "+e);
            return 0;
        }          
    }
    /// Versao 2
    public void recuperaPerfil(Perfil p){
        try{
            dep.log("Perfil DAO recupernando o objeto "+p);
        }catch(Exception e){
            dep.log("Erro Recuperando Perfil: "+e);
        }          
    }
    
}
