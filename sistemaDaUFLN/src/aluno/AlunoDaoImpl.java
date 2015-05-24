
package aluno;

import aluno.AlunoDao;
import aluno.Aluno;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


 
public class AlunoDaoImpl implements AlunoDao{
   
    
    public static List<Aluno> alunosl = new ArrayList<Aluno>(); //TIRAR ISSO
    
    @Override
    public void salvar(Aluno aluno) {
       //VERIFICAR SE O ALUNO/CPF JÁ EXISTE NA LISTA  - OK 
       //VERIFICAR SE OS DADOS OBRIGATÓRIOS ESTÃO PREENCHIDOS

        
        
        for(int i=0;i<alunosl.size();i++){
            Aluno a = alunosl.get(i);
            if(a.getCpf().equals(aluno.getCpf())){
                System.out.println("Aluno ja existente:");
                return ;//mais um
            }
            
        }
        
        alunosl.add(aluno);
        System.out.println("size::: "+alunosl.size());
        
        
        //FAZER ISTO AO FECHAR O PROGRAM!!!
        
       
        
        
        
        
        
        
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
                    //problema: nao ta comparando um cpf com o outro.
                    p.setCpf(nomeN);
                }
            }
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

    

