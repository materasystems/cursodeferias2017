-- Create sequence 
create sequence seqJogador
start with 12
increment by 1
cache 20;
-- Insert as select
insert into jogador 
select seqJogador.Nextval, 
       jog.nome || ' novo ',
       jog.dt_nascimento,
       jog.salario, 
       1 
from jogador jog where jog.id_time = 2;
--
commit;
