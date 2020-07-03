/**
 * Copyright (C), 2014-2020, xx有限公司
 * FileName: WebSiteProperties
 */
package com.kiritor.springreadconfig.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 〈〉
 *
 * @author lcore
 * @create 2020/7/3
 * @since 1.0.0
 */

@Data
@Component
@PropertySource(value = {"classpath:config/website.yml"}, encoding = "utf-8")
public class WebSiteProperties {
    @Value("${title}")
    private String tilte;
    @Value("${url}")
    private String url;
}
