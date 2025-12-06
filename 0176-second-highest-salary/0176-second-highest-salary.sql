# Write your MySQL query statement below
Select (
select Distinct salary from Employee
order by salary DESC
limit 1 offset 1
) as SecondHighestSalary 