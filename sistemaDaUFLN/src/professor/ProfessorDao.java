
package professor;

import professor.Professor;
import java.util.List;


public interface ProfessorDao {
    
    
    public void salvar(Professor professor);
    public void atualizar(String nomeA, String nomeN);
    public void deletar(String nome);
    public void imprimirLista();
        
        
    }
    
    

