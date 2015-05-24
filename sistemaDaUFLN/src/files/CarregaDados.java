
package files;

import java.io.BufferedReader;
import java.io.FileReader;
import sistemadaufln.*;


public class CarregaDados {
    
    
    public boolean carregarAlunos(){
        
        
        
        try{
            FileReader ler = new FileReader("src/files/Alunos.txt");
            //BufferredReader n = new BufferredReader(ler);
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
          
            
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
           
               
        
        
        
        
        
        
        
        
        
        return false;
        
        
        
    }
    
    
    public boolean carregarProfessores(){
        
        
        
        try{
            FileReader ler = new FileReader("src/files/Professores.txt");
            //BufferredReader n = new BufferredReader(ler);
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
          
            
            //FAZER ISSO NA CLASSE CARREGAARQUIVO! //COM OUTROS DADOS
            while(linha!=null)
             {
                 
                 
                 if ("P{".equals(linha))
               {
                        Professor professor = new Professor();
               
               
                        String nome = lerl.readLine();                     
                        professor.setNome(nome);
                            
                        String cpf = lerl.readLine();                     
                        professor.setCpf(cpf);
               
                        System.out.println("Professor: " + professor.getNome()+ " " + 
                                 professor.getCpf());
                        
                        
                        ProfessorDaoImpl p = new ProfessorDaoImpl();
                        p.salvar(professor);
               
                 
                 
                 
                 
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
           
               
        
        
        
        
        
        
        
        
        
        return false;
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }   
}
