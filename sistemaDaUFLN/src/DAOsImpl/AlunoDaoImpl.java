
package DAOsImpl;

import DAOs.AlunoDao;
import POJOs.Aluno;
import POJOs.Atividade;
import java.util.ArrayList;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class AlunoDaoImpl implements AlunoDao{
    private SessionFactory conexao; 
    
    public AlunoDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    //okay
    @Override
    public boolean salvar(Aluno aluno){
        Session session;
       // Atividade disc = new Atividade();
        //disc.setNome("poo dos infernos");
       
        
        //aluno.getAtividades().add(disc);
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(aluno);
        tx.commit();
        session.close();
        return true;
    }
    //okay
    @Override
    public boolean atualizar(Aluno alunoA,Aluno alunoN){
        
        
        
          try{ 
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction(); 
           // tenta deletar no banco
            alunoA.setNome(alunoN.getNome());
            //alunoA.setCpf(alunoN.getCpf());
            session.merge(alunoA);
           // alunoA.setCpf(alunoN.getCpf());
           
           
            
            
             System.out.println("1. Agsdgsdfds");
            tx.commit();
            
            return true;
        }
        catch(Exception ex){
            System.out.println("1. Adicionar uma disciplina");
            
            return false;//no existe
        }
        
       /* MyEntity e = //entidade criada em algum outro lugar (JSF, Spring, etc.)
        MyEntity e2 = em.find(MyEntity.class, idEntidade);
        e.setAtributo(e.getAtributo); */
        
    }
    
   
        
        
    
    //OKaY
    @Override
    public boolean deletar(Aluno aluno){
         try{ // tenta deletar no banco
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction(); 
            session.delete(aluno);
            tx.commit();
            return true;
        }
        catch(Exception ex){
            return false;//no existe
        }
    }
    
    @Override
    public void imprimir(Aluno aluno){
         
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction(); 
        
        Aluno alunoo = new Aluno();

        Criteria criteria = session.createCriteria(Aluno.class); 

         List<Aluno> alunol = new ArrayList<>();
         alunol = criteria.list();
        
    }
    @Override
    public void imprimirLista(){
        
    }
}

    

