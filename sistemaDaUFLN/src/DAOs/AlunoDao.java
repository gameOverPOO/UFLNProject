
package DAOs;

import POJOs.Aluno;

public interface AlunoDao {
    
    

    //metodos CRUD
    public void salvar(Aluno aluno);
    public void atualizar(Aluno alunoA,Aluno alunoN, int opcaoDeAtualizacao);
    public void deletar(Aluno aluno);
    public void imprimir(Aluno aluno);
    public void imprimirLista();
    
    }

