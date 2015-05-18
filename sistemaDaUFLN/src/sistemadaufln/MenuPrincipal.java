
package sistemadaufln;


import java.io.IOException;
import java.util.Scanner;


public class MenuPrincipal {

   
    public static void main(String[] args) throws IOException {
        
        
        
        System.out.println("Lista de opcoes: ");
        System.out.println("1. Cadastrar aluno");
        System.out.println("2. Cadastrar professor");
        System.out.println("3. Cadastrar disciplina");
        System.out.println("4. Cadastrar turma");
        System.out.println("5. Cadastrar atividade");
        System.out.println("6. Lançar nota");
        System.out.println("7. Lançar faltas");
        
        Scanner leituraMenu = new Scanner(System.in);
        int escolha=leituraMenu.nextInt();
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
            default:{
                System.out.println("Opção Inválida");
                break;
            }
        }
        
    }
    
}
