# Write your MySQL query statement below
SELECT Users.name,SUM(Transactions.amount) as balance FROM
Users LEFT JOIN Transactions on Users.account = Transactions.account
GROUP BY Transactions.account
HAVING balance > 10000;