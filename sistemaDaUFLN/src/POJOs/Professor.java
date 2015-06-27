
package POJOs;
import java.util.*;


public class Professor {
    
   
    //Atributos
    private String nome;
    private String cpf;
    private String departamento;
    private List<Turma> turmas = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Professor() {
    }

    
    //Métodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Professor(String nome, String cpf, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
    }

}
