package sistemadaufln;

import java.util.*;

 

public class Atividade {

      
    //Atributos
    private String nome;
    private String tipo;
    private Date data;
    private double valor;   
    public List<Aluno> alunos = new ArrayList<>(); //Relacionamento
    private Turma turma;
    
   
    //Métodos
     public Atividade(String nome, String tipo, Date data, double valor, Turma turma) {
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.valor = valor;
        this.turma = turma;
    }
    public String getNome() {
        return nome;
    }

   
    public void setNomee(String nome) {
        this.nome = nome;
    }

   
    public String getTipo() {
        return tipo;
    }

   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public Date getData() {
        return data;
    }

   
    public void setData(Date data) {
        this.data = data;
    }

    
    public double getValor() {
        return valor;
    }

   
    public void setValorAtividade(double valor) {
        this.valor = valor;
    }
    
}
