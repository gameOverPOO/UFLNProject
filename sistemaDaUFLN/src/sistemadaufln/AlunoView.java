
package sistemadaufln;
import files.Arquivo;
import java.io.IOException;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

    //USAR NOMES MELHORES NAS VARIAVES/OBJETOS!!
 
public class AlunoView {
     AlunoDao a = new AlunoDaoImpl(); //TÁ ERRADO ISSO
    
    public void subMenu() throws IOException{
      
        int sair = 0;
        while(sair==0){
            Scanner leituraMenu= new Scanner(System.in);        
            
            
            
            System.out.println("1. Adicionar um aluno");
            System.out.println("2. Alterar um aluno");
            System.out.println("3. Remover um aluno");
            //System.out.println("4. Buscar dados de um aluno");
            System.out.println("5. Mostrar todos os alunos");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.println("4. Sair");
            
            int escolha = leituraMenu.nextInt();
            switch(escolha){ //TRATAR ENTRADA DE STRING INVES DE NUMB
                case 1:{
                    
                    
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
                //ATUALIZAÇÃO OK! //TEM QUE SER POR CPF E MANDAR O ALUNO!
                case 2:{
                    System.out.println("Alterando um aluno");
                    
                    System.out.println("Digite o Nome do Aluno: ");
                    Scanner leitura= new Scanner(System.in);
                    String nomeA = new String();                
                    nomeA = leitura.nextLine();
                    
                    System.out.println("Digite o  Novo Nome do Aluno: ");                 
                    String nomeN = new String();                
                    nomeN = leitura.nextLine();
                    
                    
                    
                    
                    
                    a.atualizar(nomeA,nomeN);
                   
                    break;
                }
                //DELETAR OK! FALTA MANDAR SER PELO CPF!
                case 3:{
                     System.out.println("Digite o Nome do Aluno a ser deletado: ");
                     Scanner leitura= new Scanner(System.in);
                     String nomeD = new String();                
                     nomeD = leitura.nextLine();
                     a.deletar(nomeD);
                     
                     
                    break;
                }
                
                case 4:{
                //IMPLEMENTAR BUSCA DE ALUNO AQUI
                    
                    
                    
                    
                    Arquivo arquivo = new Arquivo();
                    try {
                           arquivo.salvarAluno(AlunoDaoImpl.alunosl);
                     } catch (IOException ex) {
                         System.out.println("MORRI:");
                         Logger.getLogger(AlunoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                    
                     }
                    sair = 1;
                    break;
                }
                case 5:{
                    System.out.println("Lista de alunos:");
                    a.imprimirLista();
                    break;
                }
                case 6:{
                    //fazer voltar ao MenuPrincipal
                    // acho que só dá certo se a classe retornar alguma coisa
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

