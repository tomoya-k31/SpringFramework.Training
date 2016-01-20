package me.tomo.repository;

import me.tomo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by usr0200379 on 15/12/10.
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private Product product;

    @Override
    public Product findProduct() {
//        Product product = new Product();
////        product.setName("消しゴム");
//        product.setPrice(120);
        return product;
    }
}
