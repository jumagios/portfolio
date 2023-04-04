SELECT 
	p.date,
    p.invoice_id,
	p.payment_id,
    pm.name as payment_method
FROM payments p
JOIN clients c 
	ON c.client_id = p.client_id
JOIN payment_methods pm
	ON pm.payment_method_id = p.payment_method;