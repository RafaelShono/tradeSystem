/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author suporte
 */
public class Padrao {
   
    
    private int id;
    private String nome;
    private String descricao;
    private Confluencia confluencia;
    private InfoTrade infotrade;
    
    
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    
    }
    public void setNome(String nome){
       
      this.nome = nome;
    
    }
    
    public String getDescricao(){
        return descricao;
        
    }

    /**
     *
     * @param descricao
     */
    public void setDescricao(String descricao){
    
    this.descricao = descricao;
    }
     public Confluencia getConfluencia() {
        return confluencia;
    }

    public void setConfluencia(Confluencia confluencia) {
        this.confluencia = confluencia;
    }
    public Confluencia getInfoTrade() {
        return confluencia;
    }

    public void setInfoTrade(InfoTrade infotrade) {
        this.infotrade = infotrade;
    }
    
    
    

    
}
