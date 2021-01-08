package com.ntt.config;

import com.ntt.domain.PizzaDomain;
import com.ntt.repository.PizzaRepository;
import com.ntt.service.PizzaService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class ApplicationConfiguration{
    @Bean
    PizzaService PizzaService(){
        return new PizzaService();
    }

    @Bean
    PizzaRepository PizzaRepository(){
        return new PizzaRepository();
    }

    @Bean
    PizzaDomain getPizzaDomain(@Qualifier("PizzaService") PizzaService PizzaService,
                                   @Qualifier("PizzaRepository") PizzaRepository PizzaRepository){
        return new PizzaDomain(PizzaService, PizzaRepository);
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