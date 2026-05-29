package com.cyx.picturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.cyx.cyxpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class CyxPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyxPictureBackendApplication.class, args);
    }

}
