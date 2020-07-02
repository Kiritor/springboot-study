/**
 * Copyright (C), 2014-2020, xx有限公司
 * FileName: Book
 */
package com.example.sprintboothelloworld.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 〈书籍类〉
 *
 * @author lcore
 * @create 2020/7/2
 * @since 1.0.0
 */

@Builder
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Book {
    private String id;
    private String name;
    private String description;
}
