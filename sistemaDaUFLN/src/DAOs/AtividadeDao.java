
package DAOs;

import POJOs.Aluno;
import POJOs.Atividade;


public interface AtividadeDao {
    
    public boolean salvar(Atividade atividade);
    public boolean deletar(Atividade atividade);
    public boolean cadastrarAluno(Aluno aluno,Atividade atividade);
    public boolean excluirAluno(Aluno aluno, Atividade atividade);
    public void imprimirAlunos(Atividade atividade);
    
}


