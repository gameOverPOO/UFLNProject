/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import java.util.List;

/**
 *
 * @author leandronog
 */
public interface ProfessorDao {
    
    
    public void salvar(Professor professor);
    public void atualizar(String nomeA, String nomeN);
    public void deletar(String nome);
    public Object getById(int id);
    public List<Object> getAll();
    
}
