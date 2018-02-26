package com.springcloud.eureka.FallBack;

import com.springcloud.eureka.feignser.hiser;
import org.springframework.stereotype.Component;

@Component
public class HystrixFB implements hiser {

    @Override
    public String hi(String name) {
        return "Hystrix FallBack";
    }
}
