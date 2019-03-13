package com.training.magang.ecommerce.member;

import com.training.magang.ecommerce.member.model.ApiKeyHandlerMethodArgumentResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootApplication
public class Application implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new ApiKeyHandlerMethodArgumentResolver());
    }

    public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
