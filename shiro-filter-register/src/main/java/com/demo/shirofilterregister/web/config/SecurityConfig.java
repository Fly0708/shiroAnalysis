package com.demo.shirofilterregister.web.config;

import com.demo.shirofilterregister.web.SecurityFilterFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

/**
 * @author huangQiChang
 * @date 2020/6/30
 */
@Configuration
public class SecurityConfig {

  @Bean(name = "securityFilter")
  public SecurityFilterFactoryBean securityFilterFactoryBean() {
    return new SecurityFilterFactoryBean();
  }

  @Bean
  public FilterRegistrationBean filterRegistrationBean() {
    FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
    filterRegistration.setFilter(new DelegatingFilterProxy("securityFilter"));
    filterRegistration.addInitParameter("targetFilterLifecycle", "true");
    filterRegistration.setEnabled(true);
    filterRegistration.addUrlPatterns("/*");
    return filterRegistration;
  }
}
