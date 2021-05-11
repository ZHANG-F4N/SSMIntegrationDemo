package com.zhang.controller;

import com.zhang.pojo.Books;
import com.zhang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //Controller层调Service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部数据,并返回到一个书籍的展示页面
    @RequestMapping("/allBook")
    public String bookList(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("list",books);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public  String addBook(Books books){
        System.out.println("addBook->"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id,Model model){
        Books books = bookService.queryBookByID(id);
        model.addAttribute("Qbooks",books);
        return "updateBook";
    }

    //修改书籍的请求
    @RequestMapping("/updateBook")
    public  String updateBook(Books books){
        System.out.println("updateBook->"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    //删除书籍的请求
    @RequestMapping("/delBook/{bookId}")
    public  String delBook(@PathVariable("bookId") int id){
        System.out.println("delBook->"+id);
        //delBook->4
        bookService.deleteBookByID(id);
        return "redirect:/book/allBook";
    }

    //按名查询
    @RequestMapping("/queryBook")
    public String queryBookByName(String queryBookName,Model model){
        List<Books> books = bookService.queryBookByName(queryBookName);
        //List<Books> books = bookService.queryAllBooks();
        model.addAttribute("list",books);
        return "allBook";
        //return "redirect:/book/allBook";
    }

}
