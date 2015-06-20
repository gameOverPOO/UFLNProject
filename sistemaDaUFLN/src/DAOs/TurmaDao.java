
package DAOs;
import java.util.*;
import turma.Turma;

public interface TurmaDao {
    
   
    public void salvar(Turma aluno);
    public void deletar(Integer codigo);
    public void imprimirLista();
    public void cadastrarAluno(String cpf, Integer codigo);
    public void imprimirAlunos(Integer codigo);
    public void cadastrarProfessor(String cpf, Integer codigo);
    public void imprimirProfessores(Integer codigo);
    public void atividade(String nome, Integer codigo);
    
    
}
