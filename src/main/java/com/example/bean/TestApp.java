package com.example.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("account-bean-config.xml");

        AccountService accountService = context.getBean(AccountService.class);

        accountService.serveAccount();
    }
}
