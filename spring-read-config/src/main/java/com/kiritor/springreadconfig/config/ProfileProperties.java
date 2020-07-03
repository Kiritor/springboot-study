/**
 * Copyright (C), 2014-2020, xx有限公司
 * FileName: ProfileProperties
 */
package com.kiritor.springreadconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


/**
 * 〈〉
 *
 * @author lcore
 * @create 2020/7/3
 * @since 1.0.0
 */

@ConfigurationProperties("my-profile")
@Validated
@Data
public class ProfileProperties {
    @NotEmpty
    private String name;

    @Email
    @NotEmpty
    private String email;

    private Boolean handsome = Boolean.TRUE;
}