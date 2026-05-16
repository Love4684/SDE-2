# 03 — SQL (Interview Ready)

> You work with MySQL daily. This refreshes query writing skills and covers tricky interview patterns.
> Target: 4-5 days.

---

## Topics Checklist

### A. Fundamentals Refresh
- [ ] SELECT, WHERE, ORDER BY, LIMIT, DISTINCT
- [ ] Aggregate functions: COUNT, SUM, AVG, MIN, MAX
- [ ] GROUP BY + HAVING
- [ ] NULL handling: IS NULL, COALESCE, IFNULL, NULLIF

### B. Joins (Most Asked)
- [ ] INNER JOIN, LEFT JOIN, RIGHT JOIN, FULL OUTER JOIN
- [ ] CROSS JOIN, SELF JOIN
- [ ] Join on multiple conditions
- [ ] Anti-join pattern (LEFT JOIN + WHERE IS NULL)
- [ ] Visual understanding: draw Venn diagrams

### C. Subqueries
- [ ] Scalar, row, table subqueries
- [ ] Correlated vs non-correlated subqueries
- [ ] EXISTS vs IN (performance difference)
- [ ] Subquery in SELECT, FROM, WHERE

### D. Window Functions (SDE-2 Must-Know)
- [ ] ROW_NUMBER(), RANK(), DENSE_RANK()
- [ ] LAG(), LEAD()
- [ ] PARTITION BY + ORDER BY
- [ ] Running totals with SUM() OVER
- [ ] NTILE(), FIRST_VALUE(), LAST_VALUE()

### E. Advanced Concepts
- [ ] CTEs (Common Table Expressions) — WITH clause
- [ ] Recursive CTEs
- [ ] UNION vs UNION ALL
- [ ] CASE WHEN expressions
- [ ] String functions: CONCAT, SUBSTRING, LENGTH, REPLACE
- [ ] Date functions: DATE_DIFF, DATE_ADD, DATE_FORMAT

### F. Database Design & Theory
- [ ] Normalization (1NF, 2NF, 3NF, BCNF) — with examples
- [ ] Indexing: B-Tree, Hash, Composite indexes
- [ ] EXPLAIN plan reading
- [ ] Primary Key vs Unique Key vs Foreign Key
- [ ] ACID properties
- [ ] Transactions, isolation levels (Read Uncommitted → Serializable)
- [ ] Deadlocks: causes and prevention
- [ ] Denormalization: when and why

### G. Performance & Optimization
- [ ] Index usage and covering indexes
- [ ] Query optimization techniques
- [ ] N+1 query problem
- [ ] Partitioning vs Sharding (concepts)
- [ ] Connection pooling (HikariCP basics)

---

## Practice Problems (30 Problems)

### Easy
| # | Problem | Concept | Status |
|---|---------|---------|--------|
| 1 | Second highest salary | Subquery / LIMIT OFFSET | ⬜ |
| 2 | Duplicate emails | GROUP BY + HAVING | ⬜ |
| 3 | Customers who never order | LEFT JOIN + NULL | ⬜ |
| 4 | Employees earning more than manager | SELF JOIN | ⬜ |
| 5 | Combine two tables | LEFT JOIN | ⬜ |

### Medium
| # | Problem | Concept | Status |
|---|---------|---------|--------|
| 6 | Nth highest salary | Window Function / Subquery | ⬜ |
| 7 | Rank scores | DENSE_RANK() | ⬜ |
| 8 | Consecutive numbers | LAG() or SELF JOIN | ⬜ |
| 9 | Department highest salary | Window Function | ⬜ |
| 10 | Rising temperature | DATE_DIFF + SELF JOIN | ⬜ |
| 11 | Exchange seats | CASE WHEN + MOD | ⬜ |
| 12 | Monthly active users | DATE functions + COUNT | ⬜ |
| 13 | Pivot table without PIVOT | CASE WHEN aggregation | ⬜ |
| 14 | Running total of transactions | SUM() OVER | ⬜ |
| 15 | Find median | Window functions | ⬜ |

### Hard
| # | Problem | Concept | Status |
|---|---------|---------|--------|
| 16 | Trips and users cancellation rate | Multiple JOINs + CASE | ⬜ |
| 17 | Consecutive available seats | Self Join / Window | ⬜ |
| 18 | Retention/Churn analysis | DATE + Window | ⬜ |
| 19 | Tree node type classification | CASE + subquery | ⬜ |
| 20 | Recursive employee hierarchy | Recursive CTE | ⬜ |

---

## Start Here
Tell me: **"Start SQL"** and we begin with JOIN patterns + window functions.
