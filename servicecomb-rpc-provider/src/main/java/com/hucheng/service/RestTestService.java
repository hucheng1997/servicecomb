package com.hucheng.service;

import com.hucheng.RestTestInterface;
import org.springframework.stereotype.Service;

/**
 * @author HuChan
 */
@Service
public class RestTestService implements RestTestInterface {
    @Override
    public String testHello(String name) {
        return "hello " + name;
    }
}
