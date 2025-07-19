package mx.com.santander.hexagonalmodularmaven.product.port.dao;

import java.util.List;

import mx.com.santander.hexagonalmodularmaven.product.model.entity.Product;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.ProductName;

public interface ProductDao {

    Product getById(Long id);
    Product getByName(ProductName name); // -revisar como se haria este metodo correctamente.-
    List<Product> getAll();


}
