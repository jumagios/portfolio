USE sql_blog;

CREATE FULLTEXT INDEX idx_title_body ON posts (title, body);

SELECT *, MATCH(title, body) AGAINST ('react redux')
FROM posts	
WHERE MATCH(title, body) AGAINST ('react redux');