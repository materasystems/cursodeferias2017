CREATE TABLE JOGADOR 
(ID_JOGADOR   NUMBER,
NOME          VARCHAR2(200),
DT_NASCIMENTO DATE,
SALARIO       NUMBER(14,2),
ID_TIME       NUMBER);
-- 
alter table JOGADOR modify id_jogador not null;
alter table JOGADOR modify nome not null;
alter table JOGADOR modify salario not null;
alter table JOGADOR modify id_time not null;
--
CREATE TABLE TIME 
(ID_TIME      NUMBER,
NOME          VARCHAR2(200) NOT NULL);
--
CREATE TABLE TECNICO 
(ID_TECNICO   NUMBER NOT NULL,
NOME          VARCHAR2(200) NOT NULL,
DT_NASCIMENTO DATE,
SALARIO       NUMBER(14,2) NOT NULL,
ID_TIME       NUMBER NOT NULL);
