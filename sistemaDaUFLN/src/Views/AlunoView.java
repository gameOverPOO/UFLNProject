package Views;



import DAOsImpl.AlunoDaoImpl;
import DAOs.AlunoDao;
import POJOs.Aluno;
import POJOs.Aluno;

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
            
            
            System.out.println("0. Voltar");
            
            int escolha = leituraMenu.nextInt();
            int adicionar = 1;
            switch(escolha){ 
                case 0:{
                    sair = 1;
                    break;
                }
                case 1:{                    
                    while(adicionarAluno()==1);                      
                    break;
                }
                case 2:{
                    alterarAluno();              
                    break;
                }
                case 3:{                    
                    removerAluno();                     
                    break;
                }
                
                case 4:{
                    System.out.println("Lista de alunos:");
                    a.imprimirLista();
                    break;
                }
                
                default:{
                    System.out.println("Opção Inválida");
                    break;
                }
                
            }

            

        }
    }
    public int adicionarAluno(){
        System.out.println("Adicionando um aluno");
        int adicionar=1;
        Scanner leitura= new Scanner(System.in);
                        
                        System.out.println("Digite o Nome do Aluno: ");                
                        String nomeP = new String();                
                        nomeP = leitura.nextLine();
                        
                        
                        System.out.println("Digite o CPF do Aluno: ");                        
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
                     
        return adicionar;

    }
    
    public void alterarAluno(){
         System.out.println("1. Alterar um aluno\n2. Alterar um cpf");
                    Scanner opAltera= new Scanner(System.in);
                    int opcaoAltera= opAltera.nextInt();
                    
                    System.out.println("Digite o Nome do Aluno: ");
                    Scanner leitura= new Scanner(System.in);
                    String nomeA = new String();                
                    nomeA = leitura.nextLine();
                    Aluno alunoA = new Aluno();
                    alunoA.setNome(nomeA);
                    
                    if(opcaoAltera==1){
                        System.out.println("Digite o  Novo Nome do Aluno: ");                 
                        String nomeN = new String();                
                        nomeN = leitura.nextLine();
                        Aluno alunoN = new Aluno();
                        alunoN.setNome(nomeN);
                        
                        a.atualizar(alunoA,alunoN, 1);
                    }
                    else{
                        
                        //alterar o CPF nao funciona
                        
                        System.out.println("Digite o  Novo CPF do Aluno: ");                 
                        String cpfN = new String();
                        cpfN = leitura.nextLine();
                        Aluno alunod = new Aluno();
                        alunod.setCpf(cpfN);
                                               
                        a.atualizar(alunoA,alunod, 2);
                        
                    }  
    }
    public void removerAluno(){
        System.out.println("Digite o Nome do Aluno a ser removido: ");
        Scanner leitura= new Scanner(System.in);
        String nomeD = new String();                
        nomeD = leitura.nextLine();
        Aluno alunod = new Aluno();
        alunod.setNome(nomeD);
        a.deletar(alunod);
    }
}