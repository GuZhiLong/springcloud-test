package com.gu.project.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MallController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("testSearch")
    public String testSearch(){
        String data = restTemplate.getForEntity("http://PROJECT-SEARCH/search", String.class).getBody();
        return data;
    }
}
