package me.tomo.service;

import me.tomo.domain.Product;

import java.util.List;

/**
 * Created by usr0200379 on 15/12/10.
 */
public interface ProductService {
    Product getProduct();
    List<Product> selectBookList();
}
