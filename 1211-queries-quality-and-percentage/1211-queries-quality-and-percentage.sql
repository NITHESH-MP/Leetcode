# Write your MySQL query statement below
Select q1.query_name, 
    Round(sum(q2.rating / q2.position) / Count(q2.query_name), 2) as quality, 
    Round((Sum(q2.rating < 3) / Count(q2.query_name)) * 100, 2) as poor_query_percentage
from Queries q1
Cross Join Queries q2 
where q1.query_name = q2.query_name
Group By q1.query_name 