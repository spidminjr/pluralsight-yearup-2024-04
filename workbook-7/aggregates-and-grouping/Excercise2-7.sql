USE northwind;

SELECT CategoryID
	 , AVG(UnitPrice) AS AveragePrice
FROM products
GROUP BY CategoryId;     