/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leandronog
 */
public class ProfessorView {
    List<Professor> listaProfessor = new ArrayList<>();
    
    public void subMenu() throws IOException{
        
        
        Scanner leituraMenu= new Scanner(System.in);
        
        
        //TADDaoImpl listaAluno=new TADDaoImpl();
        
        System.out.println("1. Adicionar um professor");
        System.out.println("2. Alterar um professor");
        System.out.println("3. Remover um professor");

        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 1:{
                System.out.println("Adicionando um professor");
                int adicionar = 1;
                while(adicionar==1){
                    
                     Scanner leituraNome= new Scanner(System.in);
                     System.out.println("Digite o Nome do Professor: ");
                
                     String nomeP = new String();                
                     nomeP = leituraNome.nextLine();
                     
                     Scanner leituraCpf= new Scanner(System.in);
                     System.out.println("Digite o cpf do Professor: ");
                     String cpf = new String();                
                     cpf = leituraCpf.nextLine();
                     
                     Scanner leituraDep= new Scanner(System.in);
                     System.out.println("Digite o departamento do Professor: ");
                     String dep = new String();                
                     dep = leituraDep.nextLine();
                     
                   
                    //Como verifica o cpf antes de criar o aluno??? 
                    
                    Professor professorteste = new Professor(nomeP,cpf,dep);                               
                     
                    if ((professorteste.getNome()!= null))listaProfessor.add(professorteste);//testar se é null antes de add
                    
                   Scanner leitura= new Scanner(System.in);
                   System.out.println("Deseja adicionar outro Professor? S ou N");
                   String opcao = new String();
                   opcao = leituraNome.nextLine();
                   if (opcao.equals("N")) adicionar = 0;
                
                    
                }  
               for (Professor s:listaProfessor)
                        System.out.println("Professor: " + s.getNome() + " CPF: " 
                                + s. getCpf() + " Dep: "+ s.getDepartamento());  
                  
                Arquivo arquivo = new Arquivo();
                arquivo.salvarProfessor(listaProfessor);
                break;
            }
            case 2:{
                System.out.println("Alterando um professor");
                break;
            }
            case 3:{
                System.out.println("Removendo um professor");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            
        }
    }
}
