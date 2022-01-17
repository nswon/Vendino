package com.namse.test02.repository;

import com.namse.test02.domain.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository2 extends JpaRepository<Report, Long> {

}
