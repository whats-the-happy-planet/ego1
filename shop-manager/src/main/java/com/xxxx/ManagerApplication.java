package com.xxxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.xxxx.manager.mapper")
public class ManagerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ManagerApplication.class);
    }
}
