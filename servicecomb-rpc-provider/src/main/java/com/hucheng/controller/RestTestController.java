package com.hucheng.controller;

import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.hucheng.service.RestTestService;

/**
 * @author HuChan
 */
@RpcSchema(schemaId = "rpcTestController")
@RequestMapping(value = "/provider")
public class RestTestController {

    @Autowired
    private RestTestService testService;

    @GetMapping(path = "/hello")
    public String test(@RequestParam String name) {
        return testService.testHello(name);
    }
}
