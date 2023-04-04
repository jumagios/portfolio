SELECT 
	p.date,
    pm.name as payment_method,
    SUM(amount) as total_payments
FROM payments p
JOIN payment_methods pm 
ON payment_method = payment_method_id
GROUP BY p.date, pm.name
ORDER BY p.date