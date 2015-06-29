
package Views;

import DAOsImpl.TurmaDaoImpl;
import DAOs.TurmaDao;
import java.io.IOException;
import java.util.*;
import POJOs.Turma;

public class TurmaView {
    
    TurmaDao turmaDao = new TurmaDaoImpl();
    
    public void subMenu() throws IOException{
        
        
        int sair = 0;
        while(sair==0){
            Scanner leituraMenu= new Scanner(System.in);        
            
            
            
            System.out.println("1. Adicionar Turma");
            System.out.println("2. Remover Turma");
            System.out.println("3. Mostrar todos as Turmas");
            System.out.println("4. Cadastrar Aluno");
            System.out.println("5. Cadastrar Professor");
            System.out.println("6. Lista de Aluno");
            System.out.println("7. Lista de Professres");
            System.out.println("8. Adicionar Atividade");
            System.out.println("0. Voltar");
            

        int escolha = leituraMenu.nextInt();
        switch(escolha){
            case 0:{
                 sair=1;
                 break;
            }
            case 1:{
                while(adicionarTurma()==1);
               
                //Arquivo arquivo = new Arquivo();
                //arquivo.salvarProfessor(listaProfessor);
                break;
            }
            case 2:{
                removerTurma();
                break;
            }
             case 3:{
                System.out.println("Lista de Turmas:");
                turmaDao.imprimirLista();
                break;
                }
             case 4:{
                adicionarAlunoTurma();
                break;
             }
             case 5:{
                adicionarProfessorTurma(); 
                break;
             }
             case 6:{
                imprimirAlunoTurma();
                break;
                 
             }
             case 7:{
                 imprimirProfessorTurma();
                 break;
                 
             }
             case 8:{
                 
                 adicionarAtividadeTurma();
                 break;
                 
                 
             }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            
        }
    }
    }
    
    public int adicionarTurma(){

        System.out.println("Adicionando Turma");
        int adicionar = 1;
               
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
            turmaDao.salvar(turmateste); //testar se é null antes de add
                    
                  
        System.out.println("Deseja adicionar outra Turma? S ou N");
        String opcao = new String();
        opcao = leitura.nextLine();
        if (opcao.equals("N")||opcao.equals("n")) adicionar = 0;
        return adicionar;
    }
    public void removerTurma(){
        
        System.out.println("Digite o codigo da turma a ser Removido: ");
        Scanner leitura= new Scanner(System.in);
        String codigoT = new String();                
        codigoT = leitura.nextLine();
                     
        Integer codigo = Integer.valueOf(codigoT);
                     
        turmaDao.deletar(codigo);
    }
    
    public void adicionarAlunoTurma(){
        
        System.out.println("Adicionando Aluno:");
                 
        System.out.println("Digite o cpf do aluno:");
        Scanner leitura= new Scanner(System.in);
        String cpf = new String();                
        cpf = leitura.nextLine();
                 
        System.out.println("Digite o codigo da Turma: ");
                
        String codigoTurma = new String();                
        codigoTurma = leitura.nextLine();
                     
        Integer codigo = Integer.valueOf(codigoTurma);
                 
        
                     
    }
    public void adicionarProfessorTurma(){
        
        System.out.println("Cadastrando Professor:");
                 
        System.out.println("Digite o cpf do professor:");
        Scanner leitura= new Scanner(System.in);
        String cpf = new String();                
        cpf = leitura.nextLine();
                 
        System.out.println("Digite o codigo da Turma: ");
                
        String codigoTurma = new String();                
        codigoTurma = leitura.nextLine();
                     
        Integer codigo = Integer.valueOf(codigoTurma);
                 
        turmaDao.cadastrarProfessor(cpf, codigo);        
    }
    public void imprimirAlunoTurma(){
        Scanner leitura= new Scanner(System.in);
        System.out.println("Digite o codigo da Turma: ");
                
        String codigoTurma = new String();                
        codigoTurma = leitura.nextLine();
                     
        Integer codigo = Integer.valueOf(codigoTurma);
                 
        turmaDao.imprimirAlunos(codigo);         
    }
    public void imprimirProfessorTurma(){
        Scanner leitura= new Scanner(System.in);
        System.out.println("Digite o codigo da Turma: ");
                
        String codigoTurma = new String();                
        codigoTurma = leitura.nextLine();
                     
        Integer codigo = Integer.valueOf(codigoTurma);
                 
        turmaDao.imprimirProfessores(codigo);
    }
    public void adicionarAtividadeTurma(){
        Scanner leitura= new Scanner(System.in);
        System.out.println("Digite o codigo da Turma: ");
                
        String codigoTurma = new String();                
        codigoTurma = leitura.nextLine();
                     
        Integer codigo = Integer.valueOf(codigoTurma);
                 
        System.out.println("Digite o nome da atividade: ");
        String nome = new String();                
        nome = leitura.nextLine();
                 
        turmaDao.atividade(nome, codigo);
    }
    

    
}
