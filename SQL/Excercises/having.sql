SELECT 
	c.customer_id,
    c.state,
    SUM(oi.unit_price * oi.quantity) as total
FROM customers c
JOIN orders o USING (customer_id)
JOIN order_items oi USING (order_id)
WHERE c.state = 'VA'
GROUP BY c.customer_id
HAVING total > 100


