# spring-data-jpa-regression

This repo documents a bug in spring data jpa where a repository method that combines a `@Query` 
with implicit `SELECT` with `Pageable` will make the application fail on startup.

See [DemoApplicationTests.java](src/test/java/com/example/demo/DemoApplicationTests.java) for the test that reproduces the issue.

## Steps to reproduce

### Regression

1. Clone this repo
2. Run tests `./mvnw test`


## Notes

- Reverting to Spring Boot 3.4.1 fixes the issue
- Removing paging from the query also fixes the issue
- Adding explicit `SELECT` to the query also fixes the issue
