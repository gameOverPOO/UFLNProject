/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;
import java.util.Scanner;
/**
 *
 * @author poney
 */
public class AlunoView {
    
    public void subMenu(){
        
        Scanner leituraMenu= new Scanner(System.in);
        int escolha = leituraMenu.nextInt();
        
        
        System.out.println("1. Adicionar um aluno");
        System.out.println("2. Alterar um aluno");
        System.out.println("3. Remover um aluno");

        switch(escolha){
            case 1:{
                System.out.println("Adicionando um aluno");
                break;
            }
            case 2:{
                System.out.println("Alterando um aluno");
                break;
            }
            case 3:{
                System.out.println("Removendo um aluno");
                break;
            }
            default:{
                System.out.println("Opção Inválida");
                break;
            }
            
        }
        
    }
    
}
