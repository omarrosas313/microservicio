package mx.com.santander.hexagonalmodularmaven.client.query;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import mx.com.santander.hexagonalmodularmaven.client.mapper.ClientDtoMapper;
import mx.com.santander.hexagonalmodularmaven.client.model.dto.ClientDto;
import mx.com.santander.hexagonalmodularmaven.client.service.ClientByIdService;

@Component
@RequiredArgsConstructor
public class ClientByIdHandler {

    private final ClientByIdService idService;
    private final ClientDtoMapper clientMapper;

    public ClientDto execute(Long id){

        return clientMapper.toDto( idService.execute(id));
    }

}
