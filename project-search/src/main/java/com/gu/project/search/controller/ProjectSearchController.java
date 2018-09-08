package com.gu.project.search.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectSearchController {

    public static Logger logger = LoggerFactory.getLogger(ProjectSearchController.class);

    @RequestMapping("search")
    public String search(){
        logger.info("------执行了搜索：search方法");
        String data = "这是第一个SpringCloud项目";
        return data;
    }
}
