/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


//Leia mais em: Criando e Gravando dados em Txt com Java http://www.devmedia.com.br/criando-e-gravando-dados-em-txt-com-java/23060#ixzz3ZmaRAJIh

public class Arquivo {

    public Arquivo() {
    }

    /**
     * @param listaAlunos
     * @throws java.io.IOException
     */

    public void salvarAluno(List<Aluno> listaAlunos) throws IOException {
        
        
       try (FileWriter arq = new FileWriter("teste arquivo.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.printf("+--Resultado--+%n");
            for (Aluno s:listaAlunos) {
                gravarArq.printf("Nome: " + s.getNomeAluno()+ " CPF: " + s.getCpfAluno() + "\n");
            }
            gravarArq.printf("+-------------+%n");
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo!");        
                    
                    
              
        
        }
    }
        
        public void salvarProfessor(List<Professor> listaProfessores) throws IOException {
        
        
       try (FileWriter arq = new FileWriter("teste arquivo.txt",true)) {//Esse true faz com q nao apague o q tava antes
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.printf("+--Resultado--+%n");
            for (Professor s:listaProfessores) {
                gravarArq.printf("Nome: " + s.getNomeProfessor()+ " CPF: " + s.getCpfProfessor() +
                        " Departamento: " +s.getDepartamentoProfessor() + "\n");
            }
            gravarArq.printf("+-------------+%n");
            
            arq.close();
                           
            System.out.println("Salvo No Arquivo!");        
                    
                    
              
        
        }
        
        
      
        }

 }

