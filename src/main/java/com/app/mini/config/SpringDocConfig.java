package com.app.mini.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Mini API")
                        .description("Spring Mini application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("SpringShop Wiki Documentation")
                        .url("https://springshop.wiki.github.org/docs"));
    }


    @Bean
    public GroupedOpenApi commonApi() {
        return GroupedOpenApi.builder()
                .group("mini-common")
                .pathsToMatch("/common/**")
                .build();
    }

    @Bean
    public GroupedOpenApi cpanApi() {
        return GroupedOpenApi.builder()
                .group("mini-pan")
                .pathsToMatch("/pan/**")
                .build();
    }

    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                .group("mini-admin")
                .pathsToMatch("/admin/**")
//                .addMethodFilter(method -> method.isAnnotationPresent(Admin.class))
                .build();
    }
}
