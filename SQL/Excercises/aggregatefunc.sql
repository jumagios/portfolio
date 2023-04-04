SELECT 
	'First half of 2019' as date_range,
    SUM(invoice_total) as total_sales,
    SUM(payment_total) as total_payments,
    SUM(invoice_total - payment_total) as what_we_expect
FROM invoices
WHERE invoice_date BETWEEN '2019-01-01' AND '2019-06-30'
UNION
SELECT 
	'Second half of 2019' as date_range,
    SUM(invoice_total) as total_sales,
    SUM(payment_total) as total_payments,
    SUM(invoice_total - payment_total) as what_we_expect
FROM invoices
WHERE invoice_date BETWEEN '2019-07-01' AND '2019-12-31'
UNION
SELECT 
	'Total' as date_range,
    SUM(invoice_total) as total_sales,
    SUM(payment_total) as total_payments,
    SUM(invoice_total - payment_total) as what_we_expect
FROM invoices
