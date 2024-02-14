-- 1: web/desktop application
CREATE USER moon_app IDENTIFIED BY '1n2n24b';

GRANT SELECT, INSERT, UPDATE, DELETE, EXECUTE
ON sql_store.*
TO moon_app;

-- 2: admin
GRANT ALL
ON *.*
TO john;