
package DAOsImpl;

import DAOs.DisciplinaDao;
import POJOs.Disciplina;
import POJOs.Professor;
import POJOs.Turma;
import java.util.*;



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
    public void atualizar(Disciplina disciplinaA, Disciplina disciplinaN){
     
        for(int i=0;i<disciplinal.size();i++)
        {
            Disciplina d=disciplinal.get(i);
            if(d.getNome().equals(disciplinaA.getNome()))
            {
                d.setNome(disciplinaN.getNome());
            }
        }
    }
    
    
    
    @Override 
    public void deletar(Disciplina disciplina){
        String nome = disciplina.getNome();
        for(int i=0;i<disciplinal.size();i++){
            
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nome))
                disciplinal.remove(d);
        }
    }
    
    @Override
    public void cadastrarProfessor(Professor professor){
        String cpf = professor.getCpf();
        String nomeD = professor.getNome();
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
    public void excluirProfessor(Professor professor,Disciplina disciplina){
        String cpf = professor.getCpf();
        String nomeD = disciplina.getNome();
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
    public void imprimirListaProfessor(Disciplina disciplina){
        String nomeD = disciplina.getNome();
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
    public void cadastrarTurma(Turma turma, Disciplina disciplina){
        
        Integer codigoT = turma.getCodigo();
        String nomeD = disciplina.getNome();
        TurmaDaoImpl turmadao = new TurmaDaoImpl();
        for(int i=0;i<disciplinal.size();i++){
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nomeD)){
                for(int j=0;j<turmadao.turmasl.size();j++){
                    if(codigoT.equals(turmadao.turmasl.get(j).getCodigo())){
                        d.turmas.add(codigoT);
                        turmadao.turmasl.get(j).setDisciplina(d);
                        return;
                    }
                }              
                
            }
        }
        System.out.println("Erro disciplina não encontrada!");
    }
    
   @Override
    public void ImprimirTurmas(Disciplina disciplina){
        String nome = disciplina.getNome();
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
