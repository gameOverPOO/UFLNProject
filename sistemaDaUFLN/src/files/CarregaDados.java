
package files;

import professor.ProfessorDaoImpl;
import professor.Professor;
import disciplina.DisciplinaDaoImpl;
import disciplina.Disciplina;
import aluno.AlunoDaoImpl;
import aluno.Aluno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import sistemadaufln.*;


public class CarregaDados {
    static
    {
         System.out.println("Carregado do arquivo:");
    }
    
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
                
                            
            
             }
                }
            catch(Exception exception)
                {
                    System.err.println("ferrou");
                
                }
           
        
        return false;
        
    
    }
    
    public boolean carregarDisciplinas(){
        
        
        
        try{
            FileReader ler = new FileReader("src/files/Disciplinas.txt");
            //BufferredReader n = new BufferredReader(ler);
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
            
             
            //FAZER ISSO NA CLASSE CARREGAARQUIVO! //COM OUTROS DADOS
            while(linha!=null)
             {
                 
                 
                 if ("D{".equals(linha))
               {
                   
                        Disciplina disciplina = new Disciplina();
               
               
                        String nome = lerl.readLine();                     
                        disciplina.setNome(nome);
                            
                        String ementa = lerl.readLine();                     
                        disciplina.setEmenta(ementa);
                        
                        int carga = Integer.parseInt( lerl.readLine());                         
                        disciplina.setCargaHorariaDisciplina(carga);
                        
                            /*String tar=""ouro.diamante.prata"";  
                                String s[] = tar.split(".\s*");  
                                System.out.println(s[0]);  */
                        
                        String professorescpfs = new String();
                        professorescpfs = lerl.readLine();
                        String s[] = professorescpfs.split("&");
                        
                        List<String> listacpfs = new ArrayList<>();
                        for(int i = 0; i<s.length-1;i++){
                                System.out.println(s[i]);
                                System.out.println("foi");
                                listacpfs.set(i, s[i]);
                        }
                                
                        
                        Disciplina.professoresCpf = listacpfs;
                     
        
                        
                        System.out.println("..Disciplina: " + disciplina.getNome()+ " " + 
                                 disciplina.getEmenta());
                        
                        
                        
                        
                        DisciplinaDaoImpl p = new DisciplinaDaoImpl();
                        p.salvar(disciplina);
               
                 
                 
                 
                 
               }
                 linha = lerl.readLine();
                
                            
            
             }
        }
                
            catch(Exception exception)
                {
                    System.err.println("Erro: "+exception);
                
                }
           
        
        return false;
        
    
    
    
    
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }   

