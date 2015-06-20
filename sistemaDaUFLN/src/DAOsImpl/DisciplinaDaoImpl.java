
package DAOsImpl;

import DAOs.DisciplinaDao;
import disciplina.Disciplina;
import disciplina.Disciplina;
import java.util.*;
import DAOsImpl.ProfessorDaoImpl;
import DAOsImpl.TurmaDaoImpl;


public class DisciplinaDaoImpl implements DisciplinaDao{
    
    public static List<Disciplina> disciplinal = new ArrayList<Disciplina>(); 
   
    
    @Override
    public void salvar(Disciplina disciplina){
        
        for(int i=0;i<disciplinal.size();i++){             
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(disciplina.getNome())){
                System.out.println("Essa disciplina ja existe:");
                return;
            }    
        }
        disciplinal.add(disciplina);
        
    }

    @Override
    public void atualizar(String nomeA, String nomeB){
     
        for(int i=0;i<disciplinal.size();i++)
        {
            Disciplina d=disciplinal.get(i);
            if(d.getNome().equals(nomeB));
        }
    }
    
    
    
    @Override 
    public void deletar(String nome){
        
        for(int i=0;i<disciplinal.size();i++){
            
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nome))
                disciplinal.remove(d);
        }
    }
    
    @Override
    public void cadastrarProfessor(String cpf, String nomeD){
        
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                    ProfessorDaoImpl p = new ProfessorDaoImpl();
                    for(int j=0;j<p.professorl.size();j++){
                        if(p.professorl.get(j).getCpf().equals(cpf)){ 
                            d.professoresCpf.add(cpf);
                            p.professorl.get(j).disciplinas.add(d);
                            
                        }
                    }
                   return;
               }
        }
        System.out.println("Erro ao adicionar Professor!");
    }
    
    @Override
    public void excluirProfessor(String cpf, String nomeD){
        
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                   d.professoresCpf.remove(i);
                   return;
               }                 
        }
        System.out.println("Disciplina não encontrada!");
    }
    
    @Override
    public void imprimirListaProfessor(String nomeD){
        
        for(int i=0;i<disciplinal.size();i++){ 
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nomeD)){
                for(int k=0;k<d.professoresCpf.size();k++)
                {
                    ProfessorDaoImpl professores = new ProfessorDaoImpl();                
                    for(int j=0;j<professores.professorl.size();j++){
                        if(professores.professorl.get(j).getCpf().equals(d.professoresCpf.get(i))){ 
                            System.out.println("Profesores:\nNome: " + professores.professorl.get(j).getNome()); 
                        }                        
                    }
                }
                return;
            }
        }
        System.out.println("Disciplina não encontrada!");
    }
    
        @Override
    public void cadastrarTurma(Integer codigoT, String nomeD){
        
        TurmaDaoImpl turma = new TurmaDaoImpl();
        for(int i=0;i<disciplinal.size();i++){
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nomeD)){
                for(int j=0;j<turma.turmasl.size();j++){
                    if(codigoT.equals(turma.turmasl.get(j).getCodigo())){
                        d.turmas.add(codigoT);
                        turma.turmasl.get(j).setDisciplina(d);
                        return;
                    }
                }              
                
            }
        }
        System.out.println("Erro disciplina não encontrada!");
    }
    
   @Override
    public void ImprimirTurmas(String nome){
        
        for(int i=0;i<disciplinal.size();i++){
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nome)){
                for(int j=0;j<d.turmas.size();j++){
                    System.out.println("Turmas: " + d.turmas.get(j));
                }
            }
        
        }
    }
}
