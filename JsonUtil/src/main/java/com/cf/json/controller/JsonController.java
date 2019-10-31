package com.cf.json.controller;

import com.cf.json.service.JsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

    @Autowired
    public JsonService jsonService;

    @PostMapping("/json")
    public void json(String json){

    }
}
