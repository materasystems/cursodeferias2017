ALTER TABLE time MODIFY (ind_ativo NOT NULL);

ALTER TABLE time ADD (CONSTRAINT ck_time_ativo CHECK (UPPER(ind_ativo) = 'S' or UPPER(ind_ativo) = 'N'));

ALTER TABLE time ADD CONSTRAINT uk_nome_time UNIQUE (nome);

CONSTRAINT FOREIGN KEY (id_tecnico) REFERENCES tecnico (id_tecnico),
CONSTRAINT pk_id_time PRIMARY KEY (id_time);

