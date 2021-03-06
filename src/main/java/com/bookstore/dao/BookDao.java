package com.bookstore.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bookstore.entity.Book;

import com.bookstore.entity.BookTag;
import com.github.pagehelper.PageInfo;
import java.util.List;
import java.util.Map;

public interface BookDao {

  Book getBookByBookId(Integer bookId);

  List<Book> getBooks();

  void deleteBookByBookId(Integer bookId);

  void addBook(Map<String, String> params);

  List<Book> getBookByName(String name);

  void updateBook(Map<String, String> params);

  PageInfo<Book> getBooksByPage(Integer num);

  void deleteBookCache(Integer bookId);

  /* 操作mongoDB数据 */
  String getBookImageById(Integer bookId);

  String getBookDescriptionById(Integer bookId);

  void setBookImageById(Integer bookId, String str);

  void setBookDescriptionById(Integer bookId, String str);

  /* 操作neo4j数据 */
  List<BookTag> getBookTags();

  JSONObject findRelatedBooksByTags(List<String> tagId);

  List<BookTag> getBookTagsById(String bookId);
}
