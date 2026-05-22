# Write your MySQL query statement below
-- 26-05-22 8min
-- https://leetcode.com/problems/dna-pattern-recognition/

SELECT sample_id
     , dna_sequence
     , species
     , IF(dna_sequence REGEXP '^ATG.*', 1, 0)           AS has_start
     , IF(dna_sequence REGEXP '.*(TAA|TAG|TGA)$', 1, 0) AS has_stop
     , IF(dna_sequence REGEXP '.*(ATAT).*', 1, 0)       AS has_atat
     , IF(dna_sequence REGEXP '.*GGG.*', 1, 0)          AS has_ggg
FROM Samples
ORDER BY sample_id