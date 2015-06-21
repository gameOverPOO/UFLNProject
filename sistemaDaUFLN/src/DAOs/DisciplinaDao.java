
package DAOs;

import POJOs.Disciplina;
import POJOs.Disciplina;
import POJOs.Professor;
import POJOs.Turma;


public interface DisciplinaDao {
    
        //metodos CRUD
    public void salvar(Disciplina disciplina);
    public void atualizar(Disciplina disciplinaA, Disciplina disciplinaN);
    public void deletar(Disciplina disciplina);
    public void cadastrarProfessor(Professor professor);
    public void excluirProfessor(Professor professor, Disciplina disciplina);
    public void imprimirListaProfessor(Disciplina disciplina);
    public void cadastrarTurma(Turma turma, Disciplina disciplina);
    public void ImprimirTurmas(Disciplina disciplina);
    
}
