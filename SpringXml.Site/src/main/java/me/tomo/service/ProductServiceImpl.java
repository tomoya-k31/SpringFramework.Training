package me.tomo.service;

import me.tomo.domain.Product;
import me.tomo.repository.ProductDao;
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
