package com.xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class  HelloWorldMainApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

    //	打包war需要这个启动类，发布到服务器上
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        System.out.print("视频上传项目启动类2.==="+"\n");
        return application.sources(HelloWorldMainApplication.class);
    }

    public static void main(String[] args) {
        //spring 启动起来
        System.out.print("视频上传项目启动类1.==="+"\n");
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
