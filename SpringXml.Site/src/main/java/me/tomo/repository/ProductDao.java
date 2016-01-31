package me.tomo.repository;

import me.tomo.domain.Product;

import java.util.List;

/**
 * Created by usr0200379 on 15/12/10.
 */
public interface ProductDao {
    Product findProduct();

    List<Product> findAllProduct();
}
