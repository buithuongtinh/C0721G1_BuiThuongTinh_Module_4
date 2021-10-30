package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class ProductService implements IProductService {

    private static Map<Integer,Product> integerProductMap;

    static {
        integerProductMap = new HashMap<>();
        integerProductMap.put(1,new Product(1,"Cam",200,"Màu Vàng","Việt Nam"));
        integerProductMap.put(2,new Product(2,"Táo",200,"Màu đỏ","Canada"));
        integerProductMap.put(3,new Product(3,"Xoài",200,"Màu xanh","Nhật"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(integerProductMap.values());
    }

    @Override
    public void save(Product product) {
        integerProductMap.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return integerProductMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        integerProductMap.put(id, product);
    }

    @Override
    public void remove(int id) {
        integerProductMap.remove(id);
    }

    @Override
    public Product findByName(String name) {
        for (Product find : integerProductMap.values()) {
            if (find.getName().equals(name)) {
                return find;
            }
        }
        return null;
    }
}
