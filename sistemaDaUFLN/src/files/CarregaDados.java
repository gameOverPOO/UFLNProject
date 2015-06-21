
package files;

import DAOsImpl.ProfessorDaoImpl;
import POJOs.Professor;
import DAOsImpl.DisciplinaDaoImpl;
import POJOs.Disciplina;
import DAOsImpl.AlunoDaoImpl;
import POJOs.Aluno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import POJOs.Turma;
import DAOsImpl.TurmaDaoImpl;


public class CarregaDados {
    /*static
    {
         System.out.println("Carregado do arquivo!");
    }
    
    public boolean carregarAlunos(){
        
        
        
        
        try{
            FileReader ler = new FileReader("src/files/Alunos.txt");
            //BufferredReader n = new BufferredReader(ler);
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
          
            
           
            while(linha!=null)
             {
                 
                 
                 if ("@{".equals(linha))
               {
                        Aluno aluno = new Aluno();
               
               
                        String nome = lerl.readLine();                     
                        aluno.setNome(nome);
                            
                        String cpf = lerl.readLine();                     
                        aluno.setCpf(cpf);
               
                        /*System.out.println("Aluno: " + aluno.getNome()+ " " + 
                                 aluno.getCpf());*/
                        
                        
        /*                AlunoDaoImpl a = new AlunoDaoImpl();
                        a.salvar(aluno);
               
                 
               }
                 linha = lerl.readLine();
                
            
             }
                }
            catch(Exception exception)
                {
                    System.err.println("Erro!");
                
                }
           
             
        
        return false;
        
        
        
    }
    
    
    public boolean carregarProfessores(){
        
        
        
        try{
            FileReader ler = new FileReader("src/files/Professores.txt");
            
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
          
            
            while(linha!=null)
             {
                 
                 
                 if ("P{".equals(linha))
               {
                        Professor professor = new Professor();
               
               
                        String nome = lerl.readLine();                     
                        professor.setNome(nome);
                            
                        String cpf = lerl.readLine();                     
                        professor.setCpf(cpf);
               
                        /*System.out.println("Professor: " + professor.getNome()+ " " + 
                                 professor.getCpf());*/
                        
                        
          /*              ProfessorDaoImpl p = new ProfessorDaoImpl();
                        p.salvar(professor);
               
                 
               }
                 linha = lerl.readLine();
                
                            
            
             }
                }
            catch(Exception exception)
                {
                    System.err.println("Erro");
                
                }
           
        
        return false;
        
    
    }
    
    public boolean carregarDisciplinas(){
        
        
        
        try{
            FileReader ler = new FileReader("src/files/Disciplinas.txt");
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
            
             
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
                        
                         
                        
                        String professorescpfs = new String();
                        professorescpfs = lerl.readLine();
                        String s[] = professorescpfs.split("&");
                        
                        List<String> listacpfs = new ArrayList<>();
                        for(int i = 0; i<s.length;i++){
                                
                                
                                listacpfs.add(s[i]);
                                
                        }
                        
                        
                        
                        
                        Disciplina.professoresCpf = listacpfs;
                     
        
                        
                        /*System.out.println("Disciplina: " + disciplina.getNome()+ " " + 
                                 disciplina.getEmenta());*/
                        
                        
                        
                        
         /*               DisciplinaDaoImpl p = new DisciplinaDaoImpl();
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

      
    
    

    
    
    









public boolean carregarTurmas(){
        
        
        
        try{
            FileReader ler = new FileReader("src/files/Turmas.txt");
            BufferedReader lerl = new BufferedReader(ler);
        
            String linha = lerl.readLine();
            
             
            while(linha!=null)
             {
                 
                 
                 if ("T{".equals(linha))
               {
                   
                        Turma turma = new Turma();
               
               
                        String codigos = lerl.readLine();
                        int codigo = Integer.parseInt(codigos);
                        turma.setCodigo(codigo);
                            
                        String anos = lerl.readLine();
                        int ano = Integer.parseInt(anos);
                        turma.setAno(ano);
                        
                        String periodos = lerl.readLine();
                        int periodo = Integer.parseInt(periodos);
                        turma.setPeriodo(periodo);
                        
                        String horario = lerl.readLine();
                        turma.setHorario(horario);
                            
                        
        
                        
                        /*System.out.println("Turma: " + turma.getCodigo()+ " " + 
                                 turma.getHorario());*/
                        
                        
                        
             /*           TurmaDaoImpl p = new TurmaDaoImpl();
                        p.salvar(turma);
               
                 
                 
                 
                 
               }
                 linha = lerl.readLine();
                
                            
            
             }
        }
                
            catch(Exception exception)
                {
                    System.err.println("Erro: "+exception);
                
                }
           
        
        return false;
        */
    
    

      
    
    
}
    



    
    
    
    
    
    
    
    
     

