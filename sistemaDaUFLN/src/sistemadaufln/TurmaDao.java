
package sistemadaufln;
import java.util.*;

public interface TurmaDao {
    
   
    public void salvar(Turma aluno);
    public void atualizar(String nomeA, String nomeN);
    public void deletar(String nome);
    public void imprimirLista();
    
}
