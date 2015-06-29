
package DAOsImpl;


import DAOs.TurmaDao;
import POJOs.Aluno;
import java.util.*;
import POJOs.Turma;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TurmaDaoImpl implements TurmaDao{
    private SessionFactory conexao; 
    public static Turma turmasl;
    public TurmaDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    @Override
    public boolean salvar(Turma turma){
        
      Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(turma);
        tx.commit();
        session.close();
        return true;
        
        
    }
        
    @Override
    public boolean deletar(Integer codigo){
       
        return false;
    }
   
    @Override
    public void imprimirLista(){
        
        
                        
    }
    
    @Override
    public boolean cadastrarAluno(Aluno aluno, Turma turma){
        try{ // tenta cadastrar no banco
            Session session;
            session = conexao.openSession();
             Transaction tx = session.beginTransaction();
        //atividade.setNome("trabaho");
        //atividade.setValorAtividade(20);
        //atividade.setData("27/08");
        
             turma.getAlunos().add(aluno);//adiciona atividade na lista do aluno
             aluno.getTurmas().add(turma);//adiciona aluno na lista de atividade
        
        //AlunoDaoImpl aaa = new AlunoDaoImpl();
        
            session.merge(aluno); //atualiza aluno
            session.merge(turma);//atualiza atividade
       
        //session.save(atividade);
                tx.commit();
                session.close();
                return true;
        
        
       }catch(Exception ex) //se atividade ou aluno nao existirem
       {
           return false;
       }
        
       
     
        
        
    }
    
    @Override
    public void imprimirAlunos(Integer codigo){ //Nao tá imprimindo
        Aluno aluno = new Aluno();
        
        
    }
    
    @Override
    public boolean cadastrarProfessor(String cpf, Integer codigo){
        
          
        return false;
        
    }
    
    @Override
    public void imprimirProfessores(Integer codigo){
        
        
            
    }
    
 
     @Override
    public boolean atividade(String nome, Integer codigo){
        
        
        return false;
    }
    
}