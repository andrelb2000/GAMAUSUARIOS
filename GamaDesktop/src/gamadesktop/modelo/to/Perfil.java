/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.to;

/**
 *
 * @author andre
 */
public class Perfil {
    private String nomePerfil;
    private int nivelPerfil;

    public Perfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }
    public Perfil(String nomePerfil,int n) {
        this.nomePerfil = nomePerfil;
        nivelPerfil = n;
    }
    
    public String getNomePerfil() {
        return nomePerfil;
    }

    @Override
    public String toString() {
        return nomePerfil ;
    }
    
    
}
