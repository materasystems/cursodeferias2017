select jog.nome          as nomeJogador,
       jog.dt_nascimento as dt_nascimento,
       tim.nome          as nome_time
from   jogador jog,
       time    tim
where  jog.id_time = tim.id_time
order  by jog.dt_nascimento;
