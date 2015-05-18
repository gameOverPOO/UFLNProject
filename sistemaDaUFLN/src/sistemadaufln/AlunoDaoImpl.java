
package sistemadaufln;

import java.util.*;


 
public class AlunoDaoImpl implements AlunoDao{
   
    
    public List<Aluno> alunosl = new ArrayList<Aluno>();
    
    @Override
    public void salvar(Aluno aluno) {
               
        alunosl.add(aluno);
        System.out.println("size::: "+alunosl.size());
        
        
        
        
        
    }

    /*@Override
    public boolean equals(Object obj)
    {
        //Dois alunos sao iguais se as matriculas forem iguais
       return false;
    }*/
    @Override
    public void atualizar(String nomeA, String nomeN) {
       for(int i = 0; i < alunosl.size(); i++){
          Aluno p = alunosl.get(i);
          if(p.getNome().equals(nomeA)) p.setNome(nomeN);
                            
           
       
       }
       this.imprimirLista();         
                
        
        
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

    

