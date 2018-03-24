package com.devops.learning.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
 
@RestController
public class HelloWorldController {
 
 @RequestMapping("/")
 public String welcome() {
 return "Welcome to Spring Boot Tutorials";
 }
 
 @RequestMapping("/hello")
 public String myData() {
 return "Hello Spring Boot - Second Push";
 }
}
