package me.tomo.repository;

import me.tomo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by usr0200379 on 15/12/10.
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private Product product;

    @Override
    public Product findProduct() {
//        Product product = new Product();
////        product.setName("消しゴム");
//        product.setPrice(120);
        return product;
    }

    @Override
    public List<Product> findAllProduct() {
        return jdbcTemplate.query("SELECT * FROM PRODUCT;", (rs, rowNum) -> {
            Product product = new Product();
            product.setId(rs.getInt("ID"));
            product.setName(rs.getString("NAME"));
            product.setPrice(rs.getInt("PRICE"));
            return product;
        });
    }
}
