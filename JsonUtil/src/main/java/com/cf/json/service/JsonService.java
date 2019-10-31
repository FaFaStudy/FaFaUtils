package com.cf.json.service;

import com.cf.json.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JsonService {

    @Autowired
    public JsonUtil jsonUtil;

    public void jsonparse1(String json){
        jsonUtil.json1(json);
    }

    public void jsonparse2(String json){
        jsonUtil.json2(json);
    }

}
