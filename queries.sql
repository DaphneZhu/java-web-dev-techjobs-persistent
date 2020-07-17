Queries.sql
## Part 1: Test it with SQL
SELECT *
FROM tech_jobs.job;

## Part 2: Test it with SQL
SELECT name
FROM tech_jobs.employer
WHERE location = St. Louis City;

## Part 3: Test it with SQL

DROP TABLE tech_jobs.job;

## Part 4: Test it with SQL

SELECT name, description
FROM tech_jobs.skill
INNER JOIN tech_jobs.job
ON tech_jobs.skill.name = tech_jobs.job.name
WHERE name NOT NULL;
