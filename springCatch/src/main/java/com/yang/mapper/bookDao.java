package com.yang.mapper;


import com.yang.domain.book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface bookDao {

    book getById(Integer id);


}
