
package DAOsImpl;

import DAOs.DisciplinaDao;
import POJOs.Disciplina;
import POJOs.Professor;
import POJOs.Turma;
import java.util.*;



public class DisciplinaDaoImpl implements DisciplinaDao{
    
    public static List<Disciplina> disciplinal = new ArrayList<Disciplina>(); 
   
    
    @Override
    public boolean salvar(Disciplina disciplina){
        
        for(int i=0;i<disciplinal.size();i++){             
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(disciplina.getNome())){
                
                return false;
            }    
        }
        disciplinal.add(disciplina);
        return true;
    }

    @Override
    public boolean atualizar(Disciplina disciplinaA, Disciplina disciplinaN){
     
        for(int i=0;i<disciplinal.size();i++)
        {
            Disciplina d=disciplinal.get(i);
            if(d.getNome().equals(disciplinaA.getNome()))
            {
                d.setNome(disciplinaN.getNome());
                return true;
            }
        }
        return false;
    }
    
    
    
    @Override 
    public boolean deletar(Disciplina disciplina){
        String nome = disciplina.getNome();
        for(int i=0;i<disciplinal.size();i++){
            
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nome))
            {
                disciplinal.remove(d);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean cadastrarProfessor(Professor professor){
        String cpf = professor.getCpf();
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
                            p.professorl.get(j).getDisciplinas().add(d);
                            
                        }
                    }
                   return true;
               }
        }
        return false;
    }
    
    @Override
    public boolean excluirProfessor(Professor professor,Disciplina disciplina){
        String cpf = professor.getCpf();
        String nomeD = disciplina.getNome();
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                   
                   d.getProfessores().remove(i);
                   return true;
               }                 
        }
        return false;
    }
    
    @Override
    public void imprimirListaProfessor(Disciplina disciplina){
        String nomeD = disciplina.getNome();
        for(int i=0;i<disciplinal.size();i++){ 
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nomeD)){
                for(int k=0;k<d.getProfessores().size();k++)
                {
                    ProfessorDaoImpl professores = new ProfessorDaoImpl();                
                    for(int j=0;j<professores.professorl.size();j++){
                        if(professores.professorl.get(j).getCpf().equals(d.getProfessores().get(i))){ 
                            System.out.println("Profesores:\nNome: " + professores.professorl.get(j).getNome()); 
                        }                        
                    }
                }
                return;
            }
        }
        
    }
    
        @Override
    public boolean cadastrarTurma(Turma turma, Disciplina disciplina){
        
        Integer codigoT = turma.getCodigo();
        String nomeD = disciplina.getNome();
        TurmaDaoImpl turmadao = new TurmaDaoImpl();
        for(int i=0;i<disciplinal.size();i++){
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nomeD)){
                for(int j=0;j<turmadao.turmasl.size();j++){
                    if(codigoT.equals(turmadao.turmasl.get(j).getCodigo())){
                        Turma turma2 = new Turma();
                        turma2.setCodigo(codigoT);
                        
                        d.getTurmas().add(turma2);
                        turmadao.turmasl.get(j).setDisciplina(d);
                        return true;
                    }
                }              
                
            }
        }
        return false;
    }
    
   @Override
    public void ImprimirTurmas(Disciplina disciplina){
        String nome = disciplina.getNome();
        for(int i=0;i<disciplinal.size();i++){
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nome)){
                for(int j=0;j<d.getTurmas().size();j++){
                    System.out.println("Turmas: " + d.getTurmas().get(j));
                }
            }
        
        }
    }
}
