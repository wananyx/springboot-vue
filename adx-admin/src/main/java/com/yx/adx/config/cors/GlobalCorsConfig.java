package com.yx.adx.config.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        //1.添加CORS配置信息
        CorsConfiguration config = new CorsConfiguration();
        //2.添加允许的域名，不要带*，不然不能使用cookie
        config.addAllowedOrigin("http://192.168.1.179:8888");
        config.addAllowedOrigin("http://www.adxadmin.com");
        //3.是否发送cookie的信息
        config.setAllowCredentials(true);
        //4.允许的请求方式
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("HEAD");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("DELETE");
        config.addAllowedMethod("PATCH");
        //5.
        config.setMaxAge(3600L);
        //6.允许的头信息
        config.addAllowedHeader("*");
        //7.添加映射路径，拦截一切请求
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",config);

        //8.返回新的CorsFilter
        return new CorsFilter(source);

    }

}
