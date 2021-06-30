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
    private ArrayList<Perfil> perfilUauario = null;

    public Usuario(String nomePessoa, String cpfPessoa, 
                    Date dataNascimento, String sexoPessoa,
                    Cargo cargo) {
        super(nomePessoa, cpfPessoa, dataNascimento, sexoPessoa);
        cargoUsuario = cargo;
        perfilUauario = new ArrayList<Perfil>();
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
    
}
