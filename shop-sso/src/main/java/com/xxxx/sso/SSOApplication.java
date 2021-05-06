package com.xxxx.sso;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * SSO启动类
 *
 * @author zhoubin
 * @since 1.0.0
 */
@SpringBootApplication
//开启dubbo
@EnableDubbo
//扫描mapper接口包
@MapperScan("com.ego.sso.mapper")
public class SSOApplication {
   public static void main(String[] args) {
      SpringApplication.run(SSOApplication.class,args);
   }
}