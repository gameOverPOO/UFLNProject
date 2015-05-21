/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;
import java.util.*;
/**
 *
 * @author poney
 */
public interface TurmaDao {
    
    //metodos CRUD
    public void salvar(Aluno aluno);
    public void atualizar(String nomeA, String nomeN);
    public void deletar(String nome);
    public void imprimir(Aluno aluno);
    public void imprimirLista();
    
}
