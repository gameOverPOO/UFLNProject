
package aluno;

import aluno.AlunoDao;
import aluno.Aluno;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


 
public class AlunoDaoImpl implements AlunoDao{
   
    
    public static List<Aluno> alunosl = new ArrayList<Aluno>(); 
    
    @Override
    public void salvar(Aluno aluno) {
       
        for(int i=0;i<alunosl.size();i++){
            Aluno a = alunosl.get(i);
            if(a.getCpf().equals(aluno.getCpf())){
                System.out.println("Aluno ja existente:");
                return ;
            }
            
        }
        
        alunosl.add(aluno);
        System.out.println("size::: "+alunosl.size());
        
        
    }

    @Override
    public void atualizar(String nomeA, String nomeN, int opcaoDeAtualizacao) {
     
        if(opcaoDeAtualizacao==1){
            for (Iterator<Aluno> it = alunosl.iterator(); it.hasNext();) {
                Aluno p = it.next();
                if(p.getNome().equals(nomeA)) p.setNome(nomeN);
            }
        }
        else{
            for (Iterator<Aluno> it = alunosl.iterator(); it.hasNext();) {
                Aluno p = it.next();
                
                if(p.getCpf().equals(nomeA)){                    
                    p.setCpf(nomeN);
                }
            }
        }
        
       this.imprimirLista();         
                
    }

    @Override
    public void deletar(String nome) {
        for(int i = 0; i < alunosl.size(); i++){
          Aluno p = alunosl.get(i);
          if(p.getNome().equals(nome)) alunosl.remove(p);
        }
         this.imprimirLista();  
          
    }
    
    @Override
    public void imprimir(Aluno aluno)
    {
    
    }

    @Override
    public void imprimirLista() {
        for (Aluno s:alunosl)
                        System.out.println("Aluno: " + s.getNome() + " CPF: " + s. getCpf());  
                  
                
        
    }
 
    
}

    

