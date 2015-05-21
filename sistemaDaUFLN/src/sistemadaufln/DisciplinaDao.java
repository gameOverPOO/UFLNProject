
package sistemadaufln;


public interface DisciplinaDao {
    
        //metodos CRUD
    public void salvar(Disciplina disciplina);
    public void atualizar(String nomeA, String nomeB);
    public void deletar(String nome);
   

    
}
