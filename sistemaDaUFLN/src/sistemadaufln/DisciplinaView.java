package sistemadaufln;

import java.io.IOException;
import java.util.*;



public class DisciplinaView {
    
      public void subMenu() throws IOException{
        List<Disciplina> listaDisciplina = new ArrayList<>();
        int sair = 0;
        while(sair==0){
        Scanner leituraMenu= new Scanner(System.in);        
        
       
        
        System.out.println("1. Adicionar uma disciplina");
        System.out.println("2. Alterar uma disciplina");
        System.out.println("3. Remover uma disciplina");
        System.out.println("4. Sair");
        
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
                                         
                    Disciplina disciplinaTeste = new Disciplina(nomeD,ementa);                               
                     
                  if ((disciplinaTeste.getNome() != null))
                  {
                      
                  }
                  
                    
                   Scanner leitura= new Scanner(System.in);
                   System.out.println("Deseja adicionar outra disciplina? S ou N");
                   String opcao = new String();
                   opcao = leituraNome.nextLine();
                   if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
                
                    
                }  
               for (Disciplina s:listaDisciplina)
                        System.out.println("Disciplina: " + s.getNome() + " ementa: " + s.getEmenta());  
                  
                Arquivo arquivo = new Arquivo();
               // arquivo.salvarDisciplina(listaDisciplina);
                break;
            }
            case 2:{
                System.out.println("Alterando uma disciplina");
                 System.out.println("Digite o Nome da disciplina: ");
                 Scanner leituraNome= new Scanner(System.in);
                 String nomeD = new String();                
                 nomeD = leituraNome.nextLine();
                 
                 
                 
                 for (Disciplina s:listaDisciplina)
                 
                        System.out.println("Disciplina: " + s.getNome() + " Ementa: " + s. getEmenta());  
               
                break;
               
            }
            case 3:{
               
                break;
            }
            case 4:
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

