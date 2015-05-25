package atividade;


import atividade.AtividadeDaoImpl;
import atividade.AtividadeDao;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



public class AtividadeView {
    
    AtividadeDao a = new AtividadeDaoImpl(); 
    
    public void subMenu() throws IOException{
          
        int sair = 0;
        while(sair==0){
            
            Scanner leituraMenu= new Scanner(System.in);        



            System.out.println("1. Adicionar uma Atividade");
            System.out.println("2. Remover uma Atividade");
            System.out.println("3. Cadastrar um Aluno em uma Atividade");
            System.out.println("4. Excluir um Aluno de uma Atividade");
            System.out.println("5. Imprimir lista de Aluno");
            System.out.println("6. Sair");

            int escolha = leituraMenu.nextInt();
            switch(escolha){
                case 1:{
                    System.out.println("Adicionando uma Atividade");


                    int adicionar = 1;
                    while(adicionar==1){

                         Scanner leitura= new Scanner(System.in);
                         System.out.println("Digite o nome da Atividade: ");

                         String nome = new String();                
                         nome = leitura.nextLine();


                         System.out.println("Digite o tipo: ");
                         String tipo = new String();                
                         tipo = leitura.nextLine();

                         System.out.println("Digite a Data (dd/MM/yyyy): ");
                         String data = new String();
                         data = leitura.nextLine();


                         System.out.println("Digite o valor: ");

                         Double valor = leitura.nextDouble();

                         
                         Atividade atividade = new Atividade(nome,tipo,data,valor);

                         a.salvar(atividade);
                         

                         System.out.println("Deseja adicionar outra atividade? (S/N)");
                         Scanner leituraNova= new Scanner(System.in);
                         String opcao = new String();
                         opcao = leituraNova.nextLine();                   

                         if (opcao.equals("N")||opcao.equals("n")) 
                             adicionar = 0;
                         
                    }
                    break;
                }
                case 2:{
                     System.out.println("Digite o Nome da Atividade a ser deletado: ");
                         Scanner leitura= new Scanner(System.in);
                         String nome = new String();                
                         nome = leitura.nextLine();
                         a.deletar(nome);

                    break;
                }
                case 3:
                {
                    System.out.println("Adicionando um aluno a atividade:");


                    System.out.println("Digite o cpf do Aluno: ");
                         Scanner leitura= new Scanner(System.in); 
                         String cpf = new String();                
                         cpf = leitura.nextLine();


                    System.out.println("Digite a atividade: ");
                         String nome = new String();                
                         nome = leitura.nextLine();

                    a.cadastrarAluno(cpf, nome);
                    break;
                }
                case 4:
                {
                    System.out.println("Excluindo Aluno:");


                    System.out.println("Digite o cpf do Aluno: ");
                         Scanner leitura= new Scanner(System.in); 
                         String cpf = new String();                
                         cpf = leitura.nextLine();


                    System.out.println("Digite o nome da atividade: ");
                         String nome = new String();                
                         nome = leitura.nextLine();

                    a.excluirAluno(cpf, nome);
                    break;
                }
                case 5:
                {
                    System.out.println("Imprimindo lista de alunos");

                     Scanner leitura= new Scanner(System.in);    

                    System.out.println("Digite o nome da atividade: ");
                         String nome = new String();                
                         nome = leitura.nextLine();

                    a.imprimirAlunos(nome);
                    break;
                }
                case 6:{
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
