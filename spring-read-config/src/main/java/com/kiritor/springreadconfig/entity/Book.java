/**
 * Copyright (C), 2014-2020, xx有限公司
 * FileName: Book
 */
package com.kiritor.springreadconfig.entity;

import lombok.Builder;
import lombok.Data;

/**
 * 〈〉
 *
 * @author lcore
 * @create 2020/7/2
 * @since 1.0.0
 */

@Data
@Builder
public class Book {
    private String id;
    private String name;
    private String description;
}
