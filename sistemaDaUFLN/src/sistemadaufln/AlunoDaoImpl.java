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
public class AlunoDaoImpl implements AlunoDao{
    
    @Override
    public void salvar(Object bean){
        
    }
    
    @Override
    public void atualizar(Object bean){
        
    }
    
    @Override
    public void deletar(int id){
        
    }
    
    @Override
    public Object getById(int id){
        return null;
    }
    
    @Override
    public List<Object> getAll(){
        return null;
    }
    
    @Override
    public String getNomeAluno(){
        return "teste";
    }
    @Override
    public String getCPFAluno(){
        return "testeCPF";
    }
    @Override
    public void setNomeAluno(String nomeAluno){
        
    }
    @Override
    public boolean validarCPF(){
        return true;
    }
    
}
