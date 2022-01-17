package com.namse.test02.controller;

import com.namse.test02.domain.Report;
import com.namse.test02.domain.ReportParam;
import com.namse.test02.domain.User;
import com.namse.test02.repository.ReportRepository2;
import com.namse.test02.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Controller
public class ReportController {
    @Autowired
    private ReportRepository2 reportRepository2;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/report-save")
    public ResponseEntity SaveReport(@Validated @RequestBody ReportParam reportParam){
        System.out.println("Work : "+reportParam.getUser_id()+"/"+reportParam.getContent());
        Report newReport = new Report();/
        try{
            System.out.println(reportParam.getUser_id());
            Optional<User> selectUser = userRepository.findById(reportParam.getUser_id());
            System.out.println(selectUser.get().getName());
            if(selectUser!=null){
                newReport.setUser_id(selectUser.get());
                newReport.setContent(reportParam.getContent());
                Report result = reportRepository2.save(newReport);
                return ResponseEntity.status(HttpStatus.CREATED).body(result);
            }
            else{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

            }
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);

    }

}
