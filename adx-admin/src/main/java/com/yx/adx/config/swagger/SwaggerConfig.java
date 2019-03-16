package com.yx.adx.config.swagger;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public Docket createApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yx.adx.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    // 创建api的基本信息
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("API接口文档")
                .description("自动生成的哟!")
                .termsOfServiceUrl("http://localhost:8888")
                .version("1.0")
                .build();
    }

}
