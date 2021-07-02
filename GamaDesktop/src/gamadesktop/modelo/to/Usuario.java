/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.to;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author andre
 */
public class Usuario extends Pessoa{
    private Cargo cargoUsuario = null;
    private Date  cadastroUsuario = new Date(2000, 1, 1);
    private ArrayList<Perfil> perfilUauario = null;

    public Usuario(String nomePessoa, String cpfPessoa, 
                    String dataNascimento, String sexoPessoa,
                    Cargo cargo) {
        super(nomePessoa, cpfPessoa, dataNascimento, sexoPessoa);
        cargoUsuario = cargo;
        perfilUauario = new ArrayList<Perfil>();
    }
    public Usuario(String nomePessoa, String cpfPessoa, 
                    String dataNascimento, String sexoPessoa,
                    Cargo cargo,Date cad) {
        super(nomePessoa, cpfPessoa, dataNascimento, sexoPessoa);
        cargoUsuario = cargo;
        perfilUauario = new ArrayList<Perfil>();
        cadastroUsuario = cad;
    }
    public void addPerfil(Perfil p){
        perfilUauario.add(p);
    }

    public Cargo getCargoUsuario() {
        return cargoUsuario;
    }

    public ArrayList<Perfil> getPerfisUauario() {
        return perfilUauario;
    }

    @Override
    public String toString() {
        
        
        return (nomePessoa + " | " 
             + cpfPessoa + " | "
             + dataNascimento +" | "
             + sexoPessoa + " | "  
             + cargoUsuario + " | "  
             + cadastroUsuario   ) ;
    }

    public Date getCadastroUsuario() {
        return cadastroUsuario;
    }

    public void setCadastroUsuario(Date cadastroUsuario) {
        this.cadastroUsuario = cadastroUsuario;
    }
    
}
