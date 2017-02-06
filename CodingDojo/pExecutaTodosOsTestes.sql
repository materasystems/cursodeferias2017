--
create or replace package pExecutaTodosOsTestes is
  --
  procedure executa;
  --
end pExecutaTodosOsTestes;
/
--
create or replace package body pExecutaTodosOsTestes is
  --
  procedure executa as
  begin
    --
    pDjInsereArea.executaTestes();
    --
  end executa;
end pExecutaTodosOsTestes;
/
