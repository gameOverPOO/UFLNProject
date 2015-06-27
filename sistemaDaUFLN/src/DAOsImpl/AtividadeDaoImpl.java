
package DAOsImpl;

import DAOs.AtividadeDao;
import POJOs.Atividade;
import static DAOsImpl.AtividadeDaoImpl.atividadel;
import POJOs.Aluno;

import java.util.*;


public class AtividadeDaoImpl implements AtividadeDao{
    
    public static List<Atividade> atividadel = new ArrayList<>(); 
    private Object atividade;
    
    @Override
    public boolean salvar(Atividade atividade){
        
        for(int i=0;i<atividadel.size();i++){              
            Atividade a = atividadel.get(i);
            if(a.getNome().equals(atividade.getNome())){                
                return false;
            }    
        }
        atividadel.add(atividade);
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
        
    
    
 
