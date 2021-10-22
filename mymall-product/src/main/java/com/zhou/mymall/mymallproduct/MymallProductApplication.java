package com.zhou.mymall.mymallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 整合Mybatiis-Plus
 * 1、导入依赖
 * 2、配置
 * 1）数据源
 *     1、导入数据库的驱动
 *     2）、在application。yml中配置数据源相关的信息
 * 2）配置MyBatisPlus
 *    1、使用@MapperScan扫描包
 *    2、告诉MyBatis-plus,sql映射文件在哪里
 */
@MapperScan("com.zhou.mymall.mymallproduct.dao")
@SpringBootApplication
public class MymallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymallProductApplication.class, args);
    }

}
