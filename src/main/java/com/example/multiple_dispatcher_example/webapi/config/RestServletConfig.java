package com.example.multiple_dispatcher_example.webapi.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "com.example.multiple_dispatcher_example.webapi")
@Order(-10)
public class RestServletConfig {
}
