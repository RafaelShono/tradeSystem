
# tradeSystem
###"Segundo software feito em Java, ainda preciso melhorar bastante coisa
no entanto, já é possível ver o software em execução parcial, ao baixar o arquivo dentro da pasta "distro" 

Pensando no problema que é conseguir gerar estatisticas baseadas em trades realizados por você, é uma otima alternativa a user Excel, pois saber utilizar comandos em SQL ,
e um banco de dados pode trazer informações valiosas para você. O projeto ainda precisa amadurecer bastante, caso tenha interesse em contribuir ou tirar dúvidas, estou disponíve!

o código para a criação do banco de dados em PostgreSQL, foi utilizado o código a seguir ( provavelmente)

*create table padrao_sistema
id_padrao serial primary key,
nome_padrao Varchar(100),
descricao Varchar(600),

win_loss varchar(100),
pts_favor int,
pts_contra int,
pts_final int,
data_padrao date,
descricao_trade Varchar (600),
tempo_operacao double precision,
gain_financeiro int,
sentindo_se Varchar(100),
candle_fechou boolean,
loss_cedo boolean,
qnt_trade int,
descricao_emocional varchar(100),
confianca_trade  varchar(100),
motivo_fechar varchar(100),
facil_ou_nao varchar (100),
	
mm8 boolean,
mm20 boolean,
tendencia boolean,
trapzone boolean,
volume boolean,
cruza_media boolean

)*
