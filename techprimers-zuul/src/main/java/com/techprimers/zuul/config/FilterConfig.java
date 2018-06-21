package com.techprimers.zuul.config;

import com.techprimers.zuul.filter.ErrorFilter;
import com.techprimers.zuul.filter.PostFilter;
import com.techprimers.zuul.filter.PreFilter;
import com.techprimers.zuul.filter.RouteFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fengdaqing on 2018/6/21.
 */
@Configuration
public class FilterConfig {
    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
}
