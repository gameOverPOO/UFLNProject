/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadaufln;

import java.util.Date;

/**
 *
 * @author Natália
 */
 
 /*CRIAR CLASSES ATIVIDADEVIEW, ATIVIDADEADO E ATIVIDADEDAO IMPL*/
 
 
 /*CRIAR CONTRUTOR*/
public class Atividade {
    private String nomeAtividade;
    private String tipoAtividade;
    private Date dataAtividade;
    private double valorAtividade;

    
    public String getNomeAtividade() {
        return nomeAtividade;
    }

   
    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

   
    public String getTipoAtividade() {
        return tipoAtividade;
    }

   
    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    
    public Date getDataAtividade() {
        return dataAtividade;
    }

   
    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    
    public double getValorAtividade() {
        return valorAtividade;
    }

   
    public void setValorAtividade(double valorAtividade) {
        this.valorAtividade = valorAtividade;
    }
    
}
