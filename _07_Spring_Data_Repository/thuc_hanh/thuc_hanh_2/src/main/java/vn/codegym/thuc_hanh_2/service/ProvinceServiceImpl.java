package vn.codegym.thuc_hanh_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.thuc_hanh_2.model.Province;
import vn.codegym.thuc_hanh_2.repository.IProvinceRepository;

import java.util.List;

@Service
public class ProvinceServiceImpl implements IProvinceService{

    @Autowired
    private IProvinceRepository iProvinceRepository;

    @Override
    public List<Province> findAll() {
        return this.iProvinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return this.iProvinceRepository.findById(id).get();
    }

    @Override
    public void save(Province province) {
        this.iProvinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        this.iProvinceRepository.deleteById(id);
    }
}
