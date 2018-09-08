package com.gu.project.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MallController {

    public static Logger logger = LoggerFactory.getLogger(MallController.class);

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("testSearch")
    public String testSearch(){
        logger.info("执行了：testSearch方法");
        String data = restTemplate.getForEntity("http://PROJECT-SEARCH/search", String.class).getBody();
        return data;
    }
}
