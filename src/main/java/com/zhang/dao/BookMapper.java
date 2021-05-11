package com.zhang.dao;

import com.zhang.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBookByID(@Param("bookId") int ID);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookByID(@Param("bookId") int ID);
    //查询全部的书
    //也可以使用注解写SQL,但有的复杂Sql不好写
    //@Select("select * from  ssmbuild.books")
    List<Books> queryAllBooks();

    List<Books> queryBookByName(String bookName);
}

