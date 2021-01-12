package com.ntt.config;


import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ntt.domain.OrdersDomain;
import com.ntt.service.*;
import com.ntt.repository.*;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ApplicationConfiguration{
    @Bean
    OrdersService OrdersService(){
        return new OrdersService();
    }

    @Bean
    OrdersRepository OrdersRepository() {
		return new OrdersRepository();
	}

	@Bean
	OrdersDomain getOrdersDomain(
			@Qualifier("OrdersRepository") OrdersRepository OrdersRepository) {
		return new OrdersDomain(OrdersRepository);
	}

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.ntt.controller")).build().apiInfo(apiInfo());
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("pizzaFactory")
                .license("").licenseUrl("http://unlicense.org").termsOfServiceUrl("").version("1.0.0")
                .contact(new Contact("", "", "")).build();
    }
}