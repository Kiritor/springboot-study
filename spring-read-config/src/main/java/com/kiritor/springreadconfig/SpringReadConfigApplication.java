package com.kiritor.springreadconfig;

import com.kiritor.springreadconfig.config.LibProperties;
import com.kiritor.springreadconfig.config.ProfileProperties;
import com.kiritor.springreadconfig.config.WebSiteProperties;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(ProfileProperties.class)
public class SpringReadConfigApplication implements InitializingBean {

    private final LibProperties libProperties;
    private final ProfileProperties profileProperties;
    private final WebSiteProperties webSiteProperties;

    public SpringReadConfigApplication(LibProperties libProperties,ProfileProperties profileProperties,WebSiteProperties webSiteProperties) {
        this.libProperties = libProperties;
        this.profileProperties = profileProperties;
        this.webSiteProperties = webSiteProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringReadConfigApplication.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(libProperties.getLocation());
        System.out.println(libProperties.getBooks());
        System.out.println(profileProperties.toString());
        System.out.println(webSiteProperties.toString());

    }
}
