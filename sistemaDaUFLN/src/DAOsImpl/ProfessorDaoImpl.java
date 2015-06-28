
package DAOsImpl;

import DAOs.ProfessorDao;
import POJOs.Professor;
import java.util.*;
import POJOs.Professor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ProfessorDaoImpl implements ProfessorDao{
    
    
    private SessionFactory conexao; 
    
    public ProfessorDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    
                                                           
    
    //CRUD
    @Override
    public boolean salvar(Professor professor){
       Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(professor);
        tx.commit();
        session.close();
        return true;
        
    }
    
    
    @Override
    public boolean atualizar(Professor professorA,Professor professorN){
        
        return false;
    }
   
    
    @Override
    public boolean deletar(Professor professor){
        
       
        try{ // tenta deletar no banco
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction(); 
            session.delete(professor);
            return true;
        }
        catch(Exception ex){
            return false;//no existe
        }
        
    }
    
    
    @Override
    public void imprimirLista() {
       
    }
                  
    
    
    
}
