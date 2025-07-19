package mx.com.santander.hexagonalmodularmaven.product.model.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductPrice {

    private BigDecimal price;
}
