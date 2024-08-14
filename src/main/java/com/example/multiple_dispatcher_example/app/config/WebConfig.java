package com.example.multiple_dispatcher_example.app.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Bean("jsonMessageConverter")
    public MappingJackson2HttpMessageConverter jsonMessageConverter(
            ObjectMapper objectMapper) {
        MappingJackson2HttpMessageConverter bean = new MappingJackson2HttpMessageConverter();
        bean.setObjectMapper(objectMapper);
        return bean;
    }

    @Bean("objectMapper")
    public ObjectMapper objectMapper() {
        Jackson2ObjectMapperFactoryBean bean = new Jackson2ObjectMapperFactoryBean();
        bean.setDateFormat(stdDateFormat()); // (2)
        bean.afterPropertiesSet();
        return bean.getObject();
    }

    @Bean
    public StdDateFormat stdDateFormat() {
        return new StdDateFormat();
    }

    @Override
    public void configureMessageConverters(
            List<HttpMessageConverter<?>> converters) {
        converters.add(jsonMessageConverter(objectMapper()));
    }


}
