SELECT PRODUCT_ID, PRODUCT_NAME
FROM PRODUCT
WHERE PRODUCT_ID NOT IN (
    SELECT PRODUCT_ID
    FROM SALES
    WHERE SALE_DATE < '2019-01-01' OR SALE_DATE > '2019-03-31'
);

# Write your MySQL query statement below
select p.product_id, p.product_name
from product p
inner join sales s on s.product_id = p.product_id
group by p.product_id
having min(sale_date) >= '2019-01-01' and max(sale_date) <= '2019-03-31'