
package sistemadaufln;


public interface DisciplinaDao {
    
        //metodos CRUD
    public void salvar(Disciplina disciplina);
    public void atualizar(String nomeA, String nomeB);
    public void deletar(String nome);
    public void cadastrarProfessor(String cpf, String nomeD);
    public void excluirProfessor(String cpf, String nomeD);
    public void imprimirListaProfessor(String nomeD);
   

    
}
