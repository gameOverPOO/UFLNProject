/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;
import java.util.List;
/**
 *
 * @author poney
 */
public interface AlunoDao {
    

    //metodos CRUD
    public void salvar(Object bean);
    public void atualizar(Object bean);
    public void deletar(int id);
    public Object getById(int id);
    public List<Object> getAll();
    
    //metodos para aluno
    public String getNomeAluno();
    public String getCPFAluno();
    public void setNomeAluno(String nomeAluno);
    public boolean validarCPF();
}