package vn.codegym.repository;

import vn.codegym.model.Email;

import java.util.List;

public interface EmailRepository {
    List<Email> findAll();
}
