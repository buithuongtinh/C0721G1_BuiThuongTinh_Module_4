package com.codegym.muon_sach.repository;


import com.codegym.muon_sach.model.CodeBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface CodeBookRepository extends JpaRepository<CodeBook, Integer> {
    CodeBook findByNumberBook(int numberBook);

    @Transactional
    void removeCodeBookByNumberBook(int numberBook);
}
