package disciplina;


import java.util.*;



public class Disciplina {
   //Atributos
   private String nome;
   private String ementa;
   private int cargaHoraria;
   public static List<Integer> turmas = new ArrayList<>();
   public static List<String> professoresCpf = new ArrayList<>();

    public Disciplina() {
        
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
