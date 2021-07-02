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
import gamadesktop.modelo.to.Usuario;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.*;

/**
 *
 * @author andre
 */
public class UsuarioPerfilDAO extends BaseDAO{
    private String INSERT_SQL = "INSERT INTO USUARIO_PERFIL_TB(NOME, PERFIL) "
                                     + "VALUES(?,?)";
    private String DELETE_SQL   = "DELETE FROM USUARIO_PERFIL_TB WHERE NOME = ?";
    private String QUERY1_SQL   = "SELECT PERFIL FROM USUARIO_PERFIL_TB WHERE NOME = ?";
    
       
    public void insereListaPerfisUsuario(Usuario u){
        try{
            dep.log("Usuario-Perfil DAO inserindo lista de perfis do usuario "+u);  
            PreparedStatement comando = conexaoDB.prepareStatement(INSERT_SQL);
            Iterator it = u.getPerfisUauario().iterator();
            int nrIns = 0;
            while(it.hasNext()){
                Perfil p = (Perfil)it.next();
                comando.setString(1, u.getNomePessoa());
                comando.setString(2, p.getNomePerfil());           
                comando.execute();
                dep.log("Inserindo Perfil "+nrIns);
                nrIns++;
            }
            comando.close();
            dep.log("Perfis inseridos para o usuario "+u+" = "+nrIns);
        }catch(Exception e){
            dep.log("Erro inserção USUARIO: "+e);
        }
    }
    public void removeListaPerfisAssociados(Usuario u){
        try{
            dep.log("Usuario DAO removendo ligacao de perfis com o usuario "+u);   
            PreparedStatement comando = conexaoDB.prepareStatement(DELETE_SQL);
            comando.setString(1, u.getNomePessoa());           
            comando.execute();
            comando.close();
        }catch(Exception e){
            dep.log("Erro Remocao de perfis do USUARIO: "+e);
        }  
    }
    public int recuperaPerfisUsuario(ArrayList<Perfil> lista,Usuario u){
        try{
            dep.log("Usuario DAO recuperando lista de perfis do usuario: "+u ); 
            PreparedStatement comando = conexaoDB.prepareStatement(QUERY1_SQL);
            comando.setString(1, u.getNomePessoa());
            ResultSet rs = comando.executeQuery();
            int nrReg = 0;
            while(rs.next()){
                String perfil = rs.getString(0);
                Perfil p = new Perfil(perfil);
                lista.add(p);
                nrReg++;
            }
            comando.close(); 
            dep.log("Recuperados "+nrReg+ " Perfis do usuario "+u);
            return nrReg;
        }catch(Exception e){
            dep.log("Erro Recuperando LISTA de perfis de USUARIOS: "+e);
            return 0;
        }          
    }

    
    
    
}
