package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 马士兵 · 项目架构部--www
 * @version V1.0
 * @date: 2021/6/15 14:50
 * @company 马士兵（北京）教育科技有限公司 (http://www.mashibing.com/)
 * @copyright 马士兵（北京）教育科技有限公司 · 项目架构部
 */
@SpringBootApplication
@EnableEurekaServer
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
