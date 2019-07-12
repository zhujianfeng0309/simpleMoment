package com.webpackge.common.configuration;

import com.webpackge.common.util.InetAddressUtil;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/7/9.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration implements ApplicationListener<WebServerInitializedEvent> {
    @Bean
    public Docket productApi(){
        List<ResponseMessage> responseMessages  = Arrays.asList(
                new ResponseMessageBuilder().code(409).message("Conflict").responseModel(new ModelRef("FieldExceptionVO")).build(),
                new ResponseMessageBuilder().code(401).message("Unauthorized").responseModel(null).build(),
                new ResponseMessageBuilder().code(409).message("Forbiddon").responseModel(null).build(),
                new ResponseMessageBuilder().code(409).message("Not Found").responseModel(new ModelRef("ExceptionVO")).build(),
                new ResponseMessageBuilder().code(409).message("Intenal Error").responseModel(new ModelRef("ExceptionVO")).build()
        );
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.webpackge"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo()).useDefaultResponseMessages(true)
                .globalResponseMessage(RequestMethod.POST, responseMessages)
                .globalResponseMessage(RequestMethod.GET, responseMessages)
                .globalResponseMessage(RequestMethod.PUT, responseMessages)
                .globalResponseMessage(RequestMethod.DELETE, responseMessages);

                // 扫描的包路径
                // 定义要生成文档的Api的url路径规则
                // 设置swagger-ui.html页面上的一些元素信息。

    }

    /*private ApiInfo metaData() {
        return new ApiInfoBuilder()
                // 标题
                .title("SpringBoot集成Swagger2")
                // 描述
                .description("这是一篇博客演示")
                // 文档版本
                .version("1.0.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }*/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // .license("Apache License Version 2.0")
                .title("api文档")
                .description("web接口")
                //服务条款网址
                //.termsOfServiceUrl("http://blog.csdn.net/forezp")
                .contact(new Contact("zhujianfeng", "","358008157@qq.com"))
                .version("1.0.0")
                .build();
    }

    private String getAddress(){
        String hostAddress="127.0.0.1";
        String localIP = InetAddressUtil.getLocalIP();
        return StringUtils.isEmpty(localIP) ? hostAddress : localIP;

    }
    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        int serverPort = webServerInitializedEvent.getWebServer().getPort();
        System.err.println("swagger访问地址：http://"+getAddress()+":"+serverPort+"/swagger-ui.html");
    }
}
