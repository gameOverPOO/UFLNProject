package Views;

import DAOsImpl.DisciplinaDaoImpl;
import DAOs.DisciplinaDao;
import POJOs.Disciplina;
import POJOs.Disciplina;
import java.io.IOException;
import java.util.*;



public class DisciplinaView {
    DisciplinaDao d = new DisciplinaDaoImpl(); 
    
      public void subMenu() throws IOException{
       
          
        int sair = 0;
        while(sair==0){
        Scanner leituraMenu= new Scanner(System.in);        
        
       
        
        System.out.println("1. Adicionar uma disciplina");
        System.out.println("2. Alterar uma disciplina");
        System.out.println("3. Remover uma disciplina");
        System.out.println("4. Cadastrar um professor em uma disciplina");
        System.out.println("5. Excluir um professor de uma disciplina");
        System.out.println("6. Imprimir lista de professores");
        System.out.println("7. Adicionar turma em uma disciplina");
        System.out.println("8. Imprimir turma de uma disciplina");
        System.out.println("9. Sair");
        
        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 1:{
                System.out.println("Adicionando uma disciplina");
                
                
                int adicionar = 1;
                while(adicionar==1){
                    
                     Scanner leituraNome= new Scanner(System.in);
                     System.out.println("Digite o nome da disciplina: ");
                
                     String nomeD = new String();                
                     nomeD = leituraNome.nextLine();
                     
                     Scanner leituraEmenta= new Scanner(System.in);
                     System.out.println("Digite a ementa: ");
                     String ementa = new String();                
                     ementa = leituraEmenta.nextLine();
                     
                     Scanner leituraCarga= new Scanner(System.in);
                     System.out.println("Digite a carga horaria: ");
                     int carga = 0;                
                     carga = leituraCarga.nextInt();
                                         
                    Disciplina disciplinaTeste = new Disciplina(nomeD,ementa, carga);                               
                     
                  if ((disciplinaTeste.getNome() != null))
                  {
                      d.salvar(disciplinaTeste);
                      
                  }
                  
                    
                   Scanner leitura= new Scanner(System.in);
                   System.out.println("Deseja adicionar outra disciplina? S ou N");
                   String opcao = new String();
                   opcao = leituraNome.nextLine();
                   if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
                
                    
                }  
               
                  
                
                break;
            }
            case 2:{
                System.out.println("Alterando uma disciplina");
                 System.out.println("Digite o Nome da disciplina: ");
                 Scanner leitura= new Scanner(System.in);
                 String nomeD = new String();                
                 nomeD = leitura.nextLine();
                 
                 System.out.println("Digite o  Novo Nome da Disciplina: ");                 
                    String nomeN = new String();                
                    nomeN = leitura.nextLine();
                   d.atualizar(nomeD,nomeN);
                 
                 
               
                break;
               
            }
            case 3:{
                 System.out.println("Digite o Nome da Disiclina a ser deletado: ");
                     Scanner leitura= new Scanner(System.in);
                     String nomeD = new String();                
                     nomeD = leitura.nextLine();
                     d.deletar(nomeD);
               
                break;
            }
            case 4:
            {
                System.out.println("Adicionando um professor na disciplina:");
                
                
                System.out.println("Digite o cpf do Professor: ");
                     Scanner leitura= new Scanner(System.in); 
                     String cpf = new String();                
                     cpf = leitura.nextLine();
                     
                 
                System.out.println("Digite a disciplina: ");
                     String nome = new String();                
                     nome = leitura.nextLine();
                
                d.cadastrarProfessor(cpf, nome);
                break;
            }
            case 5:
            {
                System.out.println("Excluindo professor:");
                
                
                System.out.println("Digite o cpf do Professor: ");
                     Scanner leitura= new Scanner(System.in); 
                     String cpf = new String();                
                     cpf = leitura.nextLine();
                     
                 
                System.out.println("Digite a disciplina: ");
                     String nome = new String();                
                     nome = leitura.nextLine();
                
                d.excluirProfessor(cpf, nome);
                break;
            }
            case 6:
            {
                System.out.println("Imprimindo lista de professores");
                
                 Scanner leitura= new Scanner(System.in);    
                 
                System.out.println("Digite a disciplina: ");
                     String nome = new String();                
                     nome = leitura.nextLine();
                
                d.imprimirListaProfessor(nome);
                break;
            }
            case 7:{
                
                System.out.println("Adicionando turma em uma disciplina");
                
                Scanner leitura= new Scanner(System.in);
                System.out.println("Digite o codigo da turma:");
                String codigoTurma = new String();
                codigoTurma = leitura.nextLine();
                
                Integer codigo = Integer.valueOf(codigoTurma);
                
                System.out.println("Digite o nome da disciplina:");
                String nomeDisciplina = new String();
                nomeDisciplina = leitura.nextLine();
                
                d.cadastrarTurma(codigo, nomeDisciplina);
                break;
            }
            case 8:{
                
                System.out.println("Imprimindo turma de uma disciplina");
                
                Scanner leitura= new Scanner(System.in);
                System.out.println("Digite o nome da disciplina:");
                String nomeDisciplina = new String();
                nomeDisciplina = leitura.nextLine();
                
                d.ImprimirTurmas(nomeDisciplina);
                break;
                
            }
            case 9:
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

