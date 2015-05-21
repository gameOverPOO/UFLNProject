
package sistemadaufln;

import java.util.*;


 
public class AlunoDaoImpl implements AlunoDao{
   
    
    public List<Aluno> alunosl = new ArrayList<Aluno>(); //TIRAR ISSO
    
    @Override
    public void salvar(Aluno aluno) {
       //VERIFICAR SE O ALUNO/CPF JÁ EXISTE NA LISTA
       //VERIFICAR SE OS DADOS OBRIGATÓRIOS ESTÃO PREENCHIDOS
       
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
                            
           //RETORNAR ALGO SE O ALUNO NÃO FOR ENCONTRADO!
       
       }
       this.imprimirLista();         
                
        
        
    }

    @Override //É o aluno que procuro se tiverem o mesmo cpf!
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

    

