package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/")
    public String hello()
    {
        return "Hello git : feature";
    }

    @RequestMapping("/first")
    public String firstEndPoint()
    {
        return "Hello firstendPointgit ";
    }

    @RequestMapping("/second")
    public String secondEndPoint() {
        return "Hello secondendPointgit to main  ";

    }

    @RequestMapping("/third")
    public String thirdEndPoint()
    {
        return "Hello thirdendPointgit ";
    }

}
