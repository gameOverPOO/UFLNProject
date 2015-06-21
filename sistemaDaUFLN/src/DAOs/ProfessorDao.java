
package DAOs;

import POJOs.Professor;
import java.util.List;
import POJOs.Professor;


public interface ProfessorDao {
    
    
    public void salvar(Professor professor);
    public void atualizar(String nomeA, String nomeN);
    public void deletar(String nome);
    public void imprimirLista();
        
        
    }
    
    

