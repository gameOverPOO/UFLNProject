
package sistemadaufln;
import java.util.*;


/**
 *
 * @author Natália
 */
 
 /*CRIAR CLASSES ATIVIDADEVIEW, ATIVIDADEADO E ATIVIDADEDAO IMPL*/
 
 
 
public class Atividade {

      
    //Atributos
    private String nomeAtividade;
    private String tipoAtividade;
    private Date dataAtividade;
    private double valorAtividade;   
    public List<Aluno> alunos = new ArrayList<>(); //Relacionamento

    
   
    //Métodos
     public Atividade(String nomeAtividade, String tipoAtividade, Date dataAtividade, double valorAtividade) {
        this.nomeAtividade = nomeAtividade;
        this.tipoAtividade = tipoAtividade;
        this.dataAtividade = dataAtividade;
        this.valorAtividade = valorAtividade;
    }
    public String getNomeAtividade() {
        return nomeAtividade;
    }

   
    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

   
    public String getTipoAtividade() {
        return tipoAtividade;
    }

   
    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    
    public Date getDataAtividade() {
        return dataAtividade;
    }

   
    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    
    public double getValorAtividade() {
        return valorAtividade;
    }

   
    public void setValorAtividade(double valorAtividade) {
        this.valorAtividade = valorAtividade;
    }
    
}
