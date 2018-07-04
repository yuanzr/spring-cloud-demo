package com.scarllet.order.controller;


import com.scarllet.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;


    @RequestMapping("/getUserList")
    public List<String> getUserList() {
        System.out.println("Order服务 -- 调用 -- member服务 ");
        return orderService.getOrderByMemberList();
    }


    @RequestMapping("/getOrderService")
    public String getOrderService() {
        return "这是Order服务工程";
    }

}
