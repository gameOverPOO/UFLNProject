
package sistemadaufln;


import java.util.*;


public class TurmaDaoImpl implements TurmaDao{
    
     public List<Turma> turmasl = new ArrayList<Turma>();
    @Override
    public void salvar(Turma turma){
        
        //Como verificar se a turma já existe? pelo disci, periodo?
        turmasl.add(turma);
        System.out.println("size::: "+turmasl.size());
        
    }
    
    @Override
    public void atualizar(String nomeA, String nomeN){
       /*for (Iterator<Turma> it = turmasl.iterator(); it.hasNext();) {
            Turma t = it.next();
            if(t.getNome().equals(nomeA)) p.setNome(nomeN);
        }
       this.imprimirLista();  */ //ATUALIZAR OQ?
        
    }
    
    @Override
    public void deletar(Integer codigo){
        
        for(int i=0;i<turmasl.size();i++){
            if(turmasl.get(i).getCodigo().equals(codigo)){
                turmasl.remove(i);
            }
        }
    }
   
    @Override
    public void imprimirLista(){
        
        for (Turma t:turmasl)
                        System.out.println("Codigo: " + t.getCodigo() + " Periodo: " + t.getPeriodo() + " Horario: " + t.getHorario() + " Vagas: " + t.getVagas());  
    }
    
}
