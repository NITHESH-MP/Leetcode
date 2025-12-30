# Write your MySQL query statement below
Select r.contest_id, Round(((Count(Distinct u.user_id) / (Select Count(user_id) from Users)) * 100),2) as percentage from Register r
Cross Join Users u
where u.user_id = r.user_id
Group By r.contest_id
Order By percentage DESC, r.contest_id Asc