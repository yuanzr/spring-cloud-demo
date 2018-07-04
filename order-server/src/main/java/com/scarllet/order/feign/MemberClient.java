package com.scarllet.order.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "service-member")
public interface MemberClient {
    /**
     * 使用feign调用,
     * feign集成ribbo后是默认开启服务负载均衡的
     * @return
     */
    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    public List<String> getUserList();
}
