-- TIME
alter table TIME  add constraint PK_TIME primary key (ID_TIME);
alter table TIME  add constraint UK_TIME unique (NOME);
-- JOGADOR
alter table JOGADOR  add constraint PK_JOGADOR primary key (ID_JOGADOR);
alter table JOGADOR  add constraint FK_JOGADOR foreign key (ID_TIME)  references time(ID_TIME);
alter table JOGADOR  add constraint UK_JOGADOR unique (NOME);
--
alter table JOGADOR  add constraint CK_JOGADOR  check (SALARIO >= 0);
--
-- TECNICO
alter table TECNICO  add constraint PK_TECNICO primary key (ID_TECNICO);
alter table TECNICO  add constraint FK_TIME foreign key (ID_TIME)  references time (ID_TIME);
alter table TECNICO  add constraint UK_TECNICO unique (NOME);
--
alter table TECNICO  add constraint CK_TECNICO  check (SALARIO >= 0);
