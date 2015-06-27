
package DAOsImpl;


import DAOs.TurmaDao;
import POJOs.Aluno;
import java.util.*;
import POJOs.Turma;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class TurmaDaoImpl implements TurmaDao{
    private SessionFactory conexao; 
    public static Turma turmasl;
    public TurmaDaoImpl(){
        conexao = new Configuration().configure().buildSessionFactory();
    }
    @Override
    public boolean salvar(Turma turma){
        
      
        //Q é isso? 
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
    public boolean cadastrarAluno(String cpf, Integer codigo){
        
       
     
        
        return false;
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
