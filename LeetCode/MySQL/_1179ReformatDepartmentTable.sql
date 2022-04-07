# Write your MySQL query statement below
SELECT id,
SUM(IF(month = 'Jan',revenue,null)) as Jan_revenue,
SUM(IF(month = 'Feb',revenue,null)) as Feb_revenue,
SUM(IF(month = 'Mar',revenue,null)) as Mar_revenue,
SUM(IF(month = 'Apr',revenue,null)) as Apr_revenue,
SUM(IF(month = 'May',revenue,null)) as May_revenue,
SUM(IF(month = 'Jun',revenue,null)) as Jun_revenue,
SUM(IF(month = 'Jul',revenue,null)) as Jul_revenue,
SUM(IF(month = 'Aug',revenue,null)) as Aug_revenue,
SUM(IF(month = 'Sep',revenue,null)) as Sep_revenue,
SUM(IF(month = 'Oct',revenue,null)) as Oct_revenue,
SUM(IF(month = 'Nov',revenue,null)) as Nov_revenue,
SUM(IF(month = 'Dec',revenue,null)) as Dec_revenue
FROM Department
GROUP BY id;