# Write your MySQL query statement below
SELECT Score, DENSE_RANK() OVER(ORDER BY Score DESC) AS 'Rank' 
 FROM Scores
ORDER BY 'Rank'


#2nd solution
SELECT S1.Score, (
    SELECT COUNT(DISTINCT Score) FROM Scores WHERE Score >= S1.Score) AS 'Rank'
FROM Scores S1
ORDER BY S1.Score DESC