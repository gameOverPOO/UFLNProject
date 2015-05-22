/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import java.util.*;

/**
 *
 * @author leandronog
 */
public class ProfessorDaoImpl implements ProfessorDao{
    
    
    public List<Professor> professorl = new ArrayList<>();
    
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
    public Object getById(int id){
        return null;
    }
    
    @Override
    public List<Object> getAll(){
        return null;
    }
    
    
    
}
