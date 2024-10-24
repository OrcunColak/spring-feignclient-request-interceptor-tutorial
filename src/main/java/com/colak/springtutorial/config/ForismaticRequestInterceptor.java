package com.colak.springtutorial.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class ForismaticRequestInterceptor implements RequestInterceptor {

    // Another example
    // See https://erkanyasun.medium.com/understanding-clearcontext-in-spring-security-enhancing-application-security-17407ea55b4d
    // @Override
    // public void apply(RequestTemplate template) {
    //   Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    //
    //   if (authentication != null && authentication.getCredentials() != null) {
    //     String token = authentication.getCredentials().toString();
    //     template.header("Authorization", "Bearer " + token);
    //   }
    //  }

    @Override
    public void apply(RequestTemplate template) {
        // Add request parameters
        template.query("method", "getQuote");
        template.query("format", "json");
        template.query("lang", "en");
    }
}
