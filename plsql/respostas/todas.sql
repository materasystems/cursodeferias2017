
-- Criação Sequence
CREATE SEQUENCE SEQ_JOGADOR
MINVALUE 1 
START WITH 1
INCREMENT BY 1
NOCACHE;

-- Inserir 2 times.
INSERT INTO TIME (ID_TIME, NOME) VALUES (1, 'BARCELONA');

INSERT INTO TIME (ID_TIME, NOME) VALUES (2, 'REAL MADRID');
COMMIT;

-- Inserir 2 técnicos.
INSERT INTO TECNICO (ID_TECNICO, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (1, 'JOSE MOURINHO', '23/06/1970', 300000, 1);

INSERT INTO TECNICO (ID_TECNICO, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (2, 'ZICO', '14/02/1960', 70000, 2);
COMMIT;

-- Inserir 11 jogadores em um time.
INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'RONALDINHO', '02/04/1980', 500000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'CRISTIANO RONALDO', '02/06/1986', 700000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'GUERREIRO', '28/03/1987', 200000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'ROBINHO', '13/05/1988', 400000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'PIRLO', '08/05/1978', 300000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'JULIO CESAR', '03/06/1985', 60000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'NEYMAR JR', '18/08/1991', 700000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'SERGIO RAMOS', '04/08/1984', 200000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'FABREGAS', '17/11/1988', 100000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'PELE', '09/09/1950', 400000, 1);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES              (SEQ_JOGADOR.NEXTVAL, 'MARADONA', '06/06/1966', 100000, 1);

COMMIT;

-- Listar todos jogadores de um determinado time.
SELECT NOME
FROM   JOGADOR
WHERE  ID_TIME = 1;

-- Listar todos times.
SELECT * 
FROM   TIME;

-- Listar técnicos com mais de 40 anos.
SELECT NOME
FROM   TECNICO
WHERE  DT_NASCIMENTO < '01/01/1976';

-- Inserir os jogadores existentes para o outro time (select insert).
INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
SELECT SEQ_JOGADOR.NEXTVAL, NOME, DT_NASCIMENTO, SALARIO, 2
FROM JOGADOR;

COMMIT;


-- Inserir um time novo.
INSERT INTO TIME (ID_TIME, NOME)
VALUES (3, 'MILAN');
COMMIT;

-- Alterar todos jogadores de um time para o novo time
UPDATE JOGADOR
SET    ID_TIME = 3
WHERE  ID_TIME = 1;
COMMIT;

-- Aumentar em 10% o salario de todos jogadores do novo time
UPDATE JOGADOR
SET    SALARIO = SALARIO * 1.10
WHERE  ID_TIME = 3;
COMMIT;

-- Aumentar o salario de todos técnicos em 20%.
UPDATE TECNICO
SET    SALARIO = SALARIO * 1.20;
COMMIT;


-- Inserir um time novo
INSERT INTO TIME (ID_TIME, NOME)
VALUES (4, 'INTERNAZIONALE');
COMMIT;

-- Inserir 3 jogadores extras no time novo.
INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES (SEQ_JOGADOR.NEXTVAL, 'BEBETO', '06/04/1976', 30000, 4);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES (SEQ_JOGADOR.NEXTVAL, 'ROMARIO', '05/07/1970', 70000, 4);

INSERT INTO JOGADOR (ID_JOGADOR, NOME, DT_NASCIMENTO, SALARIO, ID_TIME)
VALUES (SEQ_JOGADOR.NEXTVAL, 'RIVELINO', '09/06/1950', 200000, 4);
COMMIT;

-- Alterar o salario de 3 jogadores para valores acima de R$ 100.000,00
UPDATE JOGADOR
SET    SALARIO = 120000
WHERE  ID_JOGADOR = 6;

UPDATE JOGADOR
SET    SALARIO = 110000
WHERE  ID_JOGADOR = 34;

UPDATE JOGADOR
SET    SALARIO = 115000
WHERE  ID_JOGADOR = 35;
COMMIT;

-- Remover jogadores do novo time com salário superioR a R$ 100.000,00
DELETE 
FROM   JOGADOR
WHERE  SALARIO > 100000 AND ID_TIME = 4;
COMMIT;

4.
-- Selecione os nome dos times por ordem crescente
--
select nome from time order by nome asc;

-- Selecione os nomes de jogadores e seus respectivos nomes de times ordenado(asc) pela data de nascimento dos jogadores.

select j.nome,
       t.nome
from   jogador j,
       time    t
where  j.id_time = t.id_time
order  by j.dt_nascimento;

-- Qual é a folha de pagamento de cada time?

select t.id_time,
       t.nome,
       sum(j.salario) as salario_total
from   time    t,
       jogador j
where  t.id_time = j.id_time
group  by t.id_time,
          t.nome;

-- faça a média de salário/ jogador de cada time
select t.id_time,
       t.nome,
       avg(j.salario) as media_salario
from   time    t,
       jogador j
where  t.id_time = j.id_time
group  by t.id_time,
          t.nome;

-- Faça uma consulta que retorne o menor salário de cada time.
select t.id_time,
       t.nome,
       min(j.salario) as salario
from   time    t,
       jogador j
where  t.id_time = j.id_time
group  by t.id_time,
          t.nome;
-- faça uma consulta que retorne o maior salário de cada time.
select t.id_time,
       t.nome,
       max(j.salario) as salario
from   time    t,
       jogador j
where  t.id_time = j.id_time
group  by t.id_time,
          t.nome;

5.
--Gere uma saída DBMS básica (‘Hello DBMS’) utilizando o pacote da Oracle DBMS_OUTPUT.PUTLINE(‘text’).
DECLARE
BEGIN
  DBMS_OUTPUT.PUT_LINE('HELLO DBMS');
END;

--Gerar uma saída DBMS contendo as informações de um time e do seu técnico.
DECLARE
  vsNomeTime    varchar2(200);
  vsNomeTecnico varchar2(200);
BEGIN
  SELECT TEC.NOME,
         TIM.NOME
  into   vsNomeTecnico,
         vsNomeTime
  FROM   TECNICO TEC,
         TIME    TIM
  WHERE  TEC.ID_TIME = TIM.ID_TIME AND
         TEC.ID_TECNICO = 2;
  DBMS_OUTPUT.PUT_LINE('Tecnico ' || vsNomeTecnico || ', Time ' ||
                       vsNomeTime);
END;

--Gerar um jogo composto de dois times diferentes e escalar os jogadores participantes.
INSERT into jogo
  (id_jogo,
   id_time_a,
   id_time_b,
   nr_gol_a,
   nr_gol_b,
   dh_inicio,
   dh_fim)
values
  (1,
   2,
   3,
   0,
   0,
   sysdate,
   sysdate);

-- Criação Sequence
CREATE SEQUENCE SEQ_JOGO_JOGADOR MINVALUE 1 START
  WITH 1 INCREMENT BY 1 NOCACHE;

insert into jogo_jogador
  (id_jogo_jogador,
   id_jogo,
   id_jogador)
  select SEQ_JOGO_JOGADOR.NEXTVAL,
         1,
         jog.id_jogador
  from   jogador jog
  where  jog.id_time in (2,
                         3);

--Marcar alguns gols para o jogo gerado respeitando o placar definido no jogo.
insert into gol
  (id_gol,
   dh_gol,
   id_jogo_jogador)
values
  (1,
   sysdate,
   1);
update jogo set nr_gol_a = 1 where id_jogo = 1;

--Incluir comentários nos blocos anônimos anteriores sem alterar o funcionamento.
DECLARE
BEGIN
  /*Comment*/
  DBMS_OUTPUT.PUT_LINE('HELLO DBMS');
END;

--Altera bloco anônimo que gerar o jogo composto de dois times diferentes e adicionar quantos “if” forem necessários para que não permita inserir um jogo sendo o mesmo time para “ambos os lados”.
declare
  vnTimeA number := 2;
  vnTimeB number := 3;
begin
  if vnTimeA <> vnTimeB THEN
    INSERT into jogo
      (id_jogo,
       id_time_a,
       id_time_b,
       nr_gol_a,
       nr_gol_b,
       dh_inicio,
       dh_fim)
    values
      (1,
       vnTimeA,
       vnTimeB,
       0,
       0,
       sysdate,
       sysdate);
  END IF;
end;
--Criar uma consulta que retorne os jogos, times que estão participando, e placar, sendo que na coluna placar deve trazer o número de gols de cada time respeitando o seu lado na ordenação das colunas (4 - 3) e caso seja o mesmo número de gols deve aparecer ‘empate’.
select jogo.id_jogo,
       time_a.nome as time_A,
       decode(jogo.nr_gol_a,
              jogo.nr_gol_b,
              'EMPATE',
              jogo.nr_gol_a || ' - ' || jogo.nr_gol_b) AS PLACAR,
       time_b.nome as TIME_B
from   jogo,
       time time_a,
       time time_b
where  jogo.id_time_a = time_a.id_time and
       jogo.id_time_b = time_b.id_time;

--Criar bloco anônimo com algum comando dml “insert” que irá causar erro, e tratar com a exception OTHERS.
begin
  insert into time (id_time) values (null);
exception
  when others then
    dbms_output.put_line('Erro :' || sqlerrm);
end;
--Criar bloco anônimo com alguma consulta que irá obter um valor e popular em uma variável e “forçar” um erro, e tratar com a exception TOO_MANY_ROWS.
declare
  vsNomeTime varchar2(200);
begin
  select nome into vsNomeTime from time;
exception
  when TOO_MANY_ROWS then
    dbms_output.put_line('Erro TOO_MANY_ROWS :' || sqlerrm);
  when others then
    dbms_output.put_line('Erro :' || sqlerrm);
end;

--Criar um laço de repetição que imprima os números de 0 a 100 via DBMS.
declare
  vnNumero number := 0;
begin
  loop
    dbms_output.put_line(vnNumero);
    vnNumero := vnNumero + 1;
    exit when vnNumero > 100;
  end loop;
end;
--Criar um laço de repetição que imprima os números de 0 a 100 pares via DBMS.
declare
  vnNumero number := 0;
begin
  loop
    dbms_output.put_line(vnNumero);
    vnNumero := vnNumero + 2;
    exit when vnNumero > 100;
  end loop;
end;
--Percorrer todos os jogos e inserir um gol para cada jogador.
CREATE SEQUENCE SEQ_GOL MINVALUE 1 START
  WITH 1 INCREMENT BY 1 NOCACHE;

insert into gol
  (id_gol,
   dh_gol,
   id_jogo_jogador)
  select SEQ_GOL.NEXTVAL,
         sysdate,
         id_jogador
  from   jogo_jogador;


6.
-- Create sequence 
create sequence SEQ_CARTAO
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
nocache;
--Criar uma procedure insere cartões, recebendo somente a descrição do cartão.
CREATE OR REPLACE PROCEDURE INSERE_CARTAO
(
  psDescricao  VARCHAR2
) AS
  --variaveis
BEGIN
 insert into cartao(id_cartao,descricao) values(SEQ_CARTAO.nextval,psDescricao);
END; 
--Criar uma function que retorne a quantidade de gols de um jogador específico, sendo este o parâmetro de entrada.

CREATE OR REPLACE FUNCTION OBTEM_NR_GOLS(pIdJogador number) return number is
  vnNumeroDeGol number;
BEGIN
  select count(*)
  into   vnNumeroDeGol
  from   jogo_jogador jj,
         gol          g
  where  jj.id_jogador = pIdJogador and
         jj.id_jogo_jogador = g.id_jogo_jogador;

  return vnNumeroDeGol;

END;
--Criar uma consulta que retorne os times, os jogadores do time e a quantidade de gols de cada jogar (utilizar function criada).
select jog.nome as NOME_JGOADOR,
       T.NOME as NOME_TIME,
       OBTEM_NR_GOLS(jog.id_jogador)
from   jogo_jogador jj,
       jogador      jog,
       time         t
where  jj.id_jogador = jog.id_jogador and
       jog.id_time = t.id_time;

7.
--Criar uma consulta que retorne somente os cartões que já foram aplicados em algum jogo.
	select *
	from cartao cart
	where  exists ( select * from jogo_cartao_jogador jcj where jcj.cartao_id_cartao = cart.id_cartao )
	         --Reduzir em 10% o salário de todos os jogadores que receberam pelo menos um cartão
		update jogador jog set salario = salario*0.9 where exists(select * from jogo_jogador jj where 			jj.jogador_id_jogador=jog.id_jogador and exist(select * from jogo_cartao_jogador where 				jcj.jogo_jogador_id_jogo_jogador=jj.id_jogo_jogador))
8.
--Criar uma trigger que depois de inserir algum gol ele contabilize mais um ao jogo para aquele determinado time.
CREATE OR REPLACE TRIGGER tgGol
 AFTER INSERT OR DELETE  ON gol
 FOR EACH ROW
 declare
 vnIdJogo number;
 vnIdTime number;
 vnTimeA  number;
 vnIdJogoJogador number;
begin
  
 vnIdJogoJogador:= nvl(:new.id_jogo_jogador,:old.id_jogo_jogador);
  -- busco o id do jogo , e o id do time
  select jj.id_jogo,
         jog.id_time
  into   vnIdJogo,
         vnIdTime
  from   jogo_jogador jj,
         jogador      jog
  where  jj.id_jogo_jogador = vnIdJogoJogador and
         jj.id_jogador = jog.id_jogador;

  -- verifico se existe o time é o time A
  select count(*)
  into   vnTimeA
  from   jogo
  where  jogo.id_jogo = vnIdJogo and
         jogo.id_time_a = vnIdTime;

  -- incrementa um gol para o time que fez o gol
  if nvl(vnTimeA,0) > 0 then
  
    update jogo
    set    (nr_gol_a) =
           (nr_gol_a + 1)
    where  id_jogo = vnIdJogo;

  else

    update jogo
    set    (nr_gol_b) =
           (nr_gol_B + 1)
    where  id_jogo = vnIdJogo;
  
  end if;

end;
--Alterar a trigger criada anteriormente para que ela subtraia um gol do jogo caso o registro do gol tenha sido apagado.
CREATE OR REPLACE TRIGGER tgGol
 AFTER INSERT OR DELETE  ON gol
 FOR EACH ROW
 declare
 vnIdJogo        number;
 vnIdTime        number;
 vnTimeA         number;
 vnIdJogoJogador number;
begin

  vnIdJogoJogador :=   nvl(:new.id_jogo_jogador,:old.id_jogo_jogador);

  -- busco o id do jogo , e o id do time
  select jj.id_jogo,
         jog.id_time
  into   vnIdJogo,
         vnIdTime
  from   jogo_jogador jj,
         jogador      jog
  where  jj.id_jogo_jogador = vnIdJogoJogador and
         jj.id_jogador = jog.id_jogador;

  -- verifico se existe o time é o time A
  select count(*)
  into   vnTimeA
  from   jogo
  where  jogo.id_jogo = vnIdJogo and
         jogo.id_time_a = vnIdTime;

  -- se é time A estamos inserindo incrementa um gol para o time A
  if nvl(vnTimeA,0) > 0 AND INSERTING then
  
    update jogo
    set    (nr_gol_a) =
           (nr_gol_a + 1)
    where  id_jogo = vnIdJogo;

  -- se é time A estamos deletando decrementa um gol para o time A
  elsif nvl(vnTimeA,0) > 0 AND DELETING then

    update jogo
    set    (nr_gol_a) =
           (nr_gol_a - 1)
    where  id_jogo = vnIdJogo;

  -- se é time B estamos inserindo incrementa um gol para o time B
  elsif nvl(vnTimeA,0) = 0 AND INSERTING then

    update jogo
    set    (nr_gol_b) =
           (nr_gol_B + 1)
    where  id_jogo = vnIdJogo;
  
  -- senao decremento um gol para o time B
  else
    
    update jogo
    set    (nr_gol_b) =
           (nr_gol_B - 1)
    where  id_jogo = vnIdJogo;

  end if;

end;
--Criar uma tabela de log de jogador para que armazene todos os dados antes de qualquer alteração.
create table JOGADOR_LOG
( id_jogador_log   number,
  id_jogador       NUMBER ,
  nome             VARCHAR2(400),
  dt_nascimento    DATE ,
  salario          NUMBER(18,2),
  id_time          NUMBER 
);
alter table JOGADOR_LOG  add constraint PK_JOGADOR_log primary key (id_jogador_log);

-- Criação Sequence
CREATE SEQUENCE SEQ_JOGADOR_LOG
MINVALUE 1 
START WITH 1
INCREMENT BY 1
NOCACHE;
--Criar uma trigger que antes de realizar qualquer alteração em um jogador ele guarde no log o estado anterior.
CREATE OR REPLACE TRIGGER tgJogadorLog
 AFTER UPDATE  ON jogador
 FOR EACH ROW
 declare

begin

  insert into jogador_log
    (id_jogador_log,
     id_jogador,
     nome,
     dt_nascimento,
     salario,
     id_time)
  values
    (seq_jogador_log.nextval,
     :old.id_jogador,
     :old.nome,
     :old.dt_nascimento,
     :old.salario,
     :old.id_time);

end;
