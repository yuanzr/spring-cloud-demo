package com.scarllet.order.controller;


import com.scarllet.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController2 {

    @Autowired
    private OrderService orderService;
    //order2

    @RequestMapping("/getUserListRest")
    public List<String> getUserListRest() {
        System.out.println("Order服务(rest客户端) -- 调用 -- member服务 ");
        return orderService.getOrderByMemberListRest();
    }

    @RequestMapping("/getUserListFeign")
    public List<String> getUserListFeign() {
        System.out.println("Order服务(Feign客户端) -- 调用 -- member服务 ");
        return orderService.getOrderByMembersListFeign();
    }


    @RequestMapping("/getOrderService")
    public String getOrderService() {
        return "这是Order服务工程";
    }

}
