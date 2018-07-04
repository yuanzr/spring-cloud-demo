package com.scarllet.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {


    @Value("${server.port}")
    private String  ServerPort;

    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public List<String> getUserList() {
        List<String> listUser = new ArrayList<String>();
        System.out.println("服务器"+ServerPort+":member服务启动!!");
        listUser.add("zhangsan");
        listUser.add("lisi");
        listUser.add("yuanzr");
        listUser.add(ServerPort);
        return listUser;
    }

    @RequestMapping("/getMemberService")
    public String getMemberService() {
        return "这是Member服务工程";
    }

}

