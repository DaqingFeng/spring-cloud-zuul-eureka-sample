package com.techprimers.cloud.client;

import com.techprimers.cloud.model.StudentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fengdaqing on 2018/7/3.
 */
@Configuration
@FeignClient("HELLO-SERVER")
public interface HelloClientFeign {
    @GetMapping("helloServer")
    String hello();

    @PostMapping("GetStudentInfo")
    StudentResponse GetStudentInfo(@RequestParam(name = "name") String name, @RequestParam(name = "Title") String title);
}
