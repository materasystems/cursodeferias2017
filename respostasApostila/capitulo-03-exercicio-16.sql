select * 
from time tim 
order by tim.nome asc;
--
select * 
from time tim 
order by tim.nome;
--
select * 
from time tim 
order by 2 asc;
--
select tim.id_time, 
       tim.nome nome_do_time 
from   time tim 
order by nome_do_time asc;
