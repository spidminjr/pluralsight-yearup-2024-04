-- 1 Prodcut table


use northwind;
-- 2

SELECT `ProductID`
      ,`ProductName`
      , `UnitPrice`
FROM products;      


-- 3 
use northwind;

SELECT `ProductId`
      , `ProductName`
      , `UnitPrice`
FROM products
ORDER BY UnitPrice ASC;  

-- 4 

use northwind;

SELECT `ProductId`
      , `ProductName`
      , `UnitPrice`
FROM products      
WHERE UnitPrice <= 7.50; 

-- 5
use northwind;

SELECT `ProductId`
      , `ProductName`
      , `UnitPrice`
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;   

-- 6 
use northwind;

SELECT `ProductName`
      , `UnitPrice`
      , `UnitsInStock`
FROM products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName ASC;  

-- 7 
SELECT ProductName
      , UnitsInStock
FROM Products
WHERE UnitsInStock = 0
AND UnitsOnOrder >= 1;      

    