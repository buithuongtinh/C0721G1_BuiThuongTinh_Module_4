package vn.codegym.cms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.cms.model.Province;
@Repository
public interface IProvinceRepository extends PagingAndSortingRepository<Province, Long> {
}
