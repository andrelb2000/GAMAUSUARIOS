/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.dao;

import gamadesktop.Depurador;
import java.sql.*;


/**
 *
 * @author andre
 */
public class BaseDAO {
        protected static final Depurador dep = Depurador.getDepurador();
        protected static Connection conexaoDB = null;
        private   String     DB_URL = "jdbc:derby://localhost:1527/GAMADB";
        
        public BaseDAO(){
            try{
               dep.log("Fazendo inicializacao e devidas conexoes com o banco"); 
               if(conexaoDB == null){
                  conexaoDB = DriverManager.getConnection(DB_URL,"gamauser","gamauser"); 
                  dep.log("Fazendo a primeira conexao");
               }else{
                  dep.log("Conexão já foi criada"); 
               }               
            }catch(SQLException e){
               dep.log("Erro de inicializacao do banco: " + e ); 
            }
        }
 }
