USE northwind;

SELECT *
FROM products;

SELECT * 
FROM suppliers;

SELECT p.product_id
     , p.product_name
     , p.unit_price
     , s.company_name AS supplier_name
FROM products 
INNER JOIN suppliers s 
ON p.supplier_id = s.supplier_id
WHERE p.unit_price > 75
ORDER BY p.product_name;    