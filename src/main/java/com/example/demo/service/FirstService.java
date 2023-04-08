package com.example.demo.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class FirstService {
    public String demo(){
        JSONObject json = new JSONObject();
        json.put("状态是","想死的");
        json.put("精神是","不正常的");
        json.put("你他妈的","是真的傻逼的");
        return json.toJSONString();
    }
}
