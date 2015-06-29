
package DAOs;
import POJOs.Aluno;
import java.util.*;
import POJOs.Turma;

public interface TurmaDao {
    
   
    public boolean salvar(Turma turma);
    public boolean deletar(Integer codigo);
    public void imprimirLista();
    public boolean cadastrarAluno(Aluno aluno, Turma turma);
    public void imprimirAlunos(Integer codigo);
    public boolean cadastrarProfessor(String cpf, Integer codigo);
    public void imprimirProfessores(Integer codigo);
    public boolean atividade(String nome, Integer codigo); //O que isso faz?
                                //Nem deveria estar aqui
    
}