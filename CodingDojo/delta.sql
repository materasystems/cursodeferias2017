prompt
prompt
prompt ====> Criando tabela dj_area
--
declare
  table_already_exist exception;
  pragma exception_init(table_already_exist, -955);
begin
  execute immediate 'CREATE TABLE dj_area' ||
                    '( id_area    number(10)   ,' ||
                    '  descricao  varchar2(300 char)' ||
                    ') TABLESPACE &tablespace_dados';
  dbms_output.put_line('Table created');
exception
  when table_already_exist then
    dbms_output.put_line('Warning: Table dj_area already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando PK pkdj_area em dj_area
--
declare
  table_already_has_pk exception;
  pragma exception_init(table_already_has_pk, -2260);
begin
  execute immediate 'ALTER TABLE dj_area ADD CONSTRAINT pkdj_area PRIMARY KEY' ||
                    '(id_area) using index tablespace &tablespace_indice';
  dbms_output.put_line('Table altered');
exception
  when table_already_has_pk then
    dbms_output.put_line('Warning: Table dj_area already has primary key');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando tabela dj_materano
--
declare
  table_already_exist exception;
  pragma exception_init(table_already_exist, -955);
begin
  execute immediate 'CREATE TABLE dj_materano' ||
                    '( id_materano    number(10)   ,' ||
                    '  nome  varchar2(300 char),' ||
                    '  id_area  number(10)' ||
                    ') TABLESPACE &tablespace_dados';
  dbms_output.put_line('Table created');
exception
  when table_already_exist then
    dbms_output.put_line('Warning: Table dj_materano already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando PK pkdj_materano em dj_materano
--
declare
  table_already_has_pk exception;
  pragma exception_init(table_already_has_pk, -2260);
begin
  execute immediate 'ALTER TABLE dj_materano ADD CONSTRAINT pkdj_materano PRIMARY KEY' ||
                    '(id_materano) using index tablespace &tablespace_indice';
  dbms_output.put_line('Table altered');
exception
  when table_already_has_pk then
    dbms_output.put_line('Warning: Table dj_materano already has primary key');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando FK fkdj_area_dj_materano em dj_materano
--
declare
  foreign_key_already_exists exception;
  pragma exception_init(foreign_key_already_exists, -2275);
begin
  execute immediate 'ALTER TABLE dj_materano ADD CONSTRAINT fkdj_area_dj_materano FOREIGN KEY ' ||
                    '(id_area) REFERENCES dj_area (id_area) ON DELETE CASCADE';
  dbms_output.put_line('Table altered');
exception
  when foreign_key_already_exists then
    dbms_output.put_line('Warning: Foreign Key fkdj_area_dj_materano already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt

prompt

prompt ====> Criando tabela dj_amigo
--
declare
  table_already_exist exception;
  pragma exception_init(table_already_exist, -955);
begin
  execute immediate 'CREATE TABLE dj_amigo' ||
                    '( id_materano1    number(10)   ,' ||
                    '  id_materano2  number(10)' ||
                    ') TABLESPACE &tablespace_dados';
  dbms_output.put_line('Table created');
exception
  when table_already_exist then
    dbms_output.put_line('Warning: Table dj_amigo already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando FK fkdj_materano_dj_amigo1 em dj_amigo
--
declare
  foreign_key_already_exists exception;
  pragma exception_init(foreign_key_already_exists, -2275);
begin
  execute immediate 'ALTER TABLE dj_amigo ADD CONSTRAINT fkdj_materano_dj_amigo1 FOREIGN KEY ' ||
                    '(id_materano1) REFERENCES dj_materano (id_materano) ON DELETE CASCADE';
  dbms_output.put_line('Table altered');
exception
  when foreign_key_already_exists then
    dbms_output.put_line('Warning: Foreign Key fkdj_materano_dj_amigo1 already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando FK fkdj_materano_dj_amigo2 em dj_amigo
--
declare
  foreign_key_already_exists exception;
  pragma exception_init(foreign_key_already_exists, -2275);
begin
  execute immediate 'ALTER TABLE dj_amigo ADD CONSTRAINT fkdj_materano_dj_amigo2 FOREIGN KEY ' ||
                    '(id_materano2) REFERENCES dj_materano (id_materano) ON DELETE CASCADE';
  dbms_output.put_line('Table altered');
exception
  when foreign_key_already_exists then
    dbms_output.put_line('Warning: Foreign Key fkdj_materano_dj_amigo2 already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando tabela dj_likes
--
declare
  table_already_exist exception;
  pragma exception_init(table_already_exist, -955);
begin
  execute immediate 'CREATE TABLE dj_likes' ||
                    '( id_materano1    number(10)   ,' ||
                    '  id_materano2  number(10)' ||
                    ') TABLESPACE &tablespace_dados';
  dbms_output.put_line('Table created');
exception
  when table_already_exist then
    dbms_output.put_line('Warning: Table dj_likes already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando FK fkdj_materano_dj_likes1 em dj_likes
--
declare
  foreign_key_already_exists exception;
  pragma exception_init(foreign_key_already_exists, -2275);
begin
  execute immediate 'ALTER TABLE dj_likes ADD CONSTRAINT fkdj_materano_dj_likes1 FOREIGN KEY ' ||
                    '(id_materano1) REFERENCES dj_materano (id_materano) ON DELETE CASCADE';
  dbms_output.put_line('Table altered');
exception
  when foreign_key_already_exists then
    dbms_output.put_line('Warning: Foreign Key fkdj_materano_dj_likes1 already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
prompt
prompt
prompt ====> Criando FK fkdj_materano_dj_likes2 em dj_likes
--
declare
  foreign_key_already_exists exception;
  pragma exception_init(foreign_key_already_exists, -2275);
begin
  execute immediate 'ALTER TABLE dj_likes ADD CONSTRAINT fkdj_materano_dj_likes2 FOREIGN KEY ' ||
                    '(id_materano2) REFERENCES dj_materano (id_materano) ON DELETE CASCADE';
  dbms_output.put_line('Table altered');
exception
  when foreign_key_already_exists then
    dbms_output.put_line('Warning: Foreign Key fkdj_materano_dj_likes2 already exists');
end;
/
--
prompt
prompt
prompt ====> Fim
--
/*
insert into dj_area(id_area, descricao) values (1, 'BAN');
insert into dj_area(id_area, descricao) values (2, 'DIS');
insert into dj_area(id_area, descricao) values (3, 'FIN');
insert into dj_area(id_area, descricao) values (4, 'PRD');
--
insert into dj_materano (id_materano, nome, id_area) values (1, 'LUIZ', 1);
insert into dj_materano (id_materano, nome, id_area) values (2, 'LUCAS', 1);
insert into dj_materano (id_materano, nome, id_area) values (3, 'PAULO', 1);
insert into dj_materano (id_materano, nome, id_area) values (4, 'CELSO', 1);
--
insert into dj_materano (id_materano, nome, id_area) values (5, 'MARCOS', 3);
insert into dj_materano (id_materano, nome, id_area) values (6, 'ANA', 3);
insert into dj_materano (id_materano, nome, id_area) values (7, 'PAULA', 3);
insert into dj_materano (id_materano, nome, id_area) values (8, 'SANDRA', 3);
--
insert into dj_materano (id_materano, nome, id_area) values (9, 'JOSÉ', 2);
insert into dj_materano (id_materano, nome, id_area) values (10, 'GABRIEL', 2);
insert into dj_materano (id_materano, nome, id_area) values (11, 'PEDRO', 2);
insert into dj_materano (id_materano, nome, id_area) values (12, 'LÉO', 2);
--
insert into dj_materano (id_materano, nome, id_area) values (13, 'LUIZ', 4);
insert into dj_materano (id_materano, nome, id_area) values (14, 'CAMILA', 4);
insert into dj_materano (id_materano, nome, id_area) values (15, 'ISABELA', 4);
insert into dj_materano (id_materano, nome, id_area) values (16, 'ALEX', 4);
*/
--