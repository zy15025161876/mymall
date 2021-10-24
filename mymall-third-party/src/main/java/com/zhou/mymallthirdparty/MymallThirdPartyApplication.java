package com.zhou.mymallthirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MymallThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallThirdPartyApplication.class, args);
    }

}
