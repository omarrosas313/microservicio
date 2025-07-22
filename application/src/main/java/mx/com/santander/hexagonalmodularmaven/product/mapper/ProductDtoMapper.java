package mx.com.santander.hexagonalmodularmaven.product.mapper;

import java.math.BigDecimal;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import mx.com.santander.hexagonalmodularmaven.product.model.dto.ProductDto;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.Product;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.ProductId;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.ProductName;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.ProductPrice;
import mx.com.santander.hexagonalmodularmaven.product.model.entity.ProductStock;

@Component
@Mapper(componentModel = "spring")
public interface ProductDtoMapper {

    @Mapping(source="id", target="id")
    @Mapping(source="name", target="name")
    @Mapping(source="price", target="price")
    @Mapping(source="stock", target="stock")
    ProductDto toDto(Product product);

    default Long map(ProductId id){ return id != null ? id.getId() : null; }
    default String map(ProductName name) { return name != null ? name.getName() : null; }
    default BigDecimal map(ProductPrice price) { return price != null ? price.getPrice() : null; }
    default Integer map(ProductStock stock) { return stock != null ? stock.getStock() : null; }
    
}
