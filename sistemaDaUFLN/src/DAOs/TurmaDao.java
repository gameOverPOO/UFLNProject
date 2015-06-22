
package DAOs;
import java.util.*;
import POJOs.Turma;

public interface TurmaDao {
    
   
    public boolean salvar(Turma aluno);
    public boolean deletar(Integer codigo);
    public void imprimirLista();
    public boolean cadastrarAluno(String cpf, Integer codigo);
    public void imprimirAlunos(Integer codigo);
    public boolean cadastrarProfessor(String cpf, Integer codigo);
    public void imprimirProfessores(Integer codigo);
    public boolean atividade(String nome, Integer codigo); //O que isso faz?
                                //Nem deveria estar aqui
    
}
