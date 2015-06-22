
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
        String nomeA = atividade.getNome();
        for(int i=0;i<atividadel.size();i++){
                Atividade a = atividadel.get(i);
               if(nomeA.equals(a.getNome())){
                    AlunoDaoImpl aluno = new AlunoDaoImpl();
                    for(int j=0;j<aluno.alunosl.size() ;j++){
                        if(aluno.alunosl.get(j).getCpf().equals(cpf)){ 
                            Aluno aluno2 = new Aluno();
                            aluno2.setCpf(cpf);
                            a.getAlunos().add(aluno2);
                            aluno.alunosl.get(j).getAtividades().add(a);
                        }
                    }
                   return true;
               }
        }
        return false;
        
        
    }
    
    @Override //VERIFICAR
    public boolean excluirAluno(Aluno alunod,Atividade atividaded){
       String cpf = alunod.getCpf();
       for(int i=0;i<atividadel.size();i++){
                Atividade a = atividadel.get(i);
                if(a.getAlunos().get(i).equals(cpf)){
                    a.getAlunos().remove(cpf);
                    AlunoDaoImpl aluno = new AlunoDaoImpl();
                    for(int j=0;j<aluno.alunosl.size();j++)
                        aluno.alunosl.get(j).getAtividades().remove(a);
                    return true;
                }
                
    }
      return false; 
    }
    
    @Override
    public void imprimirAlunos(Atividade atividade){
        String nomeA = atividade.getNome();
        for(int i=0;i<atividadel.size();i++){ 
            Atividade a = atividadel.get(i);
            if(a.getNome().equals(nomeA)){
                for(int k=0;k< a.getAlunos().size();k++)
                {
                    AlunoDaoImpl aluno = new AlunoDaoImpl();                
                    for(int j=0;j<aluno.alunosl.size();j++){
                        if(aluno.alunosl.get(j).getCpf().equals(a.getAlunos().get(i))){ 
                            System.out.println("Alunos:\nNome: " + aluno.alunosl.get(j).getNome()); 
                        }                        
                    }
                }return;
                
            }
        }
        
    }
        
    }
    
 
