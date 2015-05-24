
package sistemadaufln;


import files.Arquivo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import files.CarregaDados;

public class MenuPrincipal {

   
    public static void main(String[] args) throws IOException {
      //  static
       // {
        
        
        CarregaDados begin = new CarregaDados();
        
         boolean a = begin.carregarAlunos();   
         if (a) System.out.println("NAOOOO!!! ");

               
       
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
                        TurmaView turmaView = new TurmaView();
                        turmaView.subMenu();
                        break;
                    }
                    case 5:{
                        AtividadeView atividadeView = new AtividadeView();
                        atividadeView.subMenu();
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
                         Arquivo arquivo = new Arquivo();
                        try {
                               arquivo.salvarAluno(AlunoDaoImpl.alunosl);
                         } catch (IOException ex) {
                             System.out.println("MORRI:");
                             Logger.getLogger(AlunoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        try {
                               arquivo.salvarProfessor(ProfessorDaoImpl.professorl);
                         } catch (IOException ex) {
                             System.out.println("MORRI:");
                             Logger.getLogger(AlunoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        
                        
                        
                        
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
