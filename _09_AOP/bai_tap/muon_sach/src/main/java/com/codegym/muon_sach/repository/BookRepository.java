package com.codegym.muon_sach.repository;


import com.codegym.muon_sach.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query(value= "update book set quantity = :quantity where id = :idBook", nativeQuery = true)
    @Modifying
    @Transactional
    void updateBook(@Param("quantity") int quantity, @Param("idBook") int idBook);
}