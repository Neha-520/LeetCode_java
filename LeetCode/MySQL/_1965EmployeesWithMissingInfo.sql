#Write your MySQL query statement below

SELECT e.employee_id
FROM Employees e LEFT JOIN Salaries s ON e.employee_id=s.employee_id
WHERE salary IS NULL
UNION
SELECT s.employee_id
FROM Employees e RIGHT JOIN Salaries s ON e.employee_id=s.employee_id
WHERE name IS NULL
ORDER BY employee_id


/* Write your T-SQL query statement below */
SELECT CASE
    WHEN E.EMPLOYEE_ID IS NULL
    THEN S.EMPLOYEE_ID
    ELSE E.EMPLOYEE_ID
END AS EMPLOYEE_ID
FROM EMPLOYEES AS E
FULL JOIN SALARIES AS S
ON E.EMPLOYEE_ID = S.EMPLOYEE_ID
WHERE E.NAME IS NULL OR S.SALARY IS NULL
ORDER BY EMPLOYEE_ID;