create or replace package pDjInsereArea is
  --
  procedure insereArea
  (
    pinId        IN  dj_area.id_area%TYPE,
    pisDescricao IN  dj_area.descricao%TYPE
  );
  --
  function buscaNomeArea(pinIdArea varchar2) return varchar2;
  --
  procedure executaTestes;
  --
end pDjInsereArea;
/
--
create or replace package body pDjInsereArea is
  --
  procedure insereArea
  (
    pinId        IN  dj_area.id_area%TYPE,
    pisDescricao IN  dj_area.descricao%TYPE
  )is
  begin
    --
    insert into dj_area(id_area, descricao) values (pinId, pisDescricao);
    --
  end;
  --
  function buscaNomeArea(pinIdArea varchar2) return varchar2 is
    vsRetorno dj_area.descricao%TYPE;
  begin
    --
    select d.descricao
    into   vsRetorno
    from   dj_area d
    where  d.id_area = pinIdArea;
    --
    return vsRetorno;
    --
  end buscaNomeArea;
  --
  procedure insereAreaTest is
    --
  begin
    --
    insereArea(5, 'BAN');
    --
    asserts.assertEquals('BAN', buscaNomeArea(5), 'insereAreaTest');
    --
    dbms_output.put_line('insereAreaTest executado com sucesso');
    --
    rollback;
    --
  end insereAreaTest;
  --
  procedure executaTestes as
  begin
    --
    insereAreaTest;
    --
  end executaTestes;
end pDjInsereArea;
/
