
package sistemadaufln;

import java.io.IOException;
import java.util.*;

public class TurmaView {
    
    TurmaDao t = new TurmaDaoImpl();
    
    public void subMenu() throws IOException{
        
        
        int sair = 0;
        while(sair==0){
            Scanner leituraMenu= new Scanner(System.in);        
            
            
            
            System.out.println("1. Adicionar Turma");
            System.out.println("2. Alterar Turma");
            System.out.println("3. Remover Turma");
            System.out.println("4. Mostrar todos as Turmas");
            System.out.println("5. Sair");
            

        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 1:{
                System.out.println("Adicionando Turma");
                int adicionar = 1;
                while(adicionar==1){
                    
                     Scanner leitura= new Scanner(System.in);
                     System.out.println("Digite o codigo da Turma: ");
                
                     String codigoTurma = new String();                
                     codigoTurma = leitura.nextLine();
                     
                     Integer codigo = Integer.valueOf(codigoTurma);
                     
                     System.out.println("Digite o ano da Turma: ");
                     String anoT = new String();                
                     anoT = leitura.nextLine();
                     
                     int ano = Integer.parseInt(anoT);
                     
                     System.out.println("Digite o periodo da Turma: ");
                     String periodoT = new String();                
                     periodoT = leitura.nextLine();
                     
                     int periodo = Integer.parseInt(periodoT);
                     
                     
                     System.out.println("Digite o horario das aulas: ");
                     String horarioT = new String();                
                     horarioT = leitura.nextLine();
                     
                                          
                     System.out.println("Digite o numero de vagas: ");
                     String vagasT = new String();                
                     vagasT = leitura.nextLine();
                     
                     int vagas = Integer.parseInt(vagasT);

                    
                     Turma turmateste = new Turma(codigo, ano, periodo, horarioT, vagas);
                     
                    if ((turmateste.getCodigo() != null))
                       t.salvar(turmateste); //testar se é null antes de add
                    
                  
                   System.out.println("Deseja adicionar outra Turma? S ou N");
                   String opcao = new String();
                   opcao = leitura.nextLine();
                   if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
                
                    
                }  
               //
                //Arquivo arquivo = new Arquivo();
                //arquivo.salvarProfessor(listaProfessor);
                break;
            }
            case 2:{
          
                break;
            }
            case 3:{
                System.out.println("Removendo uma turma");
                System.out.println("Digite o codigo da turma a ser deletado: ");
                     Scanner leitura= new Scanner(System.in);
                     String codigoT = new String();                
                     codigoT = leitura.nextLine();
                     
                     Integer codigo = Integer.valueOf(codigoT);
                     
                    t.deletar(codigo);
                break;
            }
             case 4:{
                    System.out.println("Lista de Turmas:");
                    t.imprimirLista();
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

    
}
