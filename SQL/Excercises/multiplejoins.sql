SELECT 
	o.order_date,
    o.order_id,
    c.first_name as customer,
    s.name as shipper,
    os.name as status  
FROM orders o
	JOIN customers c
		ON c.customer_id = o.customer_id
	LEFT JOIN shippers s
		ON s.shipper_id = o.shipper_id
	JOIN order_statuses os
		ON o.status = os.order_status_id
