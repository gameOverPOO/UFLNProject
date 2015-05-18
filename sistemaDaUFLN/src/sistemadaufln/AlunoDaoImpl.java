
package sistemadaufln;

import java.util.*;


 
public class AlunoDaoImpl implements AlunoDao{
   
    
    public List<Aluno> alunosl = new ArrayList<>();
    
    @Override
    public void salvar(Aluno aluno) {
               
        alunosl.add(aluno);
        System.out.println("size::: "+alunosl.size());
        
        
        
        
        
    }

    @Override
    public void atualizar(String nomeA, String nomeN) {
       System.out.println("size::: "+alunosl.size());
        //Sobrescrever equals//fazer o outro for?
       
        for(int i = 0; i < alunosl.size()+1; i++)
            System.out.println("\nbumdasida ");
        
                
                
        
        //imprimirLista();
    }

    @Override
    public void deletar(Aluno aluno) {
        /*
         for(int i = 0; i < alunos.size(); i++)
                    {
                            Aluno p = alunos.get(i);

                            if(p.getNome().equals(nomeD))
                            {
                         // Encontrou uma pessoa cadastrada com nome "Pedro".

                        // Remove.
                            listaAlunos.remove(p);

                            
                     
                            }
                    }*/
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

    

