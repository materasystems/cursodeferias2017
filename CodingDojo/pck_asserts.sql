CREATE OR REPLACE package asserts as 
  
  -- Assert procedure which takes as arguments:
  --   condition: the condition to check
  --   proc: the test procedure name
  --   message: if the condition fails, the procedure raises an error with this message attached
  procedure assert(condition in boolean, proc in varchar2, message in varchar2);
  
  -- Assert procedure which takes as arguments:
  --   expected: the expected value
  --   actual: the actual value
  --   proc: the test procedure name
  procedure assertEquals(expected in varchar2, actual in varchar2, proc in varchar2);
  
END ASSERTS;
/


CREATE OR REPLACE PACKAGE BODY ASSERTS AS 

  PROCEDURE raiseError(proc IN VARCHAR2, message IN VARCHAR2) IS 
  BEGIN  
    raise_application_error(-20000, 'Error in ' || proc || ': ' || message);
  end raiseerror;
 
  procedure assert(  
    condition in boolean, 
    proc in varchar2, 
    message in varchar2) is
  begin
    if not condition then
      raiseError(proc, message);
    END IF;
  end assert;  
 
  procedure assertEquals(
    expected in varchar2,
    actual in varchar2,
    proc in varchar2) is
  BEGIN
    if not expected = actual then
      raiseError(proc, 'expected ' || expected || ', got ' || actual);
    END IF;
  end assertEquals; 
  
END ASSERTS;
/