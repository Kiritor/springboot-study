/**
 * Copyright (C), 2014-2020, xx有限公司
 * FileName: BookController
 */
package com.example.sprintboothelloworld.controller;

import com.example.sprintboothelloworld.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 〈书籍API〉
 *
 * @author lcore
 * @create 2020/7/2
 * @since 1.0.0
 */

@RestController
@RequestMapping("/api")
public class BookController {
    private List<Book> books = new ArrayList<Book>();
    Book book = Book.builder()
            .id("1")
            .name("SpringBoot实践")
            .description("实践书籍")
            .build();

    @GetMapping("/book/{id}")
    public ResponseEntity<List<Book>> getBookByName(@PathVariable("id") String name) {
        books.add(book);
        List<Book> results = books.stream().filter(book -> book.getId().equals(name))
                .collect(Collectors.toList());
        return ResponseEntity.ok(results);

    }

}
