package POJOs;

import java.util.*;
import POJOs.Turma;

 

public class Atividade {

      
    //Atributos
    private String nome;
    private String tipo;
    private String data;
    private Double valor;   
    public List<String> alunos = new ArrayList<>(); //Relacionamento
    
   
    //Métodos
     public Atividade(String nome, String tipo, String data, Double valor) {
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
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

    
    public double getValor() {
        return valor;
    }

   
    public void setValorAtividade(double valor) {
        this.valor = valor;
    }
    
}
