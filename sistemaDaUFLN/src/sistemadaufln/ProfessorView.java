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
                List<Professor> listaProfessores = new ArrayList<>();
                
                Professor professorteste = new Professor("Leandro Prof","14638431780","DCEL");                               
                Professor professorteste2 = new Professor("João Prof","53460466235","DCEL");  
                listaProfessores.add(professorteste);//testar se é null antes de add
                listaProfessores.add(professorteste2);
              
               // if (alunoteste.validarCPF(alunoteste.getCpf()))
                //    listaAlunos.add(alunoteste);
                    
               // else 
               //     System.out.println("CPF INVALIDO :'( ");
                    
                /*
                if (alunoteste2.validarCPF(alunoteste2.getNomeAluno()))
                   ;
                else 
                    System.out.println("CPF INVALIDO :'( ");
                
                */
               for (Professor s: listaProfessores)
                        System.out.println("Professor: " + s.getNomeProfessor() + " CPF: " + s.getCpfProfessor());  
                
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
