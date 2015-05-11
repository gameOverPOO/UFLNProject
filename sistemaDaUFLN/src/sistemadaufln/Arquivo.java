/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        
        
        
        
        
        /*
        int i, n = 20;
       
        try (FileWriter arq = new FileWriter("tabuada.txt")) {
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.printf("+--Resultado--+%n");
            for (i=1; i<=10; i++) {
                gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
            }
            gravarArq.printf("+-------------+%n");
            
            arq.close();*/
            
//Leia mais em: Criando e Gravando dados em Txt com Java http://www.devmedia.com.br/criando-e-gravando-dados-em-txt-com-java/23060#ixzz3ZmahPZdD
        }

 }

