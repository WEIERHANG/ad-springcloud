package com.imooc.ad.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * 通用配置 消息转换器
 * 将java的对象转成http的数据输出流
 *
 */

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>>
                                                       converters) {

        converters.clear();
        converters.add(new MappingJackson2HttpMessageConverter());
    }
}
