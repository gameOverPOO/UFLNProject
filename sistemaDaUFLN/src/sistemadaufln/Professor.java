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
public class Professor {
    private String nomeProfessor;
    private String cpfProfessor;
    private String departamentoProfessor;

    public Professor(String nomeProfessor, String cpfProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.cpfProfessor = cpfProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    } 

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getCpfProfessor() {
        return cpfProfessor;
    }

    public String getDepartamentoProfessor() {
        return departamentoProfessor;
    }

    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

    public void setDepartamentoProfessor(String departamentoProfessor) {
        this.departamentoProfessor = departamentoProfessor;
    }

    public Professor(String nomeProfessor, String cpfProfessor, String departamentoProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.cpfProfessor = cpfProfessor;
        this.departamentoProfessor = departamentoProfessor;
    }
    
    

   
    
    

   
}
