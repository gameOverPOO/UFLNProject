
package DAOsImpl;

import DAOs.ProfessorDao;
import POJOs.Professor;
import java.util.*;
import POJOs.Professor;


public class ProfessorDaoImpl implements ProfessorDao{
    
    

                                                           
    
    //CRUD
    @Override
    public boolean salvar(Professor professor){
        
        
        return true;
        
    }
    
    
    @Override
    public boolean atualizar(Professor professorA,Professor professorN){
        
       
        return false;
    }
   
    
    @Override
    public boolean deletar(Professor professor){
        
       
        return false;
        
    }
    
    
    @Override
    public void imprimirLista() {
       
    }
                  
    
    
    
}
