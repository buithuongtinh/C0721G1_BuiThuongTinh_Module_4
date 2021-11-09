package com.codegym.muon_sach.service;

import com.codegym.muon_sach.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    void saveBook(Book book);
    Book findById(int id);
    void updateBook(int quantity, int id);
}
