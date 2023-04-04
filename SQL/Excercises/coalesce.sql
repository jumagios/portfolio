SELECT 
	CONCAT(first_name , ' ' ,last_name) as customer,
    COALESCE(phone, 'Unkown') as phone
FROM customers