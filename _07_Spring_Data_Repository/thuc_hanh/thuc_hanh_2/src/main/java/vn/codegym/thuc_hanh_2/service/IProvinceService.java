package vn.codegym.thuc_hanh_2.service;

import vn.codegym.thuc_hanh_2.model.Province;

import java.util.List;

public interface IProvinceService {
    List<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
