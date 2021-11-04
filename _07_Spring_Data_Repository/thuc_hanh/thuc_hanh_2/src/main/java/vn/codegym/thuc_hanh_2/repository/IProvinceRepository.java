package vn.codegym.thuc_hanh_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.thuc_hanh_2.model.Province;

public interface IProvinceRepository extends JpaRepository<Province, Long> {
}
