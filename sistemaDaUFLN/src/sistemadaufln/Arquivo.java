
package sistemadaufln;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/*SALVAR TODO O OBJETO...ALUNOS COM DISCIPLINAS, PROFESSOREES, ETC*/
//Leia mais em: Criando e Gravando dados em Txt com Java http://www.devmedia.com.br/criando-e-gravando-dados-em-txt-com-java/23060#ixzz3ZmaRAJIh

public class Arquivo {
    boolean file = new File("Arquivos").mkdir();
    
    
    
    
    /*
    @ ->> alunos
    # -> nome
    & -> cpf
    $ -> turmas    
    ? -> atividades
    
    
    
    
    
    
    
    
    
    */

    public Arquivo() {
    }

    
    public void salvarAluno(List<Aluno> listaAlunos) throws IOException {
        
        
       try (FileWriter arq = new FileWriter("src/arquivos/Arquivos/Alunos.txt",true)) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.printf("@{%n");
            for (Aluno s:listaAlunos) {
                gravarArq.printf(s.getNome()+ "\n" + s.getCpf() + "\n");
            }
            gravarArq.printf("}%n");
            
            //gravarArq.printf("%n");
            
            
            
            
            //
            
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo!");        
                    
                    
        }
    }
        
        public void salvarProfessor(List<Professor> listaProfessores) throws IOException {
        
        
       try (FileWriter arq = new FileWriter("teste arquivo.txt",true)) {//Esse true faz com q nao apague o q tava antes
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.printf("+--Resultado--+%n");
            for (Professor s:listaProfessores) {
                gravarArq.printf("Nome: " + s.getNome()+ " CPF: " + s.getCpf() +
                        " Departamento: " +s.getDepartamento() + "\n");
            }
            gravarArq.printf("+-------------+%n");
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo!");        
                    
                    
              
        
        }
        
        
      
        }

 }

