package com.example.demo.service;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Service
public class SecondService {
    static ArrayList<String> usernameDB = new ArrayList<>();
    static ArrayList<String> passwordDB = new ArrayList<>();
    static {
        usernameDB.add("carpewang");
        usernameDB.add("201916070422");
        passwordDB.add("wkp502943");
        passwordDB.add("wkp5029431");
    }
    public boolean login(String userName,String password){
        return usernameDB.contains(userName.toString()) && passwordDB.contains(password.toString());
    }
    public String reg(HashMap hashMap){
        JwtBuilder jwtBuilder = Jwts.builder();
        return jwtBuilder.setSubject("注册中")
                .setIssuedAt(new Date())
                .setId("1")
                .addClaims(hashMap)
                .setExpiration(new Date(System.currentTimeMillis() + 5000))
                .signWith(SignatureAlgorithm.HS256, "qianfeng")
                .compact();
    }
}
