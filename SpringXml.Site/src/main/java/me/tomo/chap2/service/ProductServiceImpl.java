package me.tomo.chap2.service;

import me.tomo.chap2.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by usr0200379 on 15/12/10.
 */
@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProduct() {
//        throw new RuntimeException("");
        return productDao.findProduct();
    }
}
