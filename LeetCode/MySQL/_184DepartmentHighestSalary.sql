# Write your MySQL query statement below
SELECT Department.name AS Department,Employee.name AS Employee,
Employee.salary AS Salary
FROM Employee  JOIN Department ON 
Employee.departmentId = Department.id
WHERE (Employee.DepartmentId , Employee.salary) IN
    (SELECT DepartmentId, MAX(Salary)
      FROM Employee
      GROUP BY DepartmentId
    )