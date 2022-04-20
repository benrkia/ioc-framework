package com.benrkia;

import com.benrkia.core.ApplicationContext;
import com.benrkia.sample.config.AppConfig;
import com.benrkia.sample.service.UserService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ApplicationContext(AppConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
    }
}
