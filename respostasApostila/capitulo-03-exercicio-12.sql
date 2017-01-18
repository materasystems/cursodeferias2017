insert into jogador (id_jogador, 
                     nome, 
                     dt_nascimento, 
                     salario,
                     id_time)
values              (seqJogador.Nextval,
                    'novo jogador' || seqJogador.Currval,
                    sysdate -30,
                    0,
                    3);
--
insert into jogador (id_jogador, 
                     nome, 
                     dt_nascimento, 
                     salario,
                     id_time)
values              (seqJogador.Nextval,
                    'novo jogador' || seqJogador.Currval,
                    sysdate -30,
                    0,
                    3);
--
insert into jogador (id_jogador, 
                     nome, 
                     dt_nascimento, 
                     salario,
                     id_time)
values              (seqJogador.Nextval,
                    'novo jogador' || seqJogador.Currval,
                    sysdate -30,
                    0,
                    3);
--
commit;
