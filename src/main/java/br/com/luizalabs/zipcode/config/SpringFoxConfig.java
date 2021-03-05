package br.com.luizalabs.zipcode.config;

import br.com.luizalabs.zipcode.controller.AddressController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
import java.util.List;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        String path = AddressController.class.getPackage().getName();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .securityContexts(Collections.singletonList(securityContext()))
                .securitySchemes(Collections.singletonList(apiKey()))
                .select()
                .apis(RequestHandlerSelectors.basePackage(path))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API search ZIP CODE")
                .description("Performs search for ZIP CODE.")
                .version("1.0")
                .contact(new Contact("Kaike Rodrigo G. E.", null, "kaikerodrigo98@gmail.com"))
                .build();
    }
    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).build();
    }
    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Collections.singletonList(new SecurityReference("JWT", authorizationScopes));
    }

    private ApiKey apiKey() {
        return new ApiKey("JWT", "Authorization", "header");
    }

}
