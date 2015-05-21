
package sistemadaufln;
import java.util.*;



public interface AlunoDao {
    
    

    //metodos CRUD
    public void salvar(Aluno aluno);
    public void atualizar(String nomeA, String nomeN);
    public void deletar(String nome);
    public void imprimir(Aluno aluno);
    public void imprimirLista();
    
    
    }
    
    
    
    //Achei um exemplo:  https://github.com/edveloso/academica-complete/blob/master/src/modelo/persistencia/AlunoDAO.java
    //metodos para aluno
   

