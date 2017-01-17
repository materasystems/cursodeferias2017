-- JOGADOR
comment on table JOGADOR  is 'TABELA QUE ARMAZENA DADOS DOS JOGADORES';
comment on column JOGADOR.id_jogador  is 'IDENTIFICADOR DO JOGADOR';
comment on column JOGADOR.nome  is 'NOME DO JOGADOR';
comment on column JOGADOR.id_time  is 'IDENTIFICADOR DO TIME';
comment on column JOGADOR.dt_nascimento  is 'DATA DE NASCIMENTO';
comment on column JOGADOR.salario  is 'SALARIO';
-- TIME
comment on table TIME  is 'TABELA DE TIMES';
comment on column TIME.id_time  is 'IDENTIFICADOR DO TIME';
comment on column TIME.nome  is 'NOME DO TIME';
-- TECNICO
comment on table TECNICO  is 'TABELA DE TECNICOS';
comment on column TECNICO.id_tecnico  is 'IDENTIFICADOR DO TECNICO';
comment on column TECNICO.nome  is 'NOME DO TECNICO';
comment on column TECNICO.dt_nascimento  is 'DATA DE NASCIMENTO';
comment on column TECNICO.salario  is 'SALARIO';
comment on column TECNICO.id_time  is 'IDENTIFICADOR DO TIME';
