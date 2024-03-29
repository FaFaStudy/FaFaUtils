package com.cf.excel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author chenfa
 * Swagger配置类
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket controllerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(new ApiInfoBuilder()
						.title("Excel工具接口文档")
						.version("版本号:1.0")
						.build())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.cf.excel.config.controller"))
				.paths(PathSelectors.any())
				.build();
	}

}
