package com.tjx.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by dell on 2017/3/13.
 */
public class Provider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "dubbo-provider.xml" });
        context.start();

        System.out.println("Dubbo provider start...");

        try {
            //输入流阻塞模拟
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
