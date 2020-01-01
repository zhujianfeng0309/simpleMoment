package com.ali.configuration;

import com.alibaba.dubbo.config.ProviderConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by ZHUJIANFENG on 2019/10/10.
 */
@Configuration
@PropertySource("classpath:/application.yml")
public  class ProviderConfiguration {
    @Bean
    public ProviderConfig providerConfig() {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(1000);
        return providerConfig;
    }
}
