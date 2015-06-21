
package DAOs;

import POJOs.Aluno;
import POJOs.Atividade;


public interface AtividadeDao {
    
    public void salvar(Atividade atividade);
    public void deletar(Atividade atividade);
    public void cadastrarAluno(Aluno aluno);
    public void excluirAluno(Aluno aluno);
    public void imprimirAlunos(Atividade atividade);
    
}


