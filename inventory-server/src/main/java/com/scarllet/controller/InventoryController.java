package com.scarllet.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {


    @RequestMapping("/getUserList")
    public String getUserList() {
        System.out.println("Order服务 -- 调用 -- member服务 ");
        return "";
    }
    //33

}
