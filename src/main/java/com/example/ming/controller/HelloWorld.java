package com.example.ming.controller;

import com.example.ming.entry.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jamy on 2020-04-22
 */
@RestController
public class HelloWorld {


    @RequestMapping("/hello1")
    public String sayHello(){
        Student stud = new Student();
        stud.setName("jamy");
        stud.setSex("男");
        stud.setAge(24);
        stud.setAddress("上海");
        return stud.toString();
    }




}
