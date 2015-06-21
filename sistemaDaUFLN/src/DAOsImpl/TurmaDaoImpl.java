
package DAOsImpl;


import DAOs.TurmaDao;
import POJOs.Aluno;
import java.util.*;
import POJOs.Turma;


public class TurmaDaoImpl implements TurmaDao{
    
     public static List<Turma> turmasl = new ArrayList<Turma>();
     
    @Override
    public void salvar(Turma turma){
        
      
        turmasl.add(turma);
        
        
    }
        
    @Override
    public void deletar(Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                turmasl.remove(i);
            }
        }
    }
   
    @Override
    public void imprimirLista(){
        
        for (Turma t:turmasl)
                        System.out.println("Codigo: " + t.getCodigo() + " Periodo: " + t.getPeriodo() + " Horario: " + t.getHorario() + " Vagas: " + t.getVagas());  
    }
    
    @Override
    public void cadastrarAluno(String cpf, Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                AlunoDaoImpl a = new AlunoDaoImpl();
                for(int j=0;j<a.alunosl.size();j++){
                    if(a.alunosl.get(j).getCpf().equals(cpf)){
                      //  a.alunosl.get(j).codigoTurma.add(codigo);
                    }
                }
            }
        }
    }
    
    @Override
    public void imprimirAlunos(Integer codigo){
        Aluno aluno = new Aluno();
        for(int i=0;i<turmasl.size();i++){
                if(turmasl.get(i).getCodigo().equals(codigo)){
                    AlunoDaoImpl a = new AlunoDaoImpl();
                    for(int j=0;j<a.alunosl.size();j++){
                       
                        for(int k=0;k<a.alunosl.get(j).getTurmas().size();k++)
                        if(a.alunosl.get(j).getTurmas().get(k).equals(codigo)){
                            System.out.println("Aluno: " + a.alunosl.get(j).getNome());
                        }
                    }
                }
            }
    }
    
    @Override
    public void cadastrarProfessor(String cpf, Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                ProfessorDaoImpl p = new ProfessorDaoImpl();
                for(int j=0;j<p.professorl.size();j++){
                    if(p.professorl.get(j).getCpf().equals(cpf)){
                        p.professorl.get(j).codigoTurma.add(codigo);
                    }
                }
                return;
            }
        }
        System.out.println("Turma nao encontrado");
        
    }
    
    @Override
    public void imprimirProfessores(Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
                if(turmasl.get(i).getCodigo().equals(codigo)){
                    ProfessorDaoImpl p = new ProfessorDaoImpl();
                    for(int j=0;j<p.professorl.size();j++){
                        for(int k=0;k<p.professorl.get(j).codigoTurma.size();k++)
                        if(p.professorl.get(j).codigoTurma.get(k).equals(codigo)){
                            System.out.println("Professor: " + p.professorl.get(j).getNome());
                        }
                    }
                }
            }
    }
    
 /*PRA QUE ISSO SERVE????????*/
     @Override
    public void atividade(String nome, Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                turmasl.get(i).atividades.add(nome);
            }
        }
    }
    
}
