package POJOs;

import java.util.*;
import POJOs.Turma;

 

public class Atividade {

      
    //Atributos
    private String nome;
    private String tipo;
    private String data;
    private Double valor;   
    private List<Aluno> alunos = new ArrayList<>(); //Relacionamento

    public Double getValor() {
        return valor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
    
   
    //Métodos
     public Atividade(String nome, String tipo, String data, Double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
    }

    public Atividade() {
        
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getTipo() {
        return tipo;
    }

   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getData() {
        return data;
    }

   
    public void setData(String data) {
        this.data = data;
    }

    
    public void setValorAtividade(double valor) {
        this.valor = valor;
    }
    
}
