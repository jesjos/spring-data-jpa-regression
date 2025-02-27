package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestTableRepository extends JpaRepository<TestTable, Long> {
    @Query("from TestTable where id = :id")
    Page<TestTable> doesNotWork(Long id, Pageable pageable);

    @Query("from TestTable where id = :id")
    List<TestTable> works(Long id);
}
