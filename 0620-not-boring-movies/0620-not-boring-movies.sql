# Write your MySQL query statement below
Select id, movie, description, rating from Cinema
where (id % 2) != 0 And description != 'boring'
Order By rating DESC