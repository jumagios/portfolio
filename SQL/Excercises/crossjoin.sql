SELECT 
	p.name as product,
    s.name as shipper
FROM products p
CROSS JOIN shippers s

