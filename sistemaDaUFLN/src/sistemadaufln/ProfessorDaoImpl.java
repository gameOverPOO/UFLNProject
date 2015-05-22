
package sistemadaufln;

import java.util.*;


public class ProfessorDaoImpl implements ProfessorDao{
    
    
    public List<Professor> professorl = new ArrayList<>(); //A lista de todos está publica...
                                                           //CORRIGIR
    
    //CRUD
    @Override
    public void salvar(Professor professor){
        
        for(int i=0;i<professorl.size();i++){
            Professor p = professorl.get(i);
            if(p.getCpf().equals(professor.getCpf())){
                System.out.println("Professor ja existente:");
                return ;
            }
        }
        
        professorl.add(professor);
        System.out.println("size::: "+professorl.size());
        
    }
    
    
    @Override
    public void atualizar(String nomeA, String nomeN){
        
        for (Iterator<Professor> it = professorl.iterator(); it.hasNext();) {
            Professor p = it.next();
            if(p.getNome().equals(nomeA)) p.setNome(nomeN);
        }       
    }
   
    
    @Override
    public void deletar(String nome){
        
        for(int i = 0; i < professorl.size(); i++){
          Professor p = professorl.get(i);
          if(p.getNome().equals(nome)) 
              professorl.remove(p);
        }
        
    }
    
    
    @Override
    public void imprimirLista() {
        for (Professor s:professorl)
                        System.out.println("Professor: " + s.getNome() + " CPF: " + s. getCpf());  
    }
                  
    
    
    
}
