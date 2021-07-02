/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.dao;
import static gamadesktop.modelo.dao.BaseDAO.dep;
import gamadesktop.modelo.to.Cargo;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author andre
 */
public class CargoDAO extends BaseDAO{
    
    private String INSERT_SQL  = "INSERT INTO CARGO_TB(CARGO,SALARIO) "
                                     + "VALUES(?,?) ";
    private String UPDATE_SQL  = "UPDATE CARGO_TB SET SALARIO = ? WHERE CARGO = ?";
    private String DELETE_SQL  = "DELETE FROM CARGO_TB WHERE CARGO = ?";
    private String DELETE_SQL2 = "DELETE "
                               + "FROM CARGO_TB "
                               + "WHERE ? NOT IN "
                               +       "(SELECT CARGO "
                               +       " FROM USUARIOS_TB)";
    private String QUERY1_SQL  = "SELECT CARGO,SALARIO  FROM CARGO_TB";
    private String QUERY2_SQL  = "SELECT CARGO,SALARIO  FROM CARGO_TB WHERE CARGO = ?";  
    
    public void insereCargo(Cargo c){
        try{
            dep.log("Cargo DAO inserindo o Cargo " + c);
            PreparedStatement comando = conexaoDB.prepareStatement(INSERT_SQL);
            comando.setString(1, c.getNomeCargo() );              
            comando.setFloat(2, 0);
            comando.execute();
            comando.close();
        }catch(Exception e){
            dep.log("Erro inserção CARGO: "+e);
        }
    }
    public void removeCargo(Cargo c){
        try{
            dep.log("Cargo DAO removendo o Cargo "+c);     
            PreparedStatement comando = conexaoDB.prepareStatement(DELETE_SQL);
            comando.setString(1, c.getNomeCargo() );           
            comando.execute();
            comando.close();
        }catch(Exception e){
            dep.log("Erro Remocao CARGO: "+e);
        }  
    }  
    public void removeCargoSemUsuarios(){
        try{
            dep.log("Cargo DAO removendo o Cargo ");     
            Statement comando = conexaoDB.createStatement();
            comando.execute(DELETE_SQL2);
            comando.close();
        }catch(Exception e){
            dep.log("Erro Remocao de CARGOs sem usuarios: "+e);
        }  
    }   
    public int  recuperaCargos(ArrayList<Cargo> lista){
        try{
            dep.log("Cargo DAO recuperando lista de cargos do banco");
            Statement comando = conexaoDB.createStatement();
            ResultSet rs = comando.executeQuery(QUERY1_SQL);
            int nrRegistrosLidos = 0;
            while(rs.next()){
                String cargo   = rs.getString(1);
                double salario = rs.getDouble(2);
                Cargo c = new Cargo(cargo,salario);
                lista.add(c);        
                nrRegistrosLidos++;
            }
            dep.log("Enderrando leitura de Cargos - Total Registros: "+nrRegistrosLidos);
            return nrRegistrosLidos;          
        }catch(Exception e){
            dep.log("Erro Recuperando LISTA de CARGOS: "+e);
            return 0;
        }          
    }
    
    //TODO  VERSAO 2
    public void recuperaCargo(Cargo c){
        try{
            dep.log("Cargo DAO obtendo o Cargo "+ c + " do banco");
        }catch(Exception e){
            dep.log("Erro Recuperando Cargo: "+e);
        }          
    }
    
    
}
