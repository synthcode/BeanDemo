package com.qa.bean;

import java.time.LocalTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
    public String timeNow() {
        return LocalTime.now().toString();
    }
}