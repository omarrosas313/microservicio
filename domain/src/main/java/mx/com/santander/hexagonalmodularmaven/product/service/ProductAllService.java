package mx.com.santander.hexagonalmodularmaven.product.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.Product;
import mx.com.santander.hexagonalmodularmaven.product.port.dao.ProductDao;

@RequiredArgsConstructor
public class ProductAllService {

    private final ProductDao dao;

    public List<Product> execute(){

        return dao.getAll();
    }
}
