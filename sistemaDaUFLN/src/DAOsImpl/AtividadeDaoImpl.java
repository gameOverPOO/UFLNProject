
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
    public void salvar(Atividade atividade){
        
        for(int i=0;i<atividadel.size();i++){              
            Atividade a = atividadel.get(i);
            if(a.getNome().equals(atividade.getNome())){
                System.out.println("Essa atividade ja existe!");
                return;
            }    
        }
        atividadel.add(atividade);
       
    }

    
    @Override
    public void deletar(Atividade atividade){
        String nome = atividade.getNome();
        
        
        for(int i=0;i<atividadel.size();i++){
            
            Atividade a = atividadel.get(i);
            if(a.getNome().equals(nome))
                atividadel.remove(a);
        }
        
    }
    
    @Override
    public void cadastrarAluno(Aluno alunob,Atividade atividade){
        String cpf = alunob.getCpf();
        String nomeA = atividade.getNome();
        for(int i=0;i<atividadel.size();i++){
                Atividade a = atividadel.get(i);
               if(nomeA.equals(a.getNome())){
                    AlunoDaoImpl aluno = new AlunoDaoImpl();
                    for(int j=0;j<aluno.alunosl.size() ;j++){
                        if(aluno.alunosl.get(j).getCpf().equals(cpf)){ 
                            a.alunos.add(cpf);
                            aluno.alunosl.get(j).atividades.add(a);
                        }
                    }
                   return;
               }
        }
        System.out.println("Erro ao adicionar Aluno!");
        
    }
    
    @Override //VERIFICAR
    public void excluirAluno(Aluno alunod,Atividade atividaded){
       String cpf = alunod.getCpf();
       for(int i=0;i<atividadel.size();i++){
                Atividade a = atividadel.get(i);
                if(a.alunos.get(i).equals(cpf)){
                    a.alunos.remove(cpf);
                    AlunoDaoImpl aluno = new AlunoDaoImpl();
                    for(int j=0;j<aluno.alunosl.size();j++)
                        aluno.alunosl.get(j).atividades.remove(a);
                }
                
    }
    }
    
    @Override
    public void imprimirAlunos(Atividade atividade){
        String nomeA = atividade.getNome();
        for(int i=0;i<atividadel.size();i++){ 
            Atividade a = atividadel.get(i);
            if(a.getNome().equals(nomeA)){
                for(int k=0;k<a.alunos.size();k++)
                {
                    AlunoDaoImpl aluno = new AlunoDaoImpl();                
                    for(int j=0;j<aluno.alunosl.size();j++){
                        if(aluno.alunosl.get(j).getCpf().equals(a.alunos.get(i))){ 
                            System.out.println("Alunos:\nNome: " + aluno.alunosl.get(j).getNome()); 
                        }                        
                    }
                }return;
                
            }
        }
        System.out.println("Atividade não encontrada!");
    }
        
    }
    
 
