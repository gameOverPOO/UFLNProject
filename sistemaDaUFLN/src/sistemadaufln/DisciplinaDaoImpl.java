
package sistemadaufln;

import java.util.*;


public class DisciplinaDaoImpl implements DisciplinaDao{
    
    public List<Disciplina> disciplinal = new ArrayList<Disciplina>(); 
   
    
    @Override
    public void salvar(Disciplina disciplina){
        
        disciplinal.add(disciplina);
        System.out.println("size::: "+disciplinal.size());
    }

    @Override
    public void atualizar(String nomeA, String nomeB){
     
        for(int i=0;i<disciplinal.size();i++)
        {
            Disciplina d=disciplinal.get(i);
            if(d.getNome().equals(nomeB));
        }
    }
    
    
    
    @Override //mudar depois para ID
    public void deletar(String nome){
        
        for(int i=0;i<disciplinal.size();i++){
            
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nome))
                disciplinal.remove(d);
        }
        
    }
    
}
