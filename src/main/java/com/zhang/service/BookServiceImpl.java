package com.zhang.service;

import com.zhang.dao.BookMapper;
import com.zhang.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //Service调Dao层:组合Dao
    private BookMapper bookMapper;
    //编写Set方法,要进行注入,实现IOC AOP
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookByID(int ID) {
        return bookMapper.deleteBookByID(ID);
    }

    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    public Books queryBookByID(int ID) {
        return bookMapper.queryBookByID(ID);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }

}
