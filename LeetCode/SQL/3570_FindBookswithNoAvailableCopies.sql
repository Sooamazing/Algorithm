# Write your MySQL query statement below

-- 26-05-16 15min
-- https://leetcode.com/problems/find-books-with-no-available-copies/
-- SUM x, COUNT o
-- return_date = null 로 거르고, SELECT 조건을 GROUP BY 해도 가능

SELECT b.book_id, b.title, b.author, b.genre, b.publication_year, r.current_borrowers
FROM library_books b
         LEFT JOIN (SELECT br.book_id,
                           COUNT(br.borrow_date) - COUNT(br.return_date) as current_borrowers
                    FROM borrowing_records br
                    GROUP BY br.book_id) r ON b.book_id = r.book_id
WHERE b.total_copies = r.current_borrowers
ORDER BY r.current_borrowers DESC, b.title