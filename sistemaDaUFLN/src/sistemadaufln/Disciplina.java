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
 
 //CRIAR CONSTRUTOR (DEPENDENDO DAS CONDIÇÕES IMPOSTAS NO DIGRAMA) 
 
public class Disciplina {
    private String nomeDisciplina;
   private String ementa;
   private int cargaHorariaDisciplina;

  
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

   
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    
    public String getEmenta() {
        return ementa;
    }

    
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

   
    public int getCargaHorariaDisciplina() {
        return cargaHorariaDisciplina;
    }

    
    public void setCargaHorariaDisciplina(int cargaHorariaDisciplina) {
        this.cargaHorariaDisciplina = cargaHorariaDisciplina;
    }
}
