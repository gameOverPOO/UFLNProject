
package DAOs;
import POJOs.Aluno;
import POJOs.Professor;
import POJOs.Turma;

public interface TurmaDao {
    
   
    public boolean salvar(Turma turma);
    public boolean deletar(Integer codigo);
    public void imprimirLista();
    public boolean cadastrarAluno(Aluno aluno, Turma turma);
    public void imprimirAlunos(Integer codigo);
    public boolean cadastrarProfessor(Professor professor, Turma turma);
    public void imprimirProfessores(Integer codigo);
    public boolean atualizar(Turma turmaA, Turma turmaN); //O que isso faz?
                                //Nem deveria estar aqui
    
}