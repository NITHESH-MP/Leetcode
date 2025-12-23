# Write your MySQL query statement below
Select v.customer_id, Count(v.visit_id) as count_no_trans from Visits v 
left join Transactions t on t.visit_id = v.visit_id
where t.transaction_id IS Null
group by v.customer_id
