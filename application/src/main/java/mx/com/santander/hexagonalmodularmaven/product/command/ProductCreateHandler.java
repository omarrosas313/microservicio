package mx.com.santander.hexagonalmodularmaven.product.command;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.product.mapper.ProductDtoMapper;
import mx.com.santander.hexagonalmodularmaven.product.model.dto.ProductDto;
import mx.com.santander.hexagonalmodularmaven.product.model.dto.command.ProductCreateCommand;
import mx.com.santander.hexagonalmodularmaven.product.service.ProductCreateService;

@Component
@RequiredArgsConstructor
public class ProductCreateHandler {

    private final ProductCreateService productService;
    private final ProductDtoMapper productMapper;

    public ProductDto execute(ProductCreateCommand productCommand){
        
        return productMapper.toDto( productService.execute(productCommand) );

    }


}
