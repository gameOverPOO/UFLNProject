/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

/**
 *
 * @author Natália
 */
public class Aluno {

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private String nomeAluno;
    private String cpf;


public Aluno(String nomeAluno, String cpf) {
    this.nomeAluno = nomeAluno;
    this.cpf=cpf;
}




}