package com.scarllet.order.service;


import com.scarllet.order.feign.MemberClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderService {




    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MemberClient memberClient;


    /**
     * 使用rest客户端做远程调用 member-server 中的接口 /getUserList
     * @return
     */
    public List<String> getOrderByMemberListRest() {
        return restTemplate.getForObject("http://service-member/getUserList", List.class);
    }


    /**
     * 使用Feign客户端做远程调用 member-server 中的接口 /getUserList
     * @return
     */
    public List<String> getOrderByMembersListFeign() {
        return memberClient.getUserList();
    }

}
