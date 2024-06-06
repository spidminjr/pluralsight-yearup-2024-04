USE northwind;


SELECT ProductId
     , ProductName
     , UnitPrice * UnitsOnHand AS InventoryValue
FROM products
ORDER BY InventoryValue DESC ProductName;     