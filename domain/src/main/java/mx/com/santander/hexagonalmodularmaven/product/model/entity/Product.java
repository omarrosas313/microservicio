package mx.com.santander.hexagonalmodularmaven.product.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.product.model.dto.command.ProductCreateCommand;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Product {

    private ProductId id;
    private ProductName name;
    private ProductPrice price;
    private ProductStock stock;

    public Product create( ProductCreateCommand pCommand){
        this.name = new ProductName( pCommand.getName() );
        this.price = new ProductPrice( pCommand.getPrice() );
        this.stock = new ProductStock( pCommand.getStock() );
        return this;
    }
}
 