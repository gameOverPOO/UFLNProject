/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leandronog
 */
public class ProfessorView {
    List<Professor> listaProfessor = new ArrayList<>();
    
    public void subMenu(){
        
        
        Scanner leituraMenu= new Scanner(System.in);
        
        
        TADDaoImpl listaAluno=new TADDaoImpl();
        
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
                     System.out.println("Digite o cpf do Professor: ");
                     String dep = new String();                
                     dep = leituraDep.nextLine();
                     
                   
                    //Como verifica o cpf antes de criar o aluno??? 
                    
                    Professor professorteste = new Professor(nomeP,cpf,dep);                               
                     
                    if ((professorteste.getNomeProfessor() != null))listaProfessor.add(professorteste);//testar se é null antes de add
                    
                   Scanner leitura= new Scanner(System.in);
                   System.out.println("Deseja adicionar outro Professor? S ou N");
                   String opcao = new String();
                   opcao = leituraNome.nextLine();
                   if (opcao.equals("N")) adicionar = 0;
                
                    
                }  
               for (Professor s:listaProfessores)
                        System.out.println("Aluno: " + s.getNomeProfessor() + " CPF: " + s. getCpfProfessor());  
                  
                Arquivo arquivo = new Arquivo();
                arquivo.salvarAluno(listaAlunos);
                break;
            }
            case 2:{
                System.out.println("Alterando um aluno");
                break;
            }
            case 3:{
                System.out.println("Removendo um aluno");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            
        }
    }
}
