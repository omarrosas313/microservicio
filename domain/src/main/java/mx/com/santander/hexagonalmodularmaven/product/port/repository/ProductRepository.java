package mx.com.santander.hexagonalmodularmaven.product.port.repository;

import mx.com.santander.hexagonalmodularmaven.product.model.entity.Product;

public interface ProductRepository {

    Product create(Product product);
    void delte(Long id);
    Product update(Product product);

}
