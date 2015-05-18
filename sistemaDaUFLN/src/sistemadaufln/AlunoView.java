
package sistemadaufln;
import java.io.IOException;

import java.util.*;


 
public class AlunoView {
    
    
    public void subMenu() throws IOException{
       
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
                
                //CADASTRO OK!
                System.out.println("Adicionando um aluno");
                
                
                int adicionar = 1;
                while(adicionar==1){
                    
                     Scanner leitura= new Scanner(System.in);
                     
                     System.out.println("Digite o Nome do Aluno: ");                
                     String nomeP = new String();                
                     nomeP = leitura.nextLine();
                     
                     
                     System.out.println("Digite o cpf do Aluno: ");
                     String cpf = new String();                
                     cpf = leitura.nextLine();
                     
                   
                    
                    Aluno alunoteste = new Aluno(nomeP,cpf);                               
                     
                    if ((alunoteste.getNome() != null)) 
                    {
                        AlunoDao a = new AlunoDaoImpl();
                        a.salvar(alunoteste);
                        a.imprimirLista();
                        
                    };
                   
                   
                   System.out.println("Deseja adicionar outro aluno? (S/N)");
                   String opcao = new String();
                   opcao = leitura.nextLine();                   
                   
                   if (opcao.equals("N")) adicionar = 0;
                   
                
                    
                }  
                
                //Arquivo arquivo = new Arquivo();
                //arquivo.salvarAluno(listaAlunos);
                break;
            }
             case 2:{
                System.out.println("Alterando um aluno");
                 System.out.println("Digite o Nome do Aluno: ");
                 Scanner leitura= new Scanner(System.in);
                 String nomeA = new String();                
                 nomeA = leitura.nextLine();
                 
                 System.out.println("Digite o  Novo Nome do Aluno: ");
                 
                 Scanner leituras= new Scanner(System.in);
                 String nomeN = new String();                
                 nomeN = leituras.nextLine();
                 
                  AlunoDao a = new AlunoDaoImpl();
                 
                
                  
                  a.atualizar(nomeA,nomeN);
                 
                 
                         
                         
                 break;
             }

            case 3:{
                 System.out.println("Digite o Nome do Aluno a ser deletado: ");
                 Scanner leitura= new Scanner(System.in);
                 String nomeD = new String();                
                 nomeD = leitura.nextLine();
                 
                break;

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

