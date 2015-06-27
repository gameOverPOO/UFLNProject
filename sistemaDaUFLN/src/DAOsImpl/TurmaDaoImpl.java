
package DAOsImpl;


import DAOs.TurmaDao;
import POJOs.Aluno;
import java.util.*;
import POJOs.Turma;


public class TurmaDaoImpl implements TurmaDao{
    
     public static List<Turma> turmasl = new ArrayList<Turma>();
     
    @Override
    public boolean salvar(Turma turma){
        
      
        turmasl.add(turma); //Q é isso? 
        return true;
        
        
    }
        
    @Override
    public boolean deletar(Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                turmasl.remove(i);
                return true;
            }
        }
        return false;
    }
   
    @Override
    public void imprimirLista(){
        
        for (Turma t:turmasl)
                        System.out.println("Codigo: " + t.getCodigo() + " Periodo: " + t.getPeriodo() + " Horario: " + t.getHorario() + " Vagas: " + t.getVagas());  
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
