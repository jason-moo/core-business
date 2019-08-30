package com.xzn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

/**
 * @Author xuezn
 * @Date 2019年07月30日 14:34:08
 */
@SpringBootApplication(exclude = JtaAutoConfiguration.class)
//@EnableEurekaClient
//@EnableFeignClients(basePackages = "com.xzn.**.api")

@MapperScan(basePackages = "com.xzn.shop.mapper")

public class ShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopApplication.class);
    }

}
