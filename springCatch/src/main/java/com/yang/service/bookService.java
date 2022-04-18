package com.yang.service;

import com.yang.domain.book;
import com.yang.mapper.bookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookService {
    @Autowired
    private com.yang.mapper.bookDao bookDao;
    public book getByID(int id)
    {
        return bookDao.getById(id);
    }
}
