package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		String app = "    ";
		System.out.println(app.chars().allMatch(Character::isSpaceChar));
	}
}
