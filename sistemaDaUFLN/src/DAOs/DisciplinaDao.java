
package DAOs;

import POJOs.Disciplina;
import POJOs.Disciplina;
import POJOs.Professor;
import POJOs.Turma;


public interface DisciplinaDao {
    
        //metodos CRUD
    public boolean salvar(Disciplina disciplina);
    public boolean atualizar(Disciplina disciplinaA, Disciplina disciplinaN);
    public boolean deletar(Disciplina disciplina);
    public boolean cadastrarProfessor(Professor professor);
    public boolean excluirProfessor(Professor professor, Disciplina disciplina);
    public void imprimirListaProfessor(Disciplina disciplina);
    public boolean cadastrarTurma(Turma turma, Disciplina disciplina);
    public void ImprimirTurmas(Disciplina disciplina);
    
}
