USE northwind;

SELECT SupplierId
	 , COUNT(*) AS NumberOfItems
FROM products
GROUP BY SupplierId
HAVING COUNT(*) >= 5;    