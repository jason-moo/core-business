package com.xzn.user.config;

import com.xzn.fegin.BusinessErrorDecoder;
import com.xzn.fegin.FeignBasicRequestInterceptor;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public FeignBasicRequestInterceptor feignBasicRequestInterceptor(){
        return new FeignBasicRequestInterceptor();
    }

    @Bean
    public ErrorDecoder errorDecoder(){return new BusinessErrorDecoder(); }


}
