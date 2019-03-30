package com.pigbaby.framework.config;

import com.pigbaby.framework.testpackage.TestBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * BeanConfiguration
 */
@Configuration
public class BeanConfiguration {
    @Bean(name="testbean",destroyMethod = "clean")
    public TestBean getTestBean(){
        return new TestBean();
    }
}