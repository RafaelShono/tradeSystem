/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;
import java.sql.Connection;
import  java.sql.Date;
import java.sql.PreparedStatement;
import modelo.AspeEmocional;
import modelo.Padrao;
import modelo.Confluencia;
import modelo.InfoTrade;


/**
 *
 * @author suporte
 */ 
public class PadraoDAO {
   /* public void gravar(Padrao padrao) throws Exception {
       
            inserir(padrao);
        /* else {
           alterar(pessoa);
        }
    }
*/
    public void inserir(Padrao padrao, InfoTrade infotrade,AspeEmocional asp, Confluencia conf) throws Exception {
        String sql = "insert into padrao_sistema "
                + "(nome_padrao, descricao, qnt_contratos, win_loss, pts_favor, pts_contra, pts_final, gain_financeiro, data_trade,"
                + "hora_operacao, tempo_operacao, descricao_trade, motivo_fechar, candle_fechou, qnt_trade, sentindo_se, descricao_emocional,"
                + "medos_comuns, final_sem_meta, mm20, mm200, trapzone, tendencia, volume, conve_timeframe,"
                + "fibo_grafico, opiniao_mercado, descricao_conf)"
                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement consulta = Conexao.getConexao().prepareStatement(sql);
        

        consulta.setString(1,padrao.getNome());
        consulta.setString(2,padrao.getDescricao());
        // INFOTRADE
        consulta.setInt(3, infotrade.getQntContratos());
        consulta.setString(4, infotrade.isWinLoss());
        consulta.setInt(5, infotrade.getPtsFavor());
        consulta.setInt(6, infotrade.getPtsContra());
        consulta.setInt(7, infotrade.getPtsFinal());
        consulta.setBigDecimal(8, infotrade.getGainFinanceiro());
        consulta.setDate(9, new java.sql.Date(infotrade.getDataHora().getTime()));
        consulta.setString(10, infotrade.getHoraOpera());
        consulta.setString(11, infotrade.getTempoOp());
        consulta.setString(12, infotrade.getDescricao());
        
        consulta.setString(13,asp.getMotivoFechar()); // <- futuras modificações alter essa variavel para INFOTRADE
       
        //ASPE EMOCIONAL
        consulta.setBoolean(14,asp.getCandleF());
        consulta.setInt(15, asp.getMaisDe1());
        consulta.setString(16, asp.getSentDuranteTrade());
        consulta.setString(17,asp.getDescricao());
        consulta.setString(18, asp.getMedosComuns());
        consulta.setString(19, asp.getFinSemMeta());
       // consulta.setString(20, asp.getStopDisciplina());
   
       
        //CONFLUENCIA
        consulta.setBoolean(20,conf.isMm20());
        consulta.setBoolean(21,conf.isMm200());
        consulta.setBoolean(22,conf.isTrapZone());
        consulta.setBoolean(23,conf.isTendencia());
        consulta.setBoolean(24,conf.isVolume());
        consulta.setBoolean(25,conf.isConvTimeFrame());
        consulta.setBoolean(26, conf.isFiboGrafico());
        consulta.setString(27, conf.getOpiniaoMercado());
        consulta.setString(28, conf.getDescricao());
               
        consulta.executeUpdate();//Roda o insert no BD
    }

    
}
