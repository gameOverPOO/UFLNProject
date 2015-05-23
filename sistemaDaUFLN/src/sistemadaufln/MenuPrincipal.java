
package sistemadaufln;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class MenuPrincipal {

   
    public static void main(String[] args) throws IOException {
      //  static
       // {
        
        
            try{
            FileReader ler = new FileReader("src/arquivos/Arquivos/Alunos.txt");
            //BufferredReader n = new BufferredReader(ler);
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
            
            /*atividade1#atividade2#atividade3 -> dá um split e separa*/
            /*disciplina1#disciplina2#disciplina3*/
            
            
            while(linha!=null)
             {
                 System.out.println("TURN DOWN FOR WHAT??");
                 
                 if ("@{".equals(linha))
               {
                        Aluno aluno = new Aluno();
               
               
                        String nome = lerl.readLine();                     
                        aluno.setNome(nome);
                            
                        String cpf = lerl.readLine();                     
                        aluno.setCpf(cpf);
               
                        System.out.println("NOME CARALEOS: " + aluno.getNome()+ " " + 
                                 aluno.getCpf());
               
                 
                 
                 
                 
               }
                 linha = lerl.readLine();
                
             
                 
                 System.out.println("Wait: " + linha);
                  
                  linha = lerl.readLine();
                  
            
             }
                }
            catch(Exception exception)
                {
                    System.err.println("ferrou");
                
                }
           
               
               
               
               
               
               
               
               
               
               
               
               /*String tar="ouro.diamante.prata";  
                 String s[] = tar.split("\.");  
                 System.out.println(s[0]);  
                 System.out.println(s[1]);  
                 System.out.println(s[2]);*/
               
               
               
               //começa um aluno
                //if (linha=="}") termina o aluno, volta
            
        
            
            
        //}
            
            
        
        
        System.out.println("Lista de opcoes: ");
        System.out.println("1. Aluno");
        System.out.println("2. Professor");
        System.out.println("3. Disciplina");
        System.out.println("4. Turma");
        System.out.println("5. Atividade");
        System.out.println("6. Nota");
        System.out.println("7. Lançar faltas");
        System.out.println("8. Sair");
        
        Scanner leituraMenu = new Scanner(System.in);
        int escolha;
        
        do{
            escolha=leituraMenu.nextInt();
            switch(escolha){
                case 1:{
                    AlunoView alunoView = new AlunoView();
                    alunoView.subMenu();
                    break;
                }
                case 2:{
                    ProfessorView professorView = new ProfessorView();
                    professorView.subMenu();
                    
                    break;
                }
                case 3:{
                    DisciplinaView disciplinaView = new DisciplinaView();
                    disciplinaView.subMenu();                
                    break;
                }
                case 4:{
                    System.out.println("entrar em TurmaView");
                    break;
                }
                case 5:{
                    System.out.println("entrar em AtividadeView");
                    break;
                }
                case 6:{
                    System.out.println("entrar em NotaView");
                    break;
                }
                case 7:{
                    System.out.println("entrar em FaltaView");
                    break;
                }
                case 8:{
                    System.out.println("Saindo...");
                    return;
                }
                default:{
                    System.out.println("Opção Inválida");
                    break;
                }
            }
            
        }while(escolha<1 || escolha>8);
        
        
    }
    
}
