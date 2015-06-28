
package DAOsImpl;

import DAOs.AtividadeDao;
import POJOs.Atividade;
import POJOs.Aluno;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AtividadeDaoImpl implements AtividadeDao{
    
    public static List<Atividade> atividadel = new ArrayList<>(); 
   
    ///CRIAR FUNCAO Q BUSCA NO BANCO?
    
     private SessionFactory conexao; 
    
    public AtividadeDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    
    @Override
    public boolean salvar(Atividade atividade){
        
        Aluno a = new Aluno();
        a.setCpf(14638431780L);
        
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        atividade.setNome("PROVA DE tele");
        atividade.setValorAtividade(20);
        atividade.setData("26/08k");
        atividade.getAlunos().add(a);
        
        
        AlunoDaoImpl aaa = new AlunoDaoImpl();        
        a.getAtividades().add(atividade);
       // aaa.salvar(a); //se salvar fica com dados duplicados       
        session.save(atividade);
        tx.commit();
        session.close();
        return true;
       
    }

    
    @Override
    public boolean deletar(Atividade atividade){
        
        try{ // tenta deletar no banco
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction(); 
            session.delete(atividade);
            return true;
        }
        catch(Exception ex){
            return false;//no existe
        }
        
        
    }
    
    @Override
    public boolean cadastrarAluno(Aluno aluno,Atividade atividade){
       
       try{ // tenta cadastrar no banco
            Session session;
            session = conexao.openSession();
             Transaction tx = session.beginTransaction();
        //atividade.setNome("trabaho");
        //atividade.setValorAtividade(20);
        //atividade.setData("27/08");
        
             atividade.getAlunos().add(aluno);//adiciona atividade na lista do aluno
             aluno.getAtividades().add(atividade);//adiciona aluno na lista de atividade
        
        //AlunoDaoImpl aaa = new AlunoDaoImpl();
        
            session.merge(aluno); //atualiza aluno
            session.merge(atividade);//atualiza atividade
       
        //session.save(atividade);
                tx.commit();
                session.close();
                return true;
        
        
       }catch(Exception ex) //se atividade ou aluno nao existirem
       {
           return false;
       }
        
        
        
        
    }
    
    @Override //VERIFICAR
    public boolean excluirAluno(Aluno alunod,Atividade atividaded){
      
        try{ // tenta deletar no banco
            Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction(); 
            alunod.getAtividades().remove(atividaded);
            atividaded.getAlunos().remove(alunod);
            
            
            
            session.merge(atividaded);
            session.merge(alunod); //VER SE NaO ATUALIZA SOZINHO
            return true;
        }
        catch(Exception ex){
            return false;//no existe
        }
        
        
    }
    
    @Override
    public void imprimirAlunos(Atividade atividade){
        
        
        
        
        
        
        
            
        }
        
    }
        
    
    
 
