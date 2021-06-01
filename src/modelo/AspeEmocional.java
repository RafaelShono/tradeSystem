/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rafael
 */
public class AspeEmocional {
   // private int id;
  
    private boolean candleFechou;
    private int maisDe1;
    private String sentDuranteTrade;
    private String descricao;
    private String motivoFechar;
    private String medosComuns;
    private String finSemMeta;
    private String metaContinuou;
    private String stopDisciplina;
   
     public String getSentDuranteTrade(){
        return sentDuranteTrade;
    }
    public void setSentDuranteTrade(String sentDuranteTrade ){
        this.sentDuranteTrade = sentDuranteTrade;
    }
     
    
    public boolean getCandleF(){
        return candleFechou;
    }
    public void setCandleF(boolean candleFechou){
        this.candleFechou = candleFechou;
    }
     public int getMaisDe1(){
        return maisDe1;
    }
    public void setMaisDe1( int maisDe1){
        this.maisDe1 = maisDe1;
    }
   
     public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao){
       this.descricao = descricao;
    }
    
      public String getMotivoFechar(){
        return motivoFechar;
    }
    public void setMotivoFechar(String motivoFechar){
       this.motivoFechar = motivoFechar;
    }
    
     public String getMedosComuns(){
        return medosComuns;
    }
    
    public void setMedosComuns(String medosComuns){
        this.medosComuns = medosComuns;
    }
    
    public String getFinSemMeta(){
        return finSemMeta;
    }
    
    public void setFinSemMeta(String finSemMeta ){
        this.finSemMeta = finSemMeta;
    }
    
    public String getMetaContinuou(){
        return metaContinuou;
    }
    
    public void setMetaContinuou(String metaContinuou ){
        this.metaContinuou = metaContinuou;
    }
    
    public String getStopDisciplina(){
        return stopDisciplina;
    }
    
    public void setStopDisciplina(String stopDisciplina ){
        this.stopDisciplina = stopDisciplina;
    }
    
    
    
  
    
}
