
package Views;

import DAOsImpl.ProfessorDaoImpl;
import DAOs.ProfessorDao;
import POJOs.Professor;
import java.io.IOException;
import java.util.*;
import POJOs.Professor;


public class ProfessorView {
    
    ProfessorDao p = new ProfessorDaoImpl();
    
    public void subMenu() throws IOException{
        
        
        int sair = 0;
        while(sair==0){
            Scanner leituraMenu= new Scanner(System.in);        
            
            
            
            System.out.println("1. Adicionar um Professor");
            System.out.println("2. Alterar um Professor");
            System.out.println("3. Remover um Professor");
            System.out.println("4. Mostrar todos os Professores");
            System.out.println("5. Sair");
            

        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 1:{
                while(adicionarProfessor()==1);
                break;
            }
            case 2:{
                alterarProfessor();
                break;
            }
            case 3:{
                removerProfessor();
                break;
            }
             case 4:{
                    System.out.println("Lista de Professores:");
                    p.imprimirLista();
                    break;
                }
             case 5:{
                 sair=1;
                 break;
             }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            
        }
    }
    }
    public int adicionarProfessor(){
        System.out.println("Adicionando um professor");
        int adicionar = 1;
                
                    
        Scanner leitura= new Scanner(System.in);
        System.out.println("Digite o Nome do Professor: ");
                
        String nomeP = new String();                
        nomeP = leitura.nextLine();
                     
                     
        System.out.println("Digite o cpf do Professor: ");
        String cpf = new String();                
        cpf = leitura.nextLine();
                     
              
        System.out.println("Digite o departamento do Professor: ");
        String dep = new String();                
        dep = leitura.nextLine();
        Professor professorteste = new Professor(nomeP,cpf,dep);
                     
        if ((professorteste.getNome()!= null))p.salvar(professorteste);//testar se é null antes de add
                    
                  
        System.out.println("Deseja adicionar outro Professor? S ou N");
        String opcao = new String();
        opcao = leitura.nextLine();
        if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
                
        return adicionar;
    }
    
    public void alterarProfessor(){
        
        System.out.println("Alterando um professor");
                  
                    
        System.out.println("Digite o Nome do Professor: ");
        Scanner leitura= new Scanner(System.in);
        String nomeA = new String();                
        nomeA = leitura.nextLine();
                    
        System.out.println("Digite o  novo Nome do Professor: ");                 
        String nomeN = new String();                
        nomeN = leitura.nextLine();
        p.atualizar(nomeA, nomeN);
    }
    public void removerProfessor(){
        
        System.out.println("Removendo um professor");
        System.out.println("Digite o Nome do Professor a ser Removido: ");
        Scanner leitura= new Scanner(System.in);
        String nomeD = new String();                
        nomeD = leitura.nextLine();
        p.deletar(nomeD);
    }
}