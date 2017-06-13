package com.customerflow.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * description:
 * </p>
 * Created on 2017/6/9 13:37
 *
 * @author leiguang
 */
@Configuration
@EnableWebMvc
@EnableSwagger2 //Loads the spring beans required by the framework
@ComponentScan("com.customerflow.controller")
@PropertySource("classpath:swagger.properties")
public class WebAppConfig {
}
