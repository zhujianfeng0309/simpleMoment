package com.webpackge.common.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/7/13.
 */
@Configuration
@EnableCaching
public class GuavaCacheConfig {
   /* @Bean
    public CacheManager cacheManager() {
        *//*GuavaCacheManager cacheManager = new GuavaCacheManager();
        cacheManager.setCacheBuilder(
                CacheBuilder.newBuilder().
                        expireAfterWrite(10, TimeUnit.SECONDS).
                        maximumSize(1000));
        return cacheManager;*//*
        GuavaCacheManager guavaCacheManager = new GuavaCacheManager();
        guavaCacheManager.setCacheBuilder(CacheBuilder.newBuilder()
                .expireAfterWrite(3600, TimeUnit.SECONDS).maximumSize(1000));
        ArrayList<String> guavaCacheNames = Lists.newArrayList();
        guavaCacheNames.add("guavaDemo");
        guavaCacheManager.setCacheNames(guavaCacheNames);
        return guavaCacheManager;
    }*/
}

