/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.math.BigDecimal;
 import java.sql.Date;

/**
 *
 * @author suporte
 */
public class InfoTrade {
    
   
    public int id;
    private int qntContratos;
    private String winLoss;
    private int ptsFavor;
    private int ptsContra;
    private int ptsFinal;
    private Date dataHora;
    private String descricao;
    private String horaOpera;
    private String tempoOp;

   
   // private double gainFinanceiro;
    BigDecimal gainFinanceiro = new BigDecimal(0);
   
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getQntContratos(){
     return qntContratos;
  }
  public void setQntContratos(int qntContratos){
  
   this.qntContratos = qntContratos;
  }
  
     public String isWinLoss() {
        return winLoss;
    }

    /**
     *
     * @param winLoss
     */
    public void setWinloss(String winLoss){
   
   this.winLoss = winLoss;
   }
  
  public int getPtsFavor(){
     return ptsFavor;
  }
  public void setPtsFavor(int ptsFavor){
  
   this.ptsFavor = ptsFavor;
  }
    public int getPtsContra(){
     return ptsContra;
  }
  public void setPtsContra(int ptsContra){
  
   this.ptsContra = ptsContra;
  }
   public int getPtsFinal(){
     return ptsFinal;
  }
  public void setPtsFinal(int ptsFinal){
  
   this.ptsFinal = ptsFinal;
  }
  public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
     public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   public String getHoraOpera() {
        return horaOpera;
    }
   
    /**
     *
     * @param minutos
     */
    public void setHoraOpera(String horaOpera){
   
   this.horaOpera = horaOpera;
       
   }
    
    public  String getTempoOp(){
        return tempoOp;
    }
    
     public  void setTempoOp(String tempoOp){
        this.tempoOp = tempoOp;
    }
   public  BigDecimal getGainFinanceiro(){
   
   return gainFinanceiro;    
   }  
    
   public void setGainFinanceiro(BigDecimal gainFinanceiro){
       
       this.gainFinanceiro = gainFinanceiro;
       
   }

    
    
}
