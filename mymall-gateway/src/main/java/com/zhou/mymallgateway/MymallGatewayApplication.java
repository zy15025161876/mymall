package com.zhou.mymallgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//排除数据源相关的配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MymallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallGatewayApplication.class, args);
    }

}
