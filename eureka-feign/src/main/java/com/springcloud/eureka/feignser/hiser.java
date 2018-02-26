package com.springcloud.eureka.feignser;

import com.springcloud.eureka.FallBack.HystrixFB;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "SERVICE-CLIENT", fallback = HystrixFB.class)
public interface hiser {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}
