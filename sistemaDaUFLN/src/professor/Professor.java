
package professor;
import disciplina.Disciplina;
import java.util.*;

public class Professor {
    
    
    /* Consultar o numero de disciplinas ja lecionadas por um determinado professor.*/
    //CRIAR HISTORICO DO PROFESSOR E SALVAR NUM ARQUIVO, MAS NAO UM P CADA PROFESSOR
    //ACHO QUE FACILITA UM ARQUIVO PARA CADA CLASSE
    
    

    //Atributos
    private String nome;
    private String cpf;
    private String departamento;
    public List<Integer> codigoTurma = new ArrayList<>();
    public List<Disciplina> disciplinas = new ArrayList<>();

    public Professor() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
