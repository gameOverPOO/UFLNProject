package atividade;

import disciplina.DisciplinaDaoImpl;
import disciplina.DisciplinaDao;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class AtividadeView {
    DisciplinaDao d = new DisciplinaDaoImpl(); //Se acessar a classe e sair a list muda????
    
      public void subMenu() throws IOException{
       // List<Disciplina> listaDisciplina = new ArrayList<>();
          
        int sair = 0;
        while(sair==0){
        Scanner leituraMenu= new Scanner(System.in);        
        
       
        
        System.out.println("1. Adicionar uma Atividade");
        System.out.println("2. Alterar uma Atividade");
        System.out.println("3. Remover uma Atividade");
        System.out.println("4. Cadastrar um Aluno em uma disciplina");
        System.out.println("5. Excluir um Aluno de uma disciplina");
        System.out.println("6. Imprimir lista de Aluno");
        /*System.out.println("7. Adicionar turma em uma disciplina");
        System.out.println("8. Imprimir turma de uma disciplina");
        System.out.println("9. Sair");*/
        
        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 1:{
                System.out.println("Adicionando uma Atividade");
                
                
                int adicionar = 1;
                while(adicionar==1){
                    
                     Scanner leitura= new Scanner(System.in);
                     System.out.println("Digite o nome da Atividade: ");
                
                     String nomeD = new String();                
                     nomeD = leitura.nextLine();
                     
                    
                     System.out.println("Digite o tipo: ");
                     String tipo = new String();                
                     tipo = leitura.nextLine();
                     
                     System.out.println("Digite a Data (dd/MM/yyy): ");
                     //String tipo = new String();                
                     //tipo = leitura.nextLine();
                     String mm = new String();
                     Date data = new Date();
                     //data = leitura.nextLine().;
                     mm = leitura.nextLine();
                     SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                     
                     
                     try {
                    format.setLenient(false);
                    data = format.parse(mm);
                    } catch (ParseException e) {
                    System.out.println("Data Inválida.");
                    }
                     
                     
                     
                     
                     
                     
                     
                     
                     /*
                     Date data = null;
                    Scanner in = new Scanner(System.in);
                        System.out.println("Digite uma data: ");
                    String _data = in.nextLine();
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                    format.setLenient(false);
                    data = format.parse(_data);
                    } catch (ParseException e) {
                    System.out.println("Data Inválida.");
                    }
                     
                     
                     */
                     
                     
                     System.out.println("Digite o valor: ");
                                     
                     double valor = leitura.nextDouble();
                     
                     System.out.println("Digite o codigo da turma: ");
                     
                     
                     Integer codigoTurma =leitura.nextInt() ;
                     
                     
                     
                     
                     System.out.println("Deseja adicionar outra atividade? (S/N)");
                     String opcao = new String();
                     opcao = leitura.nextLine();                   
                        
                     if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
                     
                     
                     
                     
                }
                     
                     
                  //  Atividade atividadeTeste = new Atividade(nomeD,tipo, data, valor, codigoturma);                               
                     
                 // if ((disciplinaTeste.getNome() != null))
                 // {
                  //    d.salvar(disciplinaTeste);
                      
                //  }
                  
                    
                  // Scanner leitura= new Scanner(System.in);
                  // System.out.println("Deseja adicionar outra disciplina? S ou N");
                   //String opcao = new String();
                   //opcao = leituraNome.nextLine();
                   //if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
                
                    
                //}  
               
                  
                //Arquivo arquivo = new Arquivo();
               // arquivo.salvarDisciplina(listaDisciplina);
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
            }
            case 8:{
                
                System.out.println("Imprimindo turma de uma disciplina");
                
                Scanner leitura= new Scanner(System.in);
                System.out.println("Digite o nome da disciplina:");
                String nomeDisciplina = new String();
                nomeDisciplina = leitura.nextLine();
                
                d.ImprimirTurmas(nomeDisciplina);
                
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

