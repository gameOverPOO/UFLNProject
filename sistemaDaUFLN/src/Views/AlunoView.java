package Views;



import DAOsImpl.AlunoDaoImpl;
import DAOs.AlunoDao;
import aluno.Aluno;
import aluno.Aluno;
import files.SalvaDados;
import java.io.IOException;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

   
 
public class AlunoView {
     AlunoDao a = new AlunoDaoImpl(); 
    
    public void subMenu() throws IOException{
      
        int sair = 0;
        while(sair==0){
            Scanner leituraMenu= new Scanner(System.in);        
            
            
            
            System.out.println("1. Adicionar um aluno");
            System.out.println("2. Alterar um aluno");
            System.out.println("3. Remover um aluno");
            System.out.println("5. Mostrar todos os alunos");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.println("4. Sair");
            //mais um
            int escolha = leituraMenu.nextInt();
            int adicionar = 1;
            switch(escolha){ 
                
                case 1:{
                    
                    
                    System.out.println("Adicionando um aluno");
                    
                    
                    
                    while(adicionar==1){
                        
                        
                        Scanner leitura= new Scanner(System.in);
                        
                        System.out.println("Digite o Nome do Aluno: ");                
                        String nomeP = new String();                
                        nomeP = leitura.nextLine();
                        
                        
                        System.out.println("Digite o cpf do Aluno: ");
                        String cpf = new String();                
                        cpf = leitura.nextLine();
                        
                        
                        
                        Aluno alunoteste = new Aluno(nomeP,cpf);                               
                        
                        if ((alunoteste.getNome() != null)){
                            
                            a.salvar(alunoteste);
                            a.imprimirLista();
                            
                        }
                        
                        
                        System.out.println("Deseja adicionar outro aluno? (S/N)");
                        String opcao = new String();
                        opcao = leitura.nextLine();                   
                        
                        if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
                        
                    }
                    
                    break;
                }
                case 2:{
                    System.out.println("1. Alterar um aluno\n2. Alterar um cpf");
                    Scanner opAltera= new Scanner(System.in);
                    int opcaoAltera= opAltera.nextInt();
                    
                    System.out.println("Digite o Nome do Aluno: ");
                    Scanner leitura= new Scanner(System.in);
                    String nomeA = new String();                
                    nomeA = leitura.nextLine();
                    
                    if(opcaoAltera==1){
                        System.out.println("Digite o  Novo Nome do Aluno: ");                 
                        String nomeN = new String();                
                        nomeN = leitura.nextLine();
                        a.atualizar(nomeA,nomeN, 1);
                    }
                    else{
                        System.out.println("Digite o  Novo CPF do Aluno: ");                 
                        String cpfN = new String();
                        cpfN = leitura.nextLine();
                        a.atualizar(nomeA, cpfN, 2);
                        
                    }                                       
                    break;
                }
                case 3:{
                     System.out.println("Digite o Nome do Aluno a ser deletado: ");
                     Scanner leitura= new Scanner(System.in);
                     String nomeD = new String();                
                     nomeD = leitura.nextLine();
                     a.deletar(nomeD);
                     
                     
                    break;
                }
                
                case 4:{
                
                    sair = 1;
                    break;
                }
                case 5:{
                    System.out.println("Lista de alunos:");
                    a.imprimirLista();
                    break;
                }
                case 6:{
                    
                    adicionar = 0;
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

