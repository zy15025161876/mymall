package com.zhou.mymall.mymallproduct.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement//开启事物
@MapperScan("com.zhou.mymall.mymallproduct.dao")
public class MyBatisConfig {
    //引入分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLimit(500);//设置分页，每页最多500条
        paginationInterceptor.setOverflow(true);//当请求页码大于最大页码，调回首页
        return paginationInterceptor;
    }
}
