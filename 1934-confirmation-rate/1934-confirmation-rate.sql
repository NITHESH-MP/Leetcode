# Write your MySQL query statement below
Select s.user_id, Round(IfNull(Sum(c.action = 'Confirmed') / Count(s.user_id), 0), 2) as confirmation_rate from Signups s 
Left Join Confirmations c on s.user_id = c.user_id
Group by s.user_id
