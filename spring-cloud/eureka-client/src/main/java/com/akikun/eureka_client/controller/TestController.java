package com.akikun.eureka_client.controller;

import com.akikun.eureka_client.models.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/order/{id}")
    public Order hello(@PathVariable String id) {

        return new Order() {
            {
                setId(id);
                setName("Apple");
                setCreatedTime(String.valueOf(System.currentTimeMillis()));
                setUpdatedTime(String.valueOf(System.currentTimeMillis()));
            }
        };
    }

}
