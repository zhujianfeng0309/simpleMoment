package com.webpackge.common.configuration;

import com.webpackge.common.util.InetAddressUtil;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * Created by Administrator on 2019/7/9.
 */
@Configuration
public class SwaggerConfiguration implements ApplicationListener<WebServerInitializedEvent> {

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
