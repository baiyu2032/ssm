package cn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*��Ҫ����������Ŀ����junit���ԣ��˴���Ҫʹ��@WebAppConfiguration�����û��ʹ��junitʹ��@Configuration(�ܶ�Ĳ��Ͷ�û��ע��������⣬Ϊ���һ��˷ǳ����ʱ��������)*/
@WebAppConfiguration
@EnableSwagger2//��Ҫ��
@EnableWebMvc
@ComponentScan(basePackages = "cn.controller")//ɨ��control���ڵ�package���޸�Ϊ��control����package
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("����Ľӿ��ĵ�")
                .description("һ���ţ�Ƶ�swagger")
                .version("1.0.0")
                .termsOfServiceUrl("")
                .license("")
                .licenseUrl("")
                .build();
    }
}
