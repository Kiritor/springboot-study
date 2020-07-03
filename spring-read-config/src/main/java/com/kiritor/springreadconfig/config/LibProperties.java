/**
 * Copyright (C), 2014-2020, xx有限公司
 * FileName: Lib
 */
package com.kiritor.springreadconfig.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 〈〉
 *
 * @author lcore
 * @create 2020/7/2
 * @since 1.0.0
 */

@Component
@ConfigurationProperties(prefix = "lib")
@Data
public class LibProperties {

    private String location;

    private List<Book> books;

    @Setter
    @Getter
    @ToString
    static class Book {
        String name;
        String description;
    }
}
