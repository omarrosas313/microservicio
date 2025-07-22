package mx.com.santander.hexagonalmodularmaven.product.query;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.product.mapper.ProductDtoMapper;
import mx.com.santander.hexagonalmodularmaven.product.model.dto.ProductDto;
import mx.com.santander.hexagonalmodularmaven.product.service.ProductByIdService;

@Component
@RequiredArgsConstructor
public class ProductByIdHandler {

    private final ProductByIdService byIdService;
    private final ProductDtoMapper productMapper;

    public ProductDto execute(Long id){
        
        return productMapper.toDto( byIdService.execute(id));
    }

}
