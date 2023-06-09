CREATE USER ORCLSTUDY
IDENTIFIED BY ORACLE;

CREATE USER ORCLSTUDY02
IDENTIFIED BY ORACLE;

CREATE USER KIMJIEUN
IDENTIFIED BY 1112;

GRANT ROLESTUDY TO KIMJIEUN;

DROP USER KIMJIEUN CASCADE;



CREATE USER PREV_HW
IDENTIFIED BY ORCL;

GRANT ROLESTUDY TO PREV_HW;

--CONNECT 는 ROLE (CREATE SESSION, GREATE TABLE)
--RESOURCE는 ROLE (CREATE SESSION, GREATE TABLE)
GRANT CONNECT, RESOURCE TO ORCLSTUDY02;

DROP USER ORCLESTUDY02 CASCADE;

--접속 권한 부여
GRANT CREATE SESSION, RESOURCE,
CREATE TABLE TO ORCLSTUDY;

REVOKE RESOURCE, CREATE TABLE FROM ORCLSTUDY;

DROP USER ORCLSTUDY;

--ROLE 만들기
CREATE ROLE ROLESTUDY;
GRANT CONNECT, RESOURCE,CREATE VIEW, CREATE SYNONYM TO ROLESTUDY;
GRANT ROLESTUDY TO ORCLSTUDY02;