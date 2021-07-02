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
import java.sql.*;

/**
 *
 * @author andre
 */
public class UsuarioDAO extends BaseDAO{   
    private String INSERT_SQL = "INSERT INTO USUARIO_TB(NOME,CPF,NASCIMENTO,SEXO,CARGO) "
                                     + "VALUES(?,?,?,?,?)";
    private String UPDATE_SQL = "UPDATE USUARIO_TB "
            + "                         SET CPF = ?, "
            + "                             NASCIMENTO = ?, "
            + "                             SEXO = ?, "
            + "                             CARGO = ?"
                            + " WHERE NOME = ?";
    private String DELETE_SQL = "DELETE FROM USUARIO_TB WHERE NOME = ?";
    private String QUERY1_SQL = "SELECT NOME,CPF,NASCIMENTO,SEXO,CARGO,CADASTRO FROM USUARIO_TB";
    private String QUERY2_SQL = "SELECT NOME,CPF,NASCIMENTO,SEXO,CARGO FROM USUARIO_TB WHERE NOME = ?";
     
    
    public void insereUsuario(Usuario u){
        try{
            dep.log("Usuario DAO inserindo usuario "+u);  
            PreparedStatement comando = conexaoDB.prepareStatement(INSERT_SQL);
            comando.setString(1, u.getNomePessoa());              
            comando.setString(2, u.getCpfPessoa());
            comando.setString(3,u.getDataNascimento());
            comando.setString(4, u.getSexoPessoa());
            comando.setString(5, u.getCargoUsuario().getNomeCargo());
            comando.execute();
            comando.close();
            dep.log("Abrindo DAO externo para inserção da associaco Perfil - Usuario");
            UsuarioPerfilDAO perfisDAO = new UsuarioPerfilDAO();
            perfisDAO.insereListaPerfisUsuario(u);

        }catch(Exception e){
            dep.log("Erro inserção USUARIO: "+e);
        }
    }
    public void removeUsuario(Usuario u){
        try{
            dep.log("Usuario DAO removendo usuario "+u);   
            PreparedStatement comando = conexaoDB.prepareStatement(DELETE_SQL);
            comando.setString(1, u.getNomePessoa());           
            comando.execute();
            comando.close();                 
        }catch(Exception e){
            dep.log("Erro Remocao USUARIO: "+e);
        }  
    }
    public int recuperaUsuarios(ArrayList<Usuario> lista){
        try{
            dep.log("Usuario DAO recuperando lista de usuarios "); 
            
            Statement comando = conexaoDB.createStatement();
            ResultSet rs = comando.executeQuery(QUERY1_SQL);
            int nrRegistrosLidos = 0;
            while(rs.next()){
                String nome   = rs.getString(1);
                String cpf    = rs.getString(2);
                String nasc   = rs.getString(3);
                String sexo   = rs.getString(4);
                String cargo  = rs.getString(5);
                Date   cad    = rs.getDate(6);
                Usuario u = new Usuario(nome, cpf, nasc, sexo, new Cargo(cargo),cad);
                lista.add(u);        
                nrRegistrosLidos++;
            }
            dep.log("Enderrando leitura de Usuarios - Total Registros: "+nrRegistrosLidos);
            return nrRegistrosLidos;          
        }catch(Exception e){
            dep.log("Erro Recuperando LISTA de USUARIOS: "+e);
            return(0);
        }          
    }
    public void recuperaUsuario(Usuario u){
        try{
            dep.log("Usuario DAO recuperando usuario "+u);  
        }catch(Exception e){
            dep.log("Erro Recuperando USUARIO: "+e);
        }          
    }
    
    
}
