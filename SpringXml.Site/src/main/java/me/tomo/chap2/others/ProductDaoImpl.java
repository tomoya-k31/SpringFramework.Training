package me.tomo.chap2.others;

import me.tomo.chap2.domain.Product;
import me.tomo.chap2.service.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by usr0200379 on 15/12/10.
 */
@Component
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
