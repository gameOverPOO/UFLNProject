
package DAOsImpl;

import DAOs.DisciplinaDao;
import POJOs.Disciplina;
import POJOs.Professor;
import POJOs.Turma;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class DisciplinaDaoImpl implements DisciplinaDao{
    
    public static List<Disciplina> disciplinal = new ArrayList<Disciplina>(); 
   
    private SessionFactory conexao; 
    
    public DisciplinaDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    
    @Override
    public boolean salvar(Disciplina disciplina){
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(disciplina);
        tx.commit();
        session.close();
        return true;
       
        
    }

    @Override
    public boolean atualizar(Disciplina disciplinaA, Disciplina disciplinaN){
     
        
        return false;
    }
    
    
    
    @Override 
    public boolean deletar(Disciplina disciplina){
        
        
        return false;
    }
    
    @Override
    public boolean cadastrarProfessor(Professor professor){
       /* String cpf = professor.getCpf();
        String nomeD = professor.getNome();
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                    ProfessorDaoImpl p = new ProfessorDaoImpl();
                    for(int j=0;j<p.professorl.size();j++){
                        if(p.professorl.get(j).getCpf().equals(cpf)){ 
                            Professor professor2 = new Professor();
                            professor2.setCpf(cpf);
                            d.getProfessores().add(professor2);
                           // p.professorl.get(j).getDisciplinas().add(d);
                            
                        }
                    }
                   return true;
               }*/
        
        return false;
    }
    
    @Override
    public boolean excluirProfessor(Professor professor,Disciplina disciplina){
        /*String cpf = professor.getCpf();
        String nomeD = disciplina.getNome();
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                   
                   d.getProfessores().remove(i);
                   return true;
               }                 
        }*/
        return false;
    }
    
    @Override
    public void imprimirListaProfessor(Disciplina disciplina){
       
        }

    @Override
    public boolean cadastrarTurma(Turma turma, Disciplina disciplina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ImprimirTurmas(Disciplina disciplina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
    
     

