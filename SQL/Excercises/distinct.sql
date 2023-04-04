SELECT 
	DISTINCT c.customer_id,
    c.first_name,
    c.last_name
FROM customers c
JOIN orders o USING (customer_id)
JOIN order_items oi USING (order_id)
WHERE oi.product_id = 3