# Write your MySQL query statement below
SELECT user_id,MAX(time_stamp) AS last_stamp
FROM Logins
WHERE time_stamp LIKE "2020%"
GROUP BY user_id
ORDER BY last_stamp DESC 
