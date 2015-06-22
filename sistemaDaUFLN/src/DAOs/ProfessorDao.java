
package DAOs;

import POJOs.Professor;
import java.util.List;
import POJOs.Professor;


public interface ProfessorDao {
    
    
    public boolean salvar(Professor professor);
    public boolean atualizar(String nomeA, String nomeN);
    public boolean deletar(String nome);
    public void imprimirLista();
        
        
    }
    
    

