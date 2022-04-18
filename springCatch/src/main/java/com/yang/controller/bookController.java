package com.yang.controller;


import com.yang.domain.book;
import com.yang.mapper.bookDao;
import com.yang.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class bookController {
@Autowired
private bookService bookService;


@GetMapping("get")
@ResponseBody
public book get(int id)
{
return bookService.getByID(id);
}
}
