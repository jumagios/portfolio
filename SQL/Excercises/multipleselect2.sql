SELECT *
FROM clients 
WHERE client_id NOT IN (
	SELECT DISTINCT client_id
    FROM invoices
)