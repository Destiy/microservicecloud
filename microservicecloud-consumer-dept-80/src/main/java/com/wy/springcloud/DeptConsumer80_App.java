package com.wy.springcloud;

import com.wy.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author
 * @create 2019-06-27 0:39
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "microservicecloud-dept", configuration = MySelfRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
