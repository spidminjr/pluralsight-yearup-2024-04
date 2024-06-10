USE northwind;

SELECT *
FROM products;

SELECT * 
FROM categories;

SELECT p.product_id
     , p.product_name
     , p.unit_price
     , c.category_name
FROM products
INNER JOIN categories c ON p.category_id = c.category_id
ORDER BY c.category_name, p.product_name;     