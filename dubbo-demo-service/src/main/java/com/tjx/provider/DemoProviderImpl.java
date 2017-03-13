package com.tjx.provider;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created by dell on 2017/3/13.
 */

@Service(protocol = "dubbo", interfaceClass = DemoProvider.class)
public class DemoProviderImpl implements DemoProvider {
    @Override
    public String sayHi(String name) {
        return "Hi, " + name;
    }
}
