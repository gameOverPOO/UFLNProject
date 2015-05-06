/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

/**
 *
 * @author poney
 */
public class AlunoDaoImpl implements AlunoDao{
    
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
