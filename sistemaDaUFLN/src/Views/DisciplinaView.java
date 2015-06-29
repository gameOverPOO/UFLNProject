package Views;

import DAOsImpl.DisciplinaDaoImpl;
import DAOs.DisciplinaDao;
import POJOs.Disciplina;
import POJOs.Professor;
import POJOs.Turma;
import java.io.IOException;
import java.util.*;



public class DisciplinaView {/*
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
        System.out.println("9. Voltar");
        
        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 0:{                
                sair = 1;
                break;
            }
            case 1:{
                while(adicionarDisciplina()==1);                
                break;
            }
            case 2:{
                alterarDisciplina();
                break;
               
            }
            case 3:{
                removerDisciplina();
                break;
            }
            case 4:{
                adicionarProfessorDisciplina();
                break;
            }
            case 5:{
                removerProfessorDisciplina();
                break;
            }
            case 6:{
                imprimirProfessorDisciplina();
                break;
            }
            case 7:{
                adicionarTurmaDisciplina();
                break;
            }
            case 8:{
                imprimirTurmaDisciplina();   
                break;
                
            }
            
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            
        }
        }
    }
    public int adicionarDisciplina(){
        System.out.println("Adicionando uma disciplina");
                
        int adicionar = 1;
                    
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
                     
        if ((disciplinaTeste.getNome() != null)){
            d.salvar(disciplinaTeste);          
            }
                    
        Scanner leitura= new Scanner(System.in);
        System.out.println("Deseja adicionar outra disciplina? S ou N");
        String opcao = new String();
        opcao = leituraNome.nextLine();
        if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
        return adicionar;
                    
    }  
    public void alterarDisciplina(){
        
        System.out.println("Alterando uma disciplina");
        System.out.println("Digite o Nome da disciplina: ");
        Scanner leitura= new Scanner(System.in);
        String nomeD = new String();                
        nomeD = leitura.nextLine();
                 
        System.out.println("Digite o  Novo Nome da Disciplina: ");                 
        String nomeN = new String();                
        nomeN = leitura.nextLine();
        Disciplina disciplinaD = new Disciplina();
        Disciplina disciplinaN = new Disciplina();
        disciplinaD.setNome(nomeD);
        disciplinaN.setNome(nomeN);
                   
        d.atualizar(disciplinaD,disciplinaN);
                
    }
    public void removerDisciplina(){
        
        System.out.println("Digite o Nome da Disciplina a ser removido: ");
        Scanner leitura= new Scanner(System.in);
        String nomeD = new String();                
        nomeD = leitura.nextLine();
        Disciplina disciplinaD = new Disciplina();
        disciplinaD.setNome(nomeD);
        d.deletar(disciplinaD);
    }
    public void adicionarProfessorDisciplina(){
        System.out.println("Adicionando um professor na disciplina:");
        
        System.out.println("Digite o cpf do Professor: ");
        Scanner leitura= new Scanner(System.in); 
        String cpf = new String();                
        cpf = leitura.nextLine();
                     
                 
        System.out.println("Digite a disciplina: ");
        String nome = new String();                
        nome = leitura.nextLine();
        Professor professord = new Professor();
        professord.setCpf(cpf);
        professord.setNome(nome);
        d.cadastrarProfessor(professord);
    }
    public void removerProfessorDisciplina(){
        
        System.out.println("Excluindo professor:");
                
                
        System.out.println("Digite o cpf do Professor: ");
        Scanner leitura= new Scanner(System.in); 
        String cpf = new String();                
        cpf = leitura.nextLine();
        Professor professorD = new Professor();
        professorD.setCpf(cpf);
        System.out.println("Digite a disciplina: ");
        String nome = new String();                
        nome = leitura.nextLine();
        Disciplina disciplinaD = new Disciplina();
        disciplinaD.setNome(nome);
        d.excluirProfessor(professorD, disciplinaD);
    }
    public void imprimirProfessorDisciplina(){
        System.out.println("Imprimindo lista de professores");
                
        Scanner leitura= new Scanner(System.in);    
                 
        System.out.println("Digite a disciplina: ");
        String nome = new String();                
        nome = leitura.nextLine();
        Disciplina disciplina = new Disciplina();
                
        d.imprimirListaProfessor(disciplina);
    }
    public void adicionarTurmaDisciplina(){
        
        System.out.println("Adicionando turma em uma disciplina");
                
        Scanner leitura= new Scanner(System.in);
        System.out.println("Digite o codigo da turma:");
        String codigoTurma = new String();
        codigoTurma = leitura.nextLine();
                
        Integer codigo = Integer.valueOf(codigoTurma);
        Turma turma = new Turma();
        turma.setCodigo(codigo);
        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = new String();
        nomeDisciplina = leitura.nextLine();
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nomeDisciplina);
        d.cadastrarTurma(turma, disciplina);
    }
    public void imprimirTurmaDisciplina(){
        System.out.println("Imprimindo turma de uma disciplina");
                
        Scanner leitura= new Scanner(System.in);
        System.out.println("Digite o nome da disciplina:");
        String nomeDisciplina = new String();
        nomeDisciplina = leitura.nextLine();
                
        Disciplina disciplina = new Disciplina();
        d.ImprimirTurmas(disciplina);
    }*/
}

