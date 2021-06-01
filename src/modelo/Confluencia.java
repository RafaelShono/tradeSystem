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
public class Confluencia {
   
    private int id;
    private boolean mm200;
    private boolean mm20;
   
    private boolean trapZone;
    private boolean tendencia;
    private boolean volume;
    private boolean convTimeFrame;
    private boolean fiboGrafico;
    private String  descricao;
    private String opiniaoMercado;
   
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     *
     * @return
     */
  
  public boolean isMm200() {
        return mm200;
    }
   
  public void setMm200(boolean mm20){
   
   this.mm200 = mm200;
   }
  
  public boolean isMm20() {
        return mm20;
    }
   
  public void setMm20(boolean mm20){
   
   this.mm20 = mm20;
   }
  

   public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
     public boolean isTrapZone() {
        return trapZone;
    }
   
  public void setTrapZone(boolean trapZone){
   
   this.trapZone = trapZone;
   }
   public boolean isVolume() {
        return volume;
    }
   
  public void setVolume(boolean volume){
   
   this.volume = volume;
   }
  
  public  boolean isTendencia() {
        return tendencia;
    }

    public void setTendencia(boolean tendencia) {
        this.tendencia = tendencia;
    }
    
      public  boolean isConvTimeFrame() {
        return convTimeFrame;
    }

    public void setConvTimeFrame(boolean convTimeFrame) {
        this.convTimeFrame = convTimeFrame;
    }
    
     public  boolean isFiboGrafico() {
        return fiboGrafico;
    }

    public void setFiboGrafico(boolean fiboGrafico) {
        this.fiboGrafico = fiboGrafico;
    }
    
    
    public String getOpiniaoMercado() {
        return opiniaoMercado;
    }

    public void setOpiniaoMercado(String opiniaoMercado) {
        this.opiniaoMercado = opiniaoMercado;
    }
    
}
