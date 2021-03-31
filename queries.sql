## Part 1: Test it with SQL ()

SELECT data_type
FROM information_schema.columns
WHERE table_name = "job";

## Part 2: Test it with SQL

SELECT name
FROM employer
WHERE Location = "St. Louis";


## Part 3: Test it with SQL (write the SQL statement to remove the job table.)


Drop table job;

## Part 4: Test it with SQL
(write a query to return a list of the names and descriptions of all
skills that are attached to jobs in alphabetical order.
If a skill does not have a job listed, it should not be included in the results of this query.)


SELECT skill.name, skill.description
FROM skill
INNER JOIN job_skills on skill.id = job_skills.skills_id
ORDER BY name ASC