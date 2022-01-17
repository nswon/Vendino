package com.namse.test02.controller;

import com.namse.test02.domain.WorkLog;
import com.namse.test02.repository.WorkLogRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class WorkController {
    @Autowired
    private WorkLogRepository2 workLogRepository2;

    @PostMapping("/work-save")
    public ResponseEntity SaveWorkLog(@Validated @RequestBody WorkLog workLog){
        System.out.println("Work : "+workLog.getUser_id()+"/"+workLog.getStart_latitude());
        WorkLog result = workLogRepository2.save(workLog);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
