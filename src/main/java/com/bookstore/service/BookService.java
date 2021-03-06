package com.bookstore.service;

import com.alibaba.fastjson.JSONObject;
import com.bookstore.entity.Book;

import com.bookstore.entity.BookInfo;
import com.bookstore.entity.BookTag;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public interface BookService {
  List<Book> getBooks();

  PageInfo<Book> getBooksByPage(Integer num);

  Book getBookByBookId(Integer bookId);

  void deleteBookByBookId(Integer bookId);

  void addBook(Map<String, String> params);

  List<Book> getBookByName(String name);

  void updateBook(Map<String,String> params);

  List<BookInfo> getBooksByKeyword(String keyword);

  List<BookTag> getBookTags();

  JSONObject findRelatedBooksByTags(List<String> tagId);

  List<BookTag> getBookTagsById(String bookId);
}
