package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.SecondService;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Random;

@RestController
public class SecondController {
    @Autowired
    private SecondService secondService;
    @PostMapping("login")
    public String login(@RequestParam(defaultValue = "emptyUsername") String userName, @RequestParam(required = true,defaultValue = "emptyPassword") String password){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success",true);
        jsonObject.put("欢迎使用该系统",userName);
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("success",false);
        jsonObject1.put("无权使用该系统",userName);
        return secondService.login(userName,password)? jsonObject.toJSONString():jsonObject1.toJSONString();
    }

    @PostMapping("reg")
    public String reg(@RequestParam(defaultValue = "emptyUsername") String userName, @RequestParam(required = true,defaultValue = "emptyPassword") String password){
        HashMap hashMap = new HashMap<>(2);
        hashMap.put("username",userName);
        hashMap.put("password",password);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Token",secondService.reg(hashMap));
        return jsonObject.toJSONString();
    }
}
