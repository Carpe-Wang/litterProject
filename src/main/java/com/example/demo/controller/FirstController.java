package com.example.demo.controller;
import com.example.demo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hello")
public class FirstController {
    @Autowired
    private FirstService firstService;
    @GetMapping("world")
    public String demo(){
        return firstService.demo();
    }
}
