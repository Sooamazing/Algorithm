# Write your MySQL query statement below
-- 26-05-26 30min
-- https://leetcode.com/problems/find-emotionally-consistent-users/
-- 틀림

-- SELECT user_id, dominant_reaction, reaction_ratio
-- FROM reactions
-- ORDER BY reaction_ratio DESC, user_id
-- SELECT u.user_id, u.reaction AS dominant_reaction, ROUND(COUNT(u.reaction_count)/SUM(u.reaction_count), 2) AS reaction_ratio
-- FROM (SELECT user_id, reaction, COUNT(reaction) reaction_count
-- FROM reactions
-- GROUP BY user_id, reaction) u
-- GROUP BY u.user_id
-- HAVING MAX(u.reaction_count) = u.reaction_count AND COUNT(u.reaction_count)/SUM(u.reaction_count) >= 0.6
-- ORDER BY U.reaction_count DESC

-- SELECT u.user_id, u.reaction AS dominant_reaction, ROUND(MAX(u.reaction_count)/SUM(u.reaction_count), 2) AS reaction_ratio
-- FROM (SELECT user_id, reaction, COUNT(reaction) reaction_count
-- FROM reactions
-- GROUP BY user_id, reaction) u
-- GROUP BY u.user_id
-- HAVING MAX(u.reaction_count)/SUM(u.reaction_count) >= 0.6
-- ORDER BY reaction_ratio DESC, user_id

/* Write your PL/SQL query statement below */
with reaction_count as (select user_id,
                               reaction,
                               count(reaction) reaction_count
                        from reactions
                        where user_id in
                              (select user_id from reactions group by user_id having count(*) >= 5)
                        group by user_id, reaction),
     reaction_rank as (select user_id,
                              reaction,
                              reaction_count,
                              rank() over (partition by user_id order by reaction_count desc) rnk_reaction,
                              sum(reaction_count) over (partition by user_id)                 total_reaction
                       from reaction_count)
select user_id,
       reaction                                                      as dominant_reaction,
       CAST(reaction_count * 1.0 / total_reaction AS DECIMAL(10, 2)) AS reaction_ratio
from reaction_rank
where rnk_reaction = 1
  and (reaction_count * 1.0 / total_reaction >= 0.6)
order by reaction_ratio desc, user_id asc