
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
    
    @Override
    public void cadastrarProfessor(String cpf, String nomeD){
        
        for(int i=0;i<disciplinal.size();i++){
                Disciplina d = disciplinal.get(i);
               if(d.getNome().equals(nomeD)){
                    ProfessorDaoImpl p = new ProfessorDaoImpl();
                    for(int j=0;j<p.professorl.size();j++){
                        if(p.professorl.get(i).getCpf().equals(cpf)){ 
                            d.professoresCpf.add(cpf);
                            p.professorl.get(i).disciplinas.add(d);
                            return;
                        }
                    }
                   
               }
        }
        System.out.println("Erro ao adicionar Professor!");
    }
    
    @Override
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
    
    @Override
    public void imprimirListaProfessor(String nomeD){
        
        for(int i=0;i<disciplinal.size();i++){ 
            Disciplina d = disciplinal.get(i);
            if(d.getNome().equals(nomeD)){
                for(int k=0;k<d.professoresCpf.size();k++)
                {
                    ProfessorDaoImpl professores = new ProfessorDaoImpl();                
                    for(int j=0;j<professores.professorl.size();j++){
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
    
    @Override
    public void cadastrarTurma(Integer codigoT, String nomeD){
        
        TurmaDaoImpl turma = new TurmaDaoImpl();
        for(int i=0;i<disciplinal.size();i++){
            Disciplina d = disciplinal.get(i);
            if(d.equals(nomeD)){
                for(int j=0;j<turma.turmasl.size();j++){
                    if(codigoT.equals(turma.turmasl.get(j).getCodigo())){
                        d.turmas.add(codigoT);
                        turma.turmasl.get(j).setDisciplina(d);
                        return;
                    }
                }              
                
            }
        }
        System.out.println("Erro disciplina não encontrada!");
    }
    
   @Override
    public void ImprimirTurmas(String nome){
        
        for(int i=0;i<disciplinal.size();i++){
            Disciplina d = disciplinal.get(i);
            if(d.equals(nome)){
                for(int j=0;j<d.turmas.size();j++){
                    System.out.println("Turmas: " + d.turmas.get(j));
                }
            }
        
        }
        System.out.println("Erro disciplina não encontrada!");
    }
    
}