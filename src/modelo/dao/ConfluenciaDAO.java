/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;
import java.sql.PreparedStatement;
import modelo.Confluencia;

/**
 *
 * @author suporte
 */
public class ConfluenciaDAO {
 public void gravar(Confluencia confluencia) throws Exception {
        if (confluencia.getId() == 0) {
            inserir(confluencia);
        }/* else {
            alterar(produto);
        }*/
    }
     private void inserir(Confluencia confluencia) throws Exception {
        String sql = "insert into confluencia (mm8,mm20,mm200,tendencia,trapzone,volume,cruza_media) values (?,?,?,?,?,?,?) ";
        PreparedStatement consulta = Conexao.getConexao().prepareStatement(sql);
      
        consulta.setBoolean(2,  confluencia.isMm20());
        consulta.setBoolean(3, confluencia.isMm200());
        consulta.setBoolean(4,confluencia.isTrapZone());
    
        consulta.setBoolean(6,confluencia.isTendencia());
        consulta.setBoolean(7,confluencia.isVolume());
        consulta.setString(7,confluencia.getDescricao());
        consulta.executeUpdate();
        
      
     }    
}
