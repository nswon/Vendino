package com.namse.test02.service;


import com.namse.test02.repository.WorkLogRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class WorkLogService {
    @Autowired
    private WorkLogRepository2 workLogRepository2;
}
