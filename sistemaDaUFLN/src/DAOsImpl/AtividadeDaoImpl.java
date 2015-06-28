
package DAOsImpl;

import DAOs.AtividadeDao;
import POJOs.Atividade;
import static DAOsImpl.AtividadeDaoImpl.atividadel;
import POJOs.Aluno;


import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class AtividadeDaoImpl implements AtividadeDao{
    
    public static List<Atividade> atividadel = new ArrayList<>(); 
    private Object atividade;
    
    
     private SessionFactory conexao; 
    
    public AtividadeDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    
    @Override
    public boolean salvar(Atividade atividade){
        
        Aluno a = new Aluno();
        a.setCpf("1234562712");
        a.setNome("Tiago");
        
        
       
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        atividade.setNome("trabaho");
        atividade.setValorAtividade(20);
        atividade.setData("27/08");
        atividade.getAlunos().add(a);
        
        
        AlunoDaoImpl aaa = new AlunoDaoImpl();
        a.getAtividades().add(atividade);
        aaa.salvar(a);
       
        session.save(atividade);
        tx.commit();
        session.close();
        return true;
       
    }

    
    @Override
    public boolean deletar(Atividade atividade){
        String nome = atividade.getNome();
        
        
        for(int i=0;i<atividadel.size();i++){
            
            Atividade a = atividadel.get(i);
            if(a.getNome().equals(nome))
                atividadel.remove(a);
                return true;
        }
        return false;
    }
    
    @Override
    public boolean cadastrarAluno(Aluno alunob,Atividade atividade){
        String cpf = alunob.getCpf();
      
        return false;
        
        
    }
    
    @Override //VERIFICAR
    public boolean excluirAluno(Aluno alunod,Atividade atividaded){
      
      return false; 
    }
    
    @Override
    public void imprimirAlunos(Atividade atividade){
        
            
        }
        
    }
        
    
    
 
