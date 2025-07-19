package mx.com.santander.hexagonalmodularmaven.product.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {

    private ProductId id;
    private ProductName name;
    private ProductPrice price;
    private ProductStock stock;

}
 