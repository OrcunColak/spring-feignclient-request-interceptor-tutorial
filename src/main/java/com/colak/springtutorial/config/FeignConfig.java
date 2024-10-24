package com.colak.springtutorial.config;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.codec.ErrorDecoder;

@Configuration
public class FeignConfig {

    @Bean
    public RequestInterceptor feignClientAuthInterceptor() {
        return new ForismaticRequestInterceptor();
    }
}

