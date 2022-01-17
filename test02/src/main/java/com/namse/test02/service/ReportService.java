package com.namse.test02.service;

import com.namse.test02.repository.ReportRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ReportService {
    @Autowired
    private ReportRepository2 reportRepository2;
}
