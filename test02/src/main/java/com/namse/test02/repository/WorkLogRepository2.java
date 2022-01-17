package com.namse.test02.repository;

import com.namse.test02.domain.WorkLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkLogRepository2 extends JpaRepository<WorkLog, Long> {

}
