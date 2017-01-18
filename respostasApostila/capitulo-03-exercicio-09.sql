select *
from   tecnico tec
where  tec.dt_nascimento < (sysdate -14600);
