package vn.codegym.cms.service.customer;


import vn.codegym.cms.model.Customer;
import vn.codegym.cms.model.Province;
import vn.codegym.cms.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}