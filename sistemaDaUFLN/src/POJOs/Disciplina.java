package POJOs;


import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Disciplina {
   //Atributos
   @Id
   private int id;
   private String nome;
   private String ementa;
   private int cargaHoraria;
   @OneToMany
   private List<Turma> turmas = new ArrayList<>();
   @OneToMany
   private List<Professor> professores = new ArrayList<>();

    public Disciplina() {
        
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }
  
     
   //Métodos
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmenta() {
        return ementa;
    }

    
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

   
    public int getCargaHorariaDisciplina() {
        return cargaHoraria;
    }

    
    public void setCargaHorariaDisciplina(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public Disciplina(String nome, String ementa, int cargaHoraria){
        
            this.nome = nome;
            this.ementa=ementa;
            this.cargaHoraria = cargaHoraria;
    }
}
