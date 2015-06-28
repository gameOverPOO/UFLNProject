
package DAOsImpl;

import DAOs.AlunoDao;
import POJOs.Aluno;
import POJOs.Atividade;
import POJOs.Disciplina;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 
public class AlunoDaoImpl implements AlunoDao{
    private SessionFactory conexao; 
    
    public AlunoDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
   
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
    
    @Override
    public boolean atualizar(Aluno alunoA,Aluno alunoN, int opcaoDeAtualizacao){
        return false;
    }
    
    @Override
    public boolean deletar(Aluno aluno){
        return false;
    }
    
    @Override
    public void imprimir(Aluno aluno){
        
    }
    @Override
    public void imprimirLista(){
        
    }
}

    

