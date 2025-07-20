package mx.com.santander.hexagonalmodularmaven.product.service;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.Product;
import mx.com.santander.hexagonalmodularmaven.product.port.dao.ProductDao;

@RequiredArgsConstructor
public class ProductByIdService {

    private final ProductDao dao;

    public Product execute(Long id){

        return dao.getById(id);   
    }
}
