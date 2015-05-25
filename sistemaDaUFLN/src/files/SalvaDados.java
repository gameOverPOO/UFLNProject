
package files;



import professor.Professor;
import java.io.File;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import aluno.Aluno;
import disciplina.Disciplina;
import sistemadaufln.*;
import turma.Turma;

/*SALVAR TODO O OBJETO...ALUNOS COM DISCIPLINAS, PROFESSOREES, ETC*/
//Leia mais em: Criando e Gravando dados em Txt com Java http://www.devmedia.com.br/criando-e-gravando-dados-em-txt-com-java/23060#ixzz3ZmaRAJIh

public class SalvaDados {
    boolean file = new File("Arquivos").mkdir();
    
    /*Salva assim:
       @{   //Começa aluno
        Leandro
        14638431780
        
        atividade1#atividade2#atividade3 -> dá um split e separa
        disciplina1#disciplina2#disciplina3
        }   //termina aluno
    */
    
    
    
    
    /*  @{
        Leandro
        14638431780
        }*/

    public SalvaDados() {
    }

    
    public void salvarAluno(List<Aluno> listaAlunos) throws IOException {
        
        
       try (FileWriter arq = new FileWriter("src/files/Alunos.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            
            for (Aluno s:listaAlunos) {
                gravarArq.printf("@{%n");
                gravarArq.printf(s.getNome()+ "\n" + s.getCpf() + "\n");
                gravarArq.printf("}%n");
            }
            
            
            //gravarArq.printf("%n");
            
            
            
            
            //
            
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo! Alun");        
                    
                    
        }
    }
        
        public void salvarProfessor(List<Professor> listaProfessores) throws IOException {
        
        
        try (FileWriter arq = new FileWriter("src/files/Professores.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            
            for (Professor s:listaProfessores) {
                gravarArq.printf("P{%n");
                gravarArq.printf(s.getNome()+ "\n" + s.getCpf() + "\n");
                gravarArq.printf("}%n");
            }
            
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo! Prof");        
                    
                    
        }
        
        
      
        }
        
        public void salvarDisciplina(List<Disciplina> listaDisciplinas) throws IOException {
        
        
        try (FileWriter arq = new FileWriter("src/files/Disciplinas.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            
            for (Disciplina s:listaDisciplinas) {
                gravarArq.printf("D{%n");
                gravarArq.printf(s.getNome()+ "\n" + s.getEmenta() + "\n" + s.getCargaHorariaDisciplina() + "\n");
                for(String a: s.professoresCpf){                     
                      gravarArq.printf(a);
                      gravarArq.printf("&");
                    
                    
                }
                gravarArq.printf("\n");
                
                for(int b: s.turmas ){   
                    gravarArq.print(b);                      
                    gravarArq.printf("#");
                    
                }
                    
                    
                gravarArq.printf("}%n");
                //salvar listass
            }
            
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo! Disc");        
                    
                    
        }
        //return false;
        
        
      
        }

        
        
        

public void salvarTurma(List<Turma> listaTurmas) throws IOException {
        
            if (listaTurmas==null)  System.out.println("NULOOOOOOOOOOOO");
        
        try (FileWriter arq = new FileWriter("src/files/Turmas.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            
            for (Turma s:listaTurmas) {
                gravarArq.printf("T{%n");
                gravarArq.printf( s.getCodigo() + "\n"+ s.getAno()+"\n"+  s.getPeriodo() + "\n" + s.getHorario() + "\n" );
                
                
                for(String b: s.atividades ){   
                    gravarArq.print(b);                      
                    gravarArq.printf("#");
                    
                }
                
                gravarArq.printf("}%n");
            }
            
           arq.close();
                           
            System.out.println("Salvo No Arquivo! Turma");    
        }
    }

        

}

