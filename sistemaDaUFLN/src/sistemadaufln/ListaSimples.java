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

//ListaSimples = Celula
public class ListaSimples {
    private ListaSimples proxima;
    private Object elemento;
    
    public ListaSimples(ListaSimples proxima, Object elemento){
        this.proxima=proxima;
        this.elemento=elemento;
    }
    
    public ListaSimples(Object elemento){
        this.elemento=elemento;
    }
    public void setProxima(ListaSimples proxima){
        this.proxima=proxima;
    }
    public ListaSimples getProxima(){
        return proxima;
    }
    public Object getElemento(){
        return elemento;
    }
}
