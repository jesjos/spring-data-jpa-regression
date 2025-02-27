package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestTableRepository extends JpaRepository<TestTable, Long> {
    @Query("from TestTable where id = :id")
    Page<TestTable> doQuery(Long id, Pageable pageable);
}
