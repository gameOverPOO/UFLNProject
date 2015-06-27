
package DAOs;

import POJOs.Professor;
import java.util.List;
import POJOs.Professor;


public interface ProfessorDao {
    
    
    public boolean salvar(Professor professor);
    public boolean atualizar(Professor professorA,Professor professorN);
    public boolean deletar(Professor professor);
    public void imprimirLista();
        
        
    }
    
    

