package POJOs;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

@Entity

public class Aluno {
    
  //  @Id
   // @GeneratedValue
   // private int matricula;
    @Id
    private Long cpf;
    private String nome;    
    @OneToMany(cascade = CascadeType.ALL) //Estudar para a entrevista
    private List<Turma> turmas = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<Atividade> atividades = new ArrayList<>();
   

    public List<Atividade> getAtividades() {
       return atividades;
    }

    public List<Turma> getTurmas() {
       return turmas;
    }

   

    public Aluno() {
    }
    
    
    
    //Métodos 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
       
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }




public Aluno(String nome, Long cpf) {
   
    if(validarCPF(cpf)) //Só cria um aluno se o cpf for valido.
    {
        this.nome = nome;
        this.cpf=cpf;
    }
   
        
        
}


public boolean validarCPF(Long CPFi) {
   String CPF= Long.toString(CPFi);
     // considera-se erro CPF's formados por uma sequencia de numeros iguais
    if (CPF.equals("00000000000") || CPF.equals("11111111111") ||
        CPF.equals("22222222222") || CPF.equals("33333333333") ||
        CPF.equals("44444444444") || CPF.equals("55555555555") ||
        CPF.equals("66666666666") || CPF.equals("77777777777") ||
        CPF.equals("88888888888") || CPF.equals("99999999999") ||
       (CPF.length() != 11))        
       return(false); 

    char dig10, dig11;
    int sm, i, r, num, peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
    try {
// Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 10;
      for (i=0; i<9; i++) {              
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0         
// (48 eh a posicao de '0' na tabela ASCII)         
        num = (int)(CPF.charAt(i) - 48); 
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig10 = '0';
      else dig10 = (char)(r + 48); // converte no respectivo caractere numerico

// Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 11;
      for(i=0; i<10; i++) {
        num = (int)(CPF.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso - 1;
      }

      r = 11 - (sm % 11);
      if ((r == 10) || (r == 11))
         dig11 = '0';
      else dig11 = (char)(r + 48);

// Verifica se os digitos calculados conferem com os digitos informados.
      if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }
  

  public static String imprimirCPF(String CPF) {
    return(CPF.substring(0, 3) + "." + CPF.substring(3, 6) + "." +
      CPF.substring(6, 9) + "-" + CPF.substring(9, 11));
  }

   
}

