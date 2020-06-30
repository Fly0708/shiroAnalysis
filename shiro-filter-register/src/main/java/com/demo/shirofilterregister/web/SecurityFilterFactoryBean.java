package com.demo.shirofilterregister.web;

import com.demo.shirofilterregister.web.filter.SecurityFilter;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author huangQiChang
 * @date 2020/6/30
 */
public class SecurityFilterFactoryBean implements FactoryBean<SecurityFilter> {
    @Override
    public SecurityFilter getObject() {
        return new SecurityFilter();
    }

    @Override
    public Class<?> getObjectType() {
        return SecurityFilter.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
