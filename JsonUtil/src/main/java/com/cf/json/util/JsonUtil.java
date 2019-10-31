package com.cf.json.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cf.json.entity.Ding;
import com.cf.json.entity.Document;
import com.cf.json.entity.Operator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenfa
 * 处理json数据
 */

@Service
public class JsonUtil {

    public  List<Ding> json1(String json){
        JSONObject obj1 = JSONObject.parseObject(json);
        //处理表单信息
        String message = obj1.getString("form_component_values");
        System.out.println(message);
        List<Ding> ding = JSON.parseArray(message, Ding.class);
        System.out.println(ding.size());
        System.out.println(ding.get(0).getValue());
        System.out.println(ding.get(19).getValue());
        //处理附件信息
        String doc=ding.get(19).getValue();
        List<Document> document = JSON.parseArray(doc, Document.class);
        System.out.println("文件名"+document.get(0).getFileName());
        System.out.println("文件ID"+document.get(0).getFileId());

        return ding;
    }

    public List<Operator> json2(String json){
        JSONObject obj1 = JSONObject.parseObject(json);
        System.out.println(obj1.toJSONString());

        //处理json
        String process_instance = obj1.getString("process_instance");
        System.out.println(process_instance);
        JSONObject obj2 = JSONObject.parseObject(process_instance);
        String message=obj2.getString("operation_records");
        System.out.println(message);
        List<Operator> operates = JSON.parseArray(message, Operator.class);
        System.out.println(operates.size());

        String date=operates.get(0).getDate();
        String remark=operates.get(0).getRemark();
        String userid=operates.get(0).getUserid();
        System.out.println(date);
        System.out.println(remark);
        System.out.println(userid);
        return operates;
    }
}
