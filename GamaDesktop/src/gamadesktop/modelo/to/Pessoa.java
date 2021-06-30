/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamadesktop.modelo.to;

import java.util.Date;

/**
 * Classe base pessoa
 * @author andre
 * 
 */
public abstract class Pessoa {
    
    protected String nomePessoa;
    protected String cpfPessoa;
    protected Date   dataNascimento;
    protected String sexoPessoa;

    public Pessoa(String nomePessoa, String cpfPessoa, Date dataNascimento, String sexoPessoa) {
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.dataNascimento = dataNascimento;
        this.sexoPessoa = sexoPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getSexoPessoa() {
        return sexoPessoa;
    }
        

    
}
