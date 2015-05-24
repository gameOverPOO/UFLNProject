
package sistemadaufln;

import java.util.*;


public class DisciplinaDaoImpl implements DisciplinaDao{
    
    public List<Disciplina> disciplinal = new ArrayList<Disciplina>(); 
   
    
    @Override
    public void salvar(Disciplina disciplina){
        
        for(int i=0;i<disciplinal.size();i++){  //Adicionei um comparador se para conferir se a discplina
                                                //ja existe na hora de salvar            
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(disciplina.getNome())){
                System.out.println("Essa disciplina ja existe:");
                return;
            }    
        }
        disciplinal.add(disciplina);
        System.out.println("size::: "+disciplinal.size());
    }

    @Override
    public void atualizar(String nomeA, String nomeB){
     
        for(int i=0;i<disciplinal.size();i++)
        {
            Disciplina d=disciplinal.get(i);
            if(d.getNome().equals(nomeB));
        }
    }
    
    
    
    @Override //mudar depois para ID
    public void deletar(String nome){
        
        for(int i=0;i<disciplinal.size();i++){
            
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nome))
                disciplinal.remove(d);
        }
    }
    
    public void cadastrarProfessor(String cpf, String nomeD){
        
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                    ProfessorDaoImpl p = new ProfessorDaoImpl();
                    for(int j=0;j<p.professorl.size();j++){
                        if(p.professorl.get(i).getCpf().equals(cpf)){ 
                            d.professoresCpf.add(cpf);
                            return;
                        }
                        else
                           System.out.println("Professor nao encontrado!");
                    }
                   
               }
        }
        System.out.println("Disciplina não encontrada!");
    }
        
    public void excluirProfessor(String cpf, String nomeD){
        
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                   d.professoresCpf.remove(i);
                   return;
               }                 
        }
        System.out.println("Disciplina não encontrada!");
    }
    
    public void imprimirListaProfessor(String nomeD){
        
        ProfessorDaoImpl p = new ProfessorDaoImpl();
        
        for(int i=0;i<disciplinal.size();i++){ 
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nomeD)){
                for(int k=0;k<d.professoresCpf.size();k++)
                {
                    ProfessorDaoImpl professores = new ProfessorDaoImpl();                
                    for(int j=0;j<p.professorl.size();j++){
                        if(professores.professorl.get(i).getCpf().equals(d.professoresCpf.get(i))){ 
                            System.out.println("Profesores:\nNome: " + professores.professorl.get(i).getNome()); 
                        }                        
                    }
                }
                return;
            }
        }
        System.out.println("Disciplina não encontrada!");
    }
    }