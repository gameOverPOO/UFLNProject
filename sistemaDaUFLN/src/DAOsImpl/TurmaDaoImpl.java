
package DAOsImpl;


import DAOs.TurmaDao;
import POJOs.Aluno;
import POJOs.Professor;
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
    public boolean cadastrarProfessor(Professor professor, Turma turma){
         try{ // tenta cadastrar no banco
            Session session;
            session = conexao.openSession();
             Transaction tx = session.beginTransaction();
       
             turma.setProfessor(professor);//adiciona atividade na lista do aluno
             professor.getTurmas().add(turma);
         
            session.merge(professor); //atualiza aluno
            session.merge(turma);//atualiza atividade
       
        
                tx.commit();
                session.close();
                return true;
        
        
       }catch(Exception ex) 
       {
          
           
           
           return false;
       }
        
          
        
        
    }
    
    @Override
    public void imprimirProfessores(Integer codigo){
        
        
            
    }
    
 
     
   

    @Override
    public boolean atualizar(Turma turmaA, Turma turmaN) {
        
        Session session;
            session = conexao.openSession();
            Transaction tx = session.beginTransaction(); 
           // tenta deletar no banco
            //alunoA.setNome(alunoN.getNome());
            //alunoA.setCpf(alunoN.getCpf());
            session.merge(turmaA);
           // alunoA.setCpf(alunoN.getCpf());
           
           
            
            
            
            tx.commit();
            
            return true;
        
        
        
        
    }
    
}