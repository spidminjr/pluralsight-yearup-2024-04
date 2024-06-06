USE northwind;

SELECT ProductId
	 , ProductName
     , UnitPrice
FROM products
ORDER BY UnitPrice ASC
LIMIT 1;     