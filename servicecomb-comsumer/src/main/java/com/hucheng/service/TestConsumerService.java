package com.hucheng.service;

import com.hucheng.RestTestInterface;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author HuChan
 */
@Service
public class TestConsumerService implements RestTestInterface {

    private RestTemplate restTemplate = RestTemplateBuilder.create();

    @Override
    public String testHello(String name) {
        String serviceName = "servicecomb-provider";
        String result = restTemplate.getForObject("cse://" + serviceName + "/provider/hello?name=" + name, String.class);
        return result;
    }
}
