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
public class Cargo {
    private String nomeCargo;
    private double salarioCargo;

    public Cargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }
    public Cargo(String nomeCargo,double s) {
        this.nomeCargo = nomeCargo;
        this.salarioCargo = s;
    }
    public String getNomeCargo() {
        return nomeCargo;
    }

    @Override
    public String toString() {
        return nomeCargo;
    }
    
    
    
}
