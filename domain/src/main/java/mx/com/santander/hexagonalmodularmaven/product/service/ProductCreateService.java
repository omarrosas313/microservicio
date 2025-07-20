package mx.com.santander.hexagonalmodularmaven.product.service;

import mx.com.santander.hexagonalmodularmaven.product.model.dto.command.ProductCreateCommand;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.Product;
import mx.com.santander.hexagonalmodularmaven.product.port.repository.ProductRepository;

public class ProductCreateService {


    private ProductRepository repository;

    public ProductCreateService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product execute( ProductCreateCommand pCommand ){

        Product product = new Product().create(pCommand);

        return repository.create(product);

    }


}
