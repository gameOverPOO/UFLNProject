package POJOs;

import java.util.*;
import POJOs.Turma;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

 
@Entity
public class Atividade {

      
    //Atributos
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String tipo;
    private String data;
    private Double valor;  
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Aluno> alunos = new ArrayList<>(); //Relacionamento

    public Double getValor() {
        return valor;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
}
