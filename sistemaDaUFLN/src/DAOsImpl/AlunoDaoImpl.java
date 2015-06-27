
package DAOsImpl;

import DAOs.AlunoDao;
import POJOs.Aluno;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class AlunoDaoImpl implements AlunoDao{
    private SessionFactory conexao; 
    
    public AlunoDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
   
    
    public void insere(Aluno aluno){
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(aluno);
        tx.commit();
        session.close();
    }
    
    
    
    
    
    public static List<Aluno> alunosl = new ArrayList<Aluno>(); 
   
    @Override
    public boolean salvar(Aluno aluno) {
       
        for(int i=0;i<alunosl.size();i++){
            Aluno a = alunosl.get(i);
            if(a.getCpf().equals(aluno.getCpf())){
                System.out.println("Aluno ja existente:");
                return false;
            }
            
        }
        
        alunosl.add(aluno);
        
       return true; 
        
    }

    @Override
    public boolean atualizar(Aluno alunoA, Aluno alunoN, int opcaoDeAtualizacao) {
     String nomeA=alunoA.getNome();
     String nomeN=alunoN.getNome();
     
        if(opcaoDeAtualizacao==1){
            for (Iterator<Aluno> it = alunosl.iterator(); it.hasNext();) {
                Aluno p = it.next();
                if(p.getNome().equals(nomeA)) p.setNome(nomeN);
                return true;
            }
        }
        else{
            for (Iterator<Aluno> it = alunosl.iterator(); it.hasNext();) {
                Aluno p = it.next();
                
                if(p.getCpf().equals(nomeA)){                    
                    p.setCpf(nomeN);
                    return true;
                }
            }
        }
       
       this.imprimirLista();  
       return false; 
                
    }

    @Override
    public boolean deletar(Aluno aluno) {
        String nome=aluno.getNome();
        for(int i = 0; i < alunosl.size(); i++){
          Aluno p = alunosl.get(i);
          if(p.getNome().equals(nome)){
              alunosl.remove(p);
              this.imprimirLista(); 
          }     return true;
          
          
        }
          
         return false;   
    }
    
    @Override
    public void imprimir(Aluno aluno)
    {
    
    }

    @Override //Prints na daoimpl? deixar?
    public void imprimirLista() {
        for (Aluno s:alunosl)
                        System.out.println("Aluno: " + s.getNome() + " CPF: " + s. getCpf());  
                  
                
        
    }
 
    
}

    

