package com.gu.project.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectSearchController {

    @RequestMapping("search")
    public String search(){
        String data = "这是第一个SpringCloud项目";
        return data;
    }
}
