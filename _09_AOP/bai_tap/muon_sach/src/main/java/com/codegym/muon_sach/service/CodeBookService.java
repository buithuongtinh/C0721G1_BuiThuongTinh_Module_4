package com.codegym.muon_sach.service;

import com.codegym.muon_sach.model.CodeBook;

public interface CodeBookService {
    void saveCodeBook(CodeBook codeBook);

    CodeBook findByNumberBook(int numberBook);

    void removeCodeBook(int numberBook);
}
