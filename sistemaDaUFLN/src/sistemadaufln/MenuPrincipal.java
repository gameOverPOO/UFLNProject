
package sistemadaufln;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MenuPrincipal {

   
    public static void main(String[] args) throws IOException {
      //  static
       // {
        
        
            try{
            FileReader ler = new FileReader("src/files/Alunos.txt");
            //BufferredReader n = new BufferredReader(ler);
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
            
            /*atividade1#atividade2#atividade3 -> dá um split e separa*/
            /*disciplina1#disciplina2#disciplina3*/
            
            
             /*Como usar o split:
            String tar="ouro.diamante.prata";  
                 String s[] = tar.split("\.");  
                 System.out.println(s[0]);  
                 System.out.println(s[1]);  
                 System.out.println(s[2]);*/
               
            
            
            //FAZER ISSO NA CLASSE CARREGAARQUIVO! //COM OUTROS DADOS
            while(linha!=null)
             {
                 
                 
                 if ("@{".equals(linha))
               {
                        Aluno aluno = new Aluno();
               
               
                        String nome = lerl.readLine();                     
                        aluno.setNome(nome);
                            
                        String cpf = lerl.readLine();                     
                        aluno.setCpf(cpf);
               
                        System.out.println("Aluno: " + aluno.getNome()+ " " + 
                                 aluno.getCpf());
                        
                        
                        AlunoDaoImpl a = new AlunoDaoImpl();
                        a.salvar(aluno);
               
                 
                 
                 
                 
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
           
               
               
               
              
               
               
               //começa um aluno
                //if (linha=="}") termina o aluno, volta
            
        
            
            
        //}
            
       int sair=0;     
        
        while(sair==0){
            
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
                        /* Arquivo arquivo = new Arquivo();
                        try {
                               arquivo.salvarAluno(AlunoDaoImpl.alunosl);
                         } catch (IOException ex) {
                             System.out.println("MORRI:");
                             Logger.getLogger(AlunoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                        }*/
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
    
}
