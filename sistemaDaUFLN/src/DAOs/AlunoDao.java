
package DAOs;

import POJOs.Aluno;
import POJOs.Aluno;

public interface AlunoDao {
    
    

    //metodos CRUD
    public void salvar(Aluno aluno);
    public void atualizar(String nomeA, String nomeN, int opcaoDeAtualizacao);
    public void deletar(String nome);
    public void imprimir(Aluno aluno);
    public void imprimirLista();
    
    }

