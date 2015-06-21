
package DAOs;

import POJOs.Atividade;
import POJOs.Atividade;


public interface AtividadeDao {
    
    public void salvar(Atividade atividade);
    public void deletar(String nome);
    public void cadastrarAluno(String cpf, String nomeA);
    public void excluirAluno(String cpf, String nomeA);
    public void imprimirAlunos(String nomeA);
    
}


