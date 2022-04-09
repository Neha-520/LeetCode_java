# Write your MySQL query statement below
SELECT  Users.user_id as buyer_id,Users.join_date,
SUM(CASE WHEN order_date is not null then 1 ELSE 0 END) AS orders_in_2019
FROM Users LEFT JOIN Orders 
ON Users.user_id = Orders.buyer_id AND YEAR(order_date) = '2019'
GROUP BY Users.user_id
