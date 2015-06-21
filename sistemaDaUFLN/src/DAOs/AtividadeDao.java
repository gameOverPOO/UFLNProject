
package DAOs;

import POJOs.Aluno;
import POJOs.Atividade;


public interface AtividadeDao {
    
    public void salvar(Atividade atividade);
    public void deletar(Atividade atividade);
    public void cadastrarAluno(Aluno aluno,Atividade atividade);
    public void excluirAluno(Aluno aluno, Atividade atividade);
    public void imprimirAlunos(Atividade atividade);
    
}


