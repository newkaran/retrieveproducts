package com.hexa.retrieveproducts.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This class is to configure Swagger for the project.
 * @author Prabhakaran V  
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
 
  /** 
   *  This Class is to Configure Swagger in project.
   * @return Docket
   */
  @Bean
  public Docket productApi() {
    return new Docket(DocumentationType.SWAGGER_2)
            .select().apis(RequestHandlerSelectors.basePackage(
            "com.hexa.retrieveproducts.controller"))
    .paths(regex("/products.*"))
                .build();
  }
}