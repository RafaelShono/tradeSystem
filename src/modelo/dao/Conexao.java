/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author suporte
 */
public class Conexao {
    private static Connection conexao;
    
    public static Connection getConexao() throws Exception {
        if (conexao == null){
           Class.forName("org.postgresql.Driver"); 
           conexao = DriverManager.getConnection(
                   "jdbc:postgres://zsonwpms:TTtjveM1mJx9Me9Fmg7ibPx0frhOr8CC@motty.db.elephantsql.com:5432/zsonwpms ", //URL
                   "zsonwpms", //LOGIN
                   "TTtjveM1mJx9Me9Fmg7ibPx0frhOr8CC"); //SENHA
           
          }
        return conexao;
    
    }
    
}
