package com.portfolio.mgb.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@CrossOrigin (origins = "https://frontend-2002.web.app")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

@Override
public void addCorsMappings(CorsRegistry registry) {
registry.addMapping("/**");
}
}