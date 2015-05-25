
package files;



import java.io.File;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import aluno.Aluno;
import professor.Professor;


public class Arquivo {
    boolean file = new File("Arquivos").mkdir();
    
   

    public Arquivo() {
    }

    
    public void salvarAluno(List<Aluno> listaAlunos) throws IOException {
        
        
       try (FileWriter arq = new FileWriter("src/files/Alunos.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            
            for (Aluno s:listaAlunos) {
                gravarArq.printf("@{%n");
                gravarArq.printf(s.getNome()+ "\n" + s.getCpf() + "\n");
                gravarArq.printf("}%n");
            }
       
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo!");        
                    
                    
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
                           
            System.out.println("Salvo No Arquivo!");        
                    
                    
        }
        
        
      
        }

 }

