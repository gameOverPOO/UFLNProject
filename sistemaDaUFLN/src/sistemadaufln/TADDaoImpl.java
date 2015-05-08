/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

/**
 *
 * @author poney
 */
public class TADDaoImpl implements TADDao{
    
    private ListaSimples primeira;
    private ListaSimples ultima;
    private int totalDeElementos;
    
    @Override
    public void adiciona(Object elemento){
        
        ListaSimples nova = new ListaSimples(this.primeira, elemento);
        this.primeira = nova;
    
        if(this.totalDeElementos == 0){
            System.out.println("lista vazia");
            this.ultima = this.primeira;
        }
        this.totalDeElementos++;
    }
    
    @Override
    public Object busca(int posicao){
        return null;
    }
    
    @Override
    public void remove(int posicao){
        
    }
    
    @Override
    public boolean contem(Object o){
        return false;
    }
    
}
