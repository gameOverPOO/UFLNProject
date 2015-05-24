package disciplina;


import java.util.*;

/*Consultar o numero de turmas ja oferecidas (historicamente) para uma determinada disciplina;*/ 
//Ter que implementar o historico de turmas

public class Disciplina {
   //Atributos
   private String nome;
   private String ementa;
   private int cargaHoraria;
   public List<Integer> turmas = new ArrayList<>();
   public static List<String> professoresCpf = new ArrayList<>();

    public Disciplina() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
