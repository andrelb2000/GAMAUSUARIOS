/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop;

/**
 *
 * @author andre
 */
public final class Depurador {
    private static Depurador instancia = null;
    private static final boolean ligado = true;
    private static int debugLine = 0;
    public static Depurador getDepurador(){
        if(instancia == null){
            instancia = new Depurador();
        }
        return instancia;
    }
    
    public void log(String s){
        if(ligado){
            String lineCode = String.format("%4d - ",debugLine++);
            System.out.println(lineCode + s);
        }
    }
}
