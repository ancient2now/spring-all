package com.akikun.springboot.service.impl;

import com.akikun.springboot.service.IocService;

public class IocServiceImpl implements IocService {

    @Override
    public String hello() {
        String str = "Hello IOC!";
        System.out.println(str);
        return str;
    }
}
