package com.akikun.feign_client.controller;

import com.akikun.feign_client.client.TestClient;
import com.akikun.feign_client.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestClient testClient;

    @RequestMapping("/getOrderById")
    public Order test(){
        return testClient.getOrderById("1");
    }
}
