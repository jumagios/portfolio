SELECT 
	pm.name as payment_method,
    SUM(p. amount) as total
FROM payments p
JOIN payment_methods pm 
	ON payment_id = payment_method_id
GROUP BY pm.name WITH ROLLUP