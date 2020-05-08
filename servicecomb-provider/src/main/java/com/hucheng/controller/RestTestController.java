package com.hucheng.controller;

import com.hucheng.service.RestTestService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author HuChan
 */
@RestSchema(schemaId = "restTestController")
@RequestMapping(value = "/provider")
public class RestTestController {

    @Autowired
    private RestTestService testService;

    @GetMapping(path = "/hello")
    public String test(@RequestParam String name) {
        return testService.testHello(name);
    }
}
