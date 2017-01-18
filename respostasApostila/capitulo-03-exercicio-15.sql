delete time tim
where  tim.id_time not in (select jog.id_time 
                           from   jogador jog) and
       tim.id_time not in (select tec.ID_TIME
                           from   tecnico tec);
--
commit;
