package com.benrkia.sample.config;

import com.benrkia.core.annotation.Bean;
import com.benrkia.core.annotation.ComponentScan;

@ComponentScan(basePackages = "com.benrkia.sample")
public class AppConfig {

  @Bean(name = "string")
  public String getStr() {
    return "str0";
  }

}
