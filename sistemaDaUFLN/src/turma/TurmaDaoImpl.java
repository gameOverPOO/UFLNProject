
package turma;


import professor.ProfessorDaoImpl;
import aluno.AlunoDaoImpl;
import java.util.*;


public class TurmaDaoImpl implements TurmaDao{
    
     public static List<Turma> turmasl = new ArrayList<Turma>();
     
    @Override
    public void salvar(Turma turma){
        
        //Como verificar se a turma já existe? pelo disci, periodo?
        turmasl.add(turma);
        System.out.println("size::: "+turmasl.size());
        
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
                        a.alunosl.get(j).codigoTurma.add(codigo);
                    }
                }
            }
        }
    }
    
    @Override
    public void imprimirAlunos(Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
                if(turmasl.get(i).getCodigo().equals(codigo)){
                    AlunoDaoImpl a = new AlunoDaoImpl();
                    for(int j=0;j<a.alunosl.size();j++){
                        for(int k=0;k<a.alunosl.get(j).codigoTurma.size();k++)
                        if(a.alunosl.get(j).codigoTurma.get(k).equals(codigo)){
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
    

    public void atividade(String nome, Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                turmasl.get(i).atividades.add(nome);
            }
        }
    }
    
    @Override
    public void imprimirAtividade(Integer codigo){
        
        System.out.println("Lista Atividades: ");
                    
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                for(int k=0;k<turmasl.get(i).atividades.size();k++){
                    System.out.println("Nome: " + turmasl.get(i).atividades.get(k));
                }
            }
        }
    }
    
}