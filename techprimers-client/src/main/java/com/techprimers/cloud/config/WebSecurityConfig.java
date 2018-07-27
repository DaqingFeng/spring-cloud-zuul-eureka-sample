package com.techprimers.cloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by fengdaqing on 2018/7/27.
 */
@Profile("secure")
@Configuration
@Order(Ordered.LOWEST_PRECEDENCE - 8)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()                    //  定义当需要用户登录时候，转到的登录页面。
                .and()
                .authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
                .anyRequest()               // 任何请求,登录后可以访问
                .authenticated();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                .withUser("sa").password("sa123456").roles("USER");
    }
}
