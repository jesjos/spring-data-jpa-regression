# spring-data-jpa-regression

This repo documents a bug in spring data jpa where a repository method that combines a `@Query` 
with implicit `SELECT` with `Pageable` will make the application fail on startup.

## Steps to reproduce
