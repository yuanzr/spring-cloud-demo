package com.scarllet.configclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${usernamemy}")
    private String username;

    @RequestMapping("/getUsername")
    public String getUsername(){
        System.out.println(username);
        return username;
    }
}
