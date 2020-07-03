package com.akikun.springboot;

import com.akikun.springboot.service.IocService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:app-ioc.xml");
        IocService iocService = context.getBean(IocService.class);
        iocService.hello();
    }
}
