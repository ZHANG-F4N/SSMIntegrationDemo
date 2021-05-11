package com.zhang.service;

import com.zhang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {

    int addBook(Books book);
    //删除一本书
    int deleteBookByID(int ID);
    //更新一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookByID(int ID);

    List<Books> queryAllBooks();

    List<Books>  queryBookByName(String bookName);
}
