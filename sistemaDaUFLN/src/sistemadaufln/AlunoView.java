/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
/**
 *
 *
 * @author poney
 */
public class AlunoView {
    
    
    public void subMenu() throws IOException{
        List<Aluno> listaAlunos = new ArrayList<>();
        int sair = 0;
        while(sair==0){
        Scanner leituraMenu= new Scanner(System.in);        
        
       
        
        System.out.println("1. Adicionar um aluno");
        System.out.println("2. Alterar um aluno");
        System.out.println("3. Remover um aluno");
        System.out.println("4. Sair");
        
        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 1:{
                System.out.println("Adicionando um aluno");
                
                
                int adicionar = 1;
                while(adicionar==1){
                    
                     Scanner leituraNome= new Scanner(System.in);
                     System.out.println("Digite o Nome do Aluno: ");
                
                     String nomeP = new String();                
                     nomeP = leituraNome.nextLine();
                     
                     Scanner leituraCpf= new Scanner(System.in);
                     System.out.println("Digite o cpf do Aluno: ");
                     String cpf = new String();                
                     cpf = leituraCpf.nextLine();
                     
                   
                    //Como verifica o cpf antes de criar o aluno??? 
                    
                    Aluno alunoteste = new Aluno(nomeP,cpf);                               
                     
                    if ((alunoteste.getNomeAluno() != null))listaAlunos.add(alunoteste);//testar se é null antes de add
                    
                   Scanner leitura= new Scanner(System.in);
                   System.out.println("Deseja adicionar outro aluno? S ou N");
                   String opcao = new String();
                   opcao = leituraNome.nextLine();
                   if (opcao.equals("N")) adicionar = 0;
                
                    
                }  
               for (Aluno s:listaAlunos)
                        System.out.println("Aluno: " + s.getNomeAluno() + " CPF: " + s. getCpfAluno());  
                  
                Arquivo arquivo = new Arquivo();
                arquivo.salvarAluno(listaAlunos);
                break;
            }
            case 2:{
                System.out.println("Alterando um aluno");
                 System.out.println("Digite o Nome do Aluno: ");
                 Scanner leituraNome= new Scanner(System.in);
                 String nomeP = new String();                
                 nomeP = leituraNome.nextLine();
                 
            /*      
            for (Endereco end : enderecos) {  
                if (end.getId().intValue() == endereco.getId()) {  
                    enderecos.remove(end);  
                    enderecos.add(endereco);  
                }   
            }  */ /// Usar SET AQUI PARA ATUALIZAR
                 
                 
                 
                 
                 for (Aluno s:listaAlunos)
                 
                        System.out.println("Aluno: " + s.getNomeAluno() + " CPF: " + s. getCpfAluno());  
               
                
                
                break;
               
            }
            case 3:{
                /*
                for (Aluno f:listaAlunos)
                        System.out.println("Aluno: " + f.getNomeAluno() + " CPF: " + f. getCpfAluno());
                
                 System.out.println("Digite o Nome do Aluno: ");
                 
                 Scanner leituraNome= new Scanner(System.in);
                 String nomeP = new String();                
                 nomeP = leituraNome.nextLine();
                 
                   System.out.println("Excluir: "+ nomeP);
                 for (Aluno s: listaAlunos)
                     if (s.getNomeAluno().equals(nomeP)) listaAlunos.remove(s);
                  
                 
                 
                 //System.out.println("Excluido");
                break;*/
            }
            case 4:
            {
                sair = 1;
                break;
            }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            
        }
        }
    }
    
}
