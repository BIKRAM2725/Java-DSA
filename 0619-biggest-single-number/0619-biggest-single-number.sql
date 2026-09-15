# Write your MySQL query statement below

-- # IF NOT NULL 
-- SELECT num
-- FROM MyNumbers
-- GROUP BY num 
-- HAVING COUNT(*) = 1
-- ORDER BY num DESC
-- LIMIT 1;  OR NULL

# IF NULL

SELECT
( SELECT num
FROM MyNumbers
GROUP BY num 
HAVING COUNT(*) = 1
ORDER BY num DESC
LIMIT 1
) AS num;