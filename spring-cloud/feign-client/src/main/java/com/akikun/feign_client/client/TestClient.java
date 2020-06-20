package com.akikun.feign_client.client;

import com.akikun.feign_client.models.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="eureka-client")
public interface TestClient {

    @RequestMapping(method=RequestMethod.GET, value = "/test/order/{id}", consumes = "application/json")
    public Order getOrderById(@PathVariable("id") String id);

}
