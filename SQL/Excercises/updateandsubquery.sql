UPDATE orders
SET comments = 'Gold Customer'
WHERE comments IS NULL AND customer_id IN 
						(SELECT customer_id
						FROM customers
						WHERE points > 3000)
