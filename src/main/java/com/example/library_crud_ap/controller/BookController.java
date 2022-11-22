package com.example.library_crud_ap.controller;

import com.example.library_crud_ap.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/books")
    public List<Book> listAll() {
        String sql = "SELECT * FROM Book";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Book.class));
    }
}
