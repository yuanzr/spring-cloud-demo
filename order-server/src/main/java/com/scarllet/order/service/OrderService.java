package com.scarllet.order.service;


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
    RestTemplate restTemplate;

    /**
     * 使用rest做远程调用
     * @return
     */
    public List<String> getOrderByMemberList() {
        return restTemplate.getForObject("http://service-member/getUserList", List.class);
    }


}
