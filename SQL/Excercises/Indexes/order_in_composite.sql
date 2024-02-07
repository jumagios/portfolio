EXPLAIN SELECT customer_id
FROM customers
USE INDEX (idx_state_lastname)
WHERE state = 'NY' AND last_name LIKE 'A%';

CREATE INDEX idx_state_lastname ON customers(state, last_name);