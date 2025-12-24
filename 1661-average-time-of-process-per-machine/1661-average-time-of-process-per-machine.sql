# Write your MySQL query statement below
select a1.machine_id, ROUND(AVG(a2.timestamp - a1.timestamp),3) as processing_time from Activity a1
Join Activity a2 on a1.machine_id = a2.machine_id And a1.process_id = a2.process_id
where a1.activity_type = 'start' and a2.activity_type = 'end'
Group By a1.machine_id