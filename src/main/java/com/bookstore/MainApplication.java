package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
/*
 * 
 * 
 * 
 * 
 * How To Implement Pagination Via ROW_NUMBER() Window Function

Description: This application is an example of using ROW_NUMBER() (and COUNT(*) OVER() for counting all elements) window function to implement pagination.

Key points:

use a native query relying on ROW_NUMBER()
we don't return a page as Page or Slice, we return it as List, therefore Pageable is not used
 * 
 * 
 * 
 * 
 * 
 */
