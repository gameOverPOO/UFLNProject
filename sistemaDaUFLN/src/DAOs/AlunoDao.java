
package DAOs;

import POJOs.Aluno;

public interface AlunoDao {
    
    

    //metodos CRUD
    public boolean salvar(Aluno aluno);
    public boolean atualizar(Aluno alunoA,Aluno alunoN);
    public boolean deletar(Aluno aluno);
    public void imprimir(Aluno aluno);
    public void imprimirLista();
    
    }

