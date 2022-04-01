SELECT customer_id,COUNT(customer_id) AS count_no_trans FROM Visits AS V
LEFT JOIN Transactions AS T ON V.visit_id = T.visit_id
WHERE T.transaction_id IS NULL
GROUP BY(customer_id)
ORDER BY count_no_trans;